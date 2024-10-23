package statics.minimal;

import java.util.HashMap;
import java.util.Map;

public class Minimal {
  public static void main(String[] args) {
    String password = "password";
    Map<String, String> json = new HashMap<>();
    json.put(password, "1234");
    String res = json.get(password);
    System.out.println(res);
  }
}
