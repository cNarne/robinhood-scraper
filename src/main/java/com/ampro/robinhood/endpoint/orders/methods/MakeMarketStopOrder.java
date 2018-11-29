package com.ampro.robinhood.endpoint.orders.methods;

import java.text.DecimalFormat;
import com.ampro.robinhood.Configuration;
import com.ampro.robinhood.endpoint.fundamentals.data.TickerFundamental;
import com.ampro.robinhood.endpoint.orders.enums.OrderTransactionType;
import com.ampro.robinhood.endpoint.orders.enums.TimeInForce;
import com.ampro.robinhood.throwables.NotLoggedInException;
import com.ampro.robinhood.throwables.TickerNotFoundException;

/**
 * Created by SirensBell on 6/18/2017.
 */
public class MakeMarketStopOrder extends OrderMethod {

    private final String ticker;
    private final int quantity;
    private final OrderTransactionType orderType;
    private final String tickerInstrumentUrl;
    private final TimeInForce time;
    private final float stopPrice;

    /**
     * @param ticker The stock ticker
     * @param quantity The number of elements to order
     * @param orderType {@link OrderTransactionType#BUY} or {@link OrderTransactionType#SELL}
     * @param time The time and/or duration an order will be active.
     * @param stopPrice The stop (activation) price
     * @param config A config holding authentication data
     *
     * @throws TickerNotFoundException If the ticker is not tracked by RH
     * @throws NotLoggedInException If instance is not logged in
     */
    public MakeMarketStopOrder(String ticker, int quantity,
                               OrderTransactionType orderType, TimeInForce time,
                               float stopPrice, Configuration config)
    throws TickerNotFoundException {
        super(config);
        this.ticker = ticker;
        this.quantity = quantity;
        this.orderType = orderType;
        this.time = time;
        this.stopPrice = stopPrice;
        

        //Verify the ticker and add it to the instrument URL to be used for later
        //Verify the ticker, and add the instrument URL to be used for later
        TickerFundamental fund = verifyTickerData(this.ticker);

        this.tickerInstrumentUrl = fund.getInstrument().toString();
          

        //Set the normal parameters for this endpoint
        setEndpointParameters();

        //Set the order parameters
        setOrderParameters();


    }
    

    DecimalFormat df2 = new DecimalFormat("#####.00");


    @Override
    protected void setOrderParameters() {
        this.addFieldParameter("account", this.config.getAccountUrl());
        this.addFieldParameter("instrument", this.tickerInstrumentUrl);
        this.addFieldParameter("symbol", this.ticker);
        this.addFieldParameter("type", "market");
        this.addFieldParameter("time_in_force", this.time.toString());
        this.addFieldParameter("trigger", "stop");
        this.addFieldParameter("quantity", String.valueOf(this.quantity));
        this.addFieldParameter("side", orderType.getValue());
        this.addFieldParameter("stop_price", df2.format(this.stopPrice));
    }

}
