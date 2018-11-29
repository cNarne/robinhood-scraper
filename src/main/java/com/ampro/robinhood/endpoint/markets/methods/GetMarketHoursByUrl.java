package com.ampro.robinhood.endpoint.markets.methods;

import com.ampro.robinhood.Configuration;
import com.ampro.robinhood.endpoint.markets.data.MarketHours;
import com.ampro.robinhood.endpoint.markets.data.MarketList;
import com.ampro.robinhood.net.ApiMethod;
import com.ampro.robinhood.net.request.RequestMethod;

// TODO: Auto-generated Javadoc
/**
 * The Class GetMarketHoursByUrl.
 *
 * @author Conrad Weiser
 */
public class GetMarketHoursByUrl extends ApiMethod {

  /**
   * Instantiates a new gets the market hours by url.
   *
   * @param url the url
   */
  public GetMarketHoursByUrl(String url) {
    super(Configuration.getDefault());

    this.setUrlBase(url);

    // This method is ran as GET
    this.setMethodType(RequestMethod.GET);

    // Declare what the response should look like
    this.setReturnType(MarketHours.class);
  }

}
