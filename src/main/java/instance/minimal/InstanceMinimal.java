package instance.minimal;

import java.util.HashMap;
import java.util.Map;

public class InstanceMinimal {

  private final Map<String, String> json;

  public InstanceMinimal() {
    json = new HashMap<>();
  }

  private void analyze() {
    String stringKey = "field_oauth_token";
    String result = json.get(stringKey);
    System.out.println(result);
  }

  public static void main(String[] args) {
    InstanceMinimal instanceMinimal = new InstanceMinimal();
    instanceMinimal.analyze();
  }
}
