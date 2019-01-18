package io.github.mainstringargs.robinhood;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class RobinhoodProperties {

  private static Properties propertyFile;

  static {
    InputStream is = RobinhoodProperties.class.getResourceAsStream("/robinhood-scraper.properties");
    propertyFile = new Properties();
    try {
      propertyFile.load(is);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  public static String getProperty(String key, String defaultValue) {
    return propertyFile.getProperty(key, defaultValue);
  }

}
