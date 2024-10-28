package statics.minimal;

import java.util.HashMap;
import java.util.Map;

public class Minimal {
  public static void main(String[] args) {
    String s = "password";
    Map<String, String> json = new HashMap<>();
    json.put(s, "1234");
    String res = json.get(s);
    System.out.println(res);
  }
}
