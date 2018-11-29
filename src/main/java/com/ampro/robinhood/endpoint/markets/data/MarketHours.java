package com.ampro.robinhood.endpoint.markets.data;

import com.ampro.robinhood.endpoint.ApiElement;

public class MarketHours implements ApiElement {

  String closes_at;
  String extended_opens_at;
  String next_open_hours;
  String previous_open_hours;
  Boolean is_open;
  String extended_closes_at;
  String date;
  String opens_at;

  public String getClosesAt() {
    return closes_at;
  }

  public String getExtendedOpensAt() {
    return extended_opens_at;
  }

  public String getNextOpenHours() {
    return next_open_hours;
  }

  public String getPreviousOpenHours() {
    return previous_open_hours;
  }

  public Boolean getIsOpen() {
    return is_open;
  }

  public String getExtendedClosesAt() {
    return extended_closes_at;
  }

  public String getDate() {
    return date;
  }

  public String getOpensAt() {
    return opens_at;
  }

  @Override
  public String toString() {
    return "MarketHours [closes_at=" + closes_at + ", extended_opens_at=" + extended_opens_at
        + ", next_open_hours=" + next_open_hours + ", previous_open_hours=" + previous_open_hours
        + ", is_open=" + is_open + ", extended_closes_at=" + extended_closes_at + ", date=" + date
        + ", opens_at=" + opens_at + "]";
  }

}
