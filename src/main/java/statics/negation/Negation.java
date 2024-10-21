package statics.negation;

import java.util.HashMap;
import java.util.Map;

public class Negation {
  public static void main(String[] args) {
    String s = "Please do not enter secret here";
    Map<String, String> json = new HashMap<>();
    String res = json.get(s);
    System.out.println(res);
  }
}
