package io.github.mainstringargs.robinhood;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.ampro.robinhood.RobinhoodApi;
import com.ampro.robinhood.endpoint.quote.data.TickerQuote;
import com.ampro.robinhood.endpoint.ratings.data.Rating;
import com.ampro.robinhood.endpoint.ratings.data.RatingList;
import com.ampro.robinhood.throwables.RequestTooLargeException;
import com.ampro.robinhood.throwables.TickerNotFoundException;


// TODO: Auto-generated Javadoc
/**
 * The Class RobinhoodFinanceService.
 */
public class RobinhoodFinanceService
    implements io.github.mainstringargs.stockData.spi.StockDataService {


  /** The api. */
  RobinhoodApi api = null;

  /*
   * (non-Javadoc)
   * 
   * @see io.github.mainstringargs.stockData.spi.StockDataService#init()
   */
  public void init() {

    api = new RobinhoodApi();

  }

  /*
   * (non-Javadoc)
   * 
   * @see io.github.mainstringargs.stockData.spi.StockDataService#getServiceName()
   */
  public String getServiceName() {
    return "Robinhood";
  }

  /*
   * (non-Javadoc)
   * 
   * @see io.github.mainstringargs.stockData.spi.StockDataService#getStockData(java.lang.String[])
   */
  public Map<String, Map<String, Object>> getStockData(String... tickers) {

    Map<String, Map<String, Object>> allStockData = new HashMap<String, Map<String, Object>>();



    for (String symbol : tickers) {


      Map<String, Object> stockData = new LinkedHashMap<String, Object>();

      TickerQuote quote = null;
      try {
        quote = api.getQuoteByTicker(symbol);
      } catch (TickerNotFoundException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }

      RatingList ratingList = null;
      try {
        ratingList = api.getRatingsByTickers(symbol);
      } catch (RequestTooLargeException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      if (quote != null)
        stockData.put("Last Trade Price", quote.getLastTradePrice());

      if (ratingList != null) {
        List<Rating> resultList = ratingList.getResults();

        if (resultList != null) {
          Rating singleRating = resultList.get(0);

          if (singleRating != null && singleRating.getSummary() != null) {


            double total = singleRating.getSummary().getNumBuyRatings()
                + singleRating.getSummary().getNumHoldRatings()
                + singleRating.getSummary().getNumSellRatings();

            stockData.put("Num Buy Ratings", singleRating.getSummary().getNumBuyRatings());

            stockData.put("Buy Rating Percentage",
                singleRating.getSummary().getNumBuyRatings() / total);


            stockData.put("Num Hold Ratings", singleRating.getSummary().getNumHoldRatings());

            stockData.put("Hold Rating Percentage",
                singleRating.getSummary().getNumHoldRatings() / total);

            stockData.put("Num Sell Ratings", singleRating.getSummary().getNumSellRatings());

            stockData.put("Sell Rating Percentage",
                singleRating.getSummary().getNumSellRatings() / total);



          }
        }
      }

      allStockData.put(symbol.toUpperCase(), stockData);

    }

    return allStockData;

  }

  // public Map<String, Map<String, Object>> getStockData() {
  // return null;
  //
  // }
}
