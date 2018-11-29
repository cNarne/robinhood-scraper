package com.ampro.robinhood.endpoint.markets.data;

import com.ampro.robinhood.endpoint.ApiElement;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Market implements ApiElement {

  @SerializedName("website")
  @Expose
  private String website;

  @SerializedName("city")
  @Expose
  private String city;

  @SerializedName("name")
  @Expose
  private String name;

  @SerializedName("url")
  @Expose
  private String url;

  @SerializedName("country")
  @Expose
  private String country;

  @SerializedName("todays_hours")
  @Expose
  private String todays_hours;

  @SerializedName("operating_mic")
  @Expose
  private String operating_mic;

  @SerializedName("acronym")
  @Expose
  private String acronym;

  @SerializedName("timezone")
  @Expose
  private String timezone;

  @SerializedName("mic")
  @Expose
  private String mic;

  public String getWebsite() {
    return website;
  }

  public String getCity() {
    return city;
  }

  public String getName() {
    return name;
  }

  public String getUrl() {
    return url;
  }

  public String getCountry() {
    return country;
  }

  public String getTodaysHours() {
    return todays_hours;
  }

  public String getOperatingMic() {
    return operating_mic;
  }

  public String getAcronym() {
    return acronym;
  }

  public String getTimezone() {
    return timezone;
  }

  public String getMic() {
    return mic;
  }

  @Override
  public String toString() {
    return "Market [website=" + website + ", city=" + city + ", name=" + name + ", url=" + url
        + ", country=" + country + ", todays_hours=" + todays_hours + ", operating_mic="
        + operating_mic + ", acronym=" + acronym + ", timezone=" + timezone + ", mic=" + mic + "]";
  }



}
