package com.ampro.robinhood.endpoint.markets.methods;

import com.ampro.robinhood.Configuration;
import com.ampro.robinhood.endpoint.markets.data.MarketList;
import com.ampro.robinhood.net.ApiMethod;
import com.ampro.robinhood.net.request.RequestMethod;

public class GetMarketData extends ApiMethod {

  public GetMarketData() {
    super(Configuration.getDefault());

    this.setUrlBase(RH_URL + "/markets/");

    // This method is ran as GET
    this.setMethodType(RequestMethod.GET);

    // Declare what the response should look like
    this.setReturnType(MarketList.class);
  }

}
