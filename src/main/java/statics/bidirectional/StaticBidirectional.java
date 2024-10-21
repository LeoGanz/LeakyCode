package statics.bidirectional;

import java.util.HashMap;
import java.util.Map;

public class StaticBidirectional {

  public static void main(String[] args) {
    Map<String, String> json = new HashMap<>();
    leak(json);
    taint(json);
  }

  private static void taint(Map<String, String> json) {
    String s = "field_oauth_token";
   json.get(s);
  }

  private static void leak(Map<String, String> json) {
    System.out.println(json);
  }
}
