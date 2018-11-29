package com.ampro.robinhood.endpoint.markets.data;

import com.ampro.robinhood.endpoint.ApiElementList;

// TODO: Auto-generated Javadoc
/**
 * A Paginated List of {@link Market}.
 *
 * @author Jonathan Augustine
 */
public class MarketList extends ApiElementList<Market> {
    
    /* (non-Javadoc)
     * @see com.ampro.robinhood.endpoint.ApiElement#requiresAuth()
     */
    @Override
    public boolean requiresAuth() { return false; }
}
