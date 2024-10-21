package instance.decoupled;

import java.util.HashMap;
import java.util.Map;

public class InstanceDecoupled {

    private final Map<String, String> json;

    public InstanceDecoupled() {
        json = new HashMap<>();
    }

    public static void main(String[] args) {
        InstanceDecoupled instance = new InstanceDecoupled();
        instance.leak();
        InstanceDecoupled instance2 = new InstanceDecoupled();
        instance2.taint();
    }

    private void taint() {
        String stringKey = "field_oauth_token";
        String result = json.get(stringKey);
    }

    private void leak() {
        System.out.println(json);
    }
}
