package statics.minimal;

import java.util.HashMap;
import java.util.Map;

public class Minimal {
  public static void main(String[] args) {
    String s = "field_oauth_token";
    Map<String, String> json = new HashMap<>();
    String res = json.get(s);
    System.out.println(res);
  }
}
