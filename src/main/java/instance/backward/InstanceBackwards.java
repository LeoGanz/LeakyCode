package instance.backward;

import java.util.HashMap;
import java.util.Map;

public class InstanceBackwards {

    private final Map<String, String> json;

    public InstanceBackwards() {
        json = new HashMap<>();
    }

    public static void main(String[] args) {
        InstanceBackwards instance = new InstanceBackwards();
        instance.leak();
        instance.harmlessAccess();
        instance.taint();
    }

    private void taint() {
        String stringKeySensitive = "field_oauth_token";
        String resultSensitive = json.get(stringKeySensitive);
    }

    private void harmlessAccess() {
        String stringKeyIrrelevant = "irrelevant";
        String resultIrrelevant = json.get(stringKeyIrrelevant);
    }

    private void leak() {
        System.out.println(json);
    }
}
