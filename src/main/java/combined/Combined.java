package combined;

import java.util.HashMap;
import java.util.Map;

public class Combined {

    // static part
    private static Map<String, String> sharedVar;

    public static void main(String[] args) {
        sharedVar = new HashMap<>();
        Combined instance = createInstance();
        instance.leak();
        instance.harmlessAccess();
        taint();
    }

    private static Combined createInstance() {
        return new Combined(sharedVar);
    }

    private static void taint() {
        String stringKeySensitive = "field_oauth_token";
        String resultSensitive = sharedVar.get(stringKeySensitive);
    }

    // instance part

    private final Map<String, String> json;

    public Combined(Map<String, String> json) {
        this.json = json;
    }

    private void harmlessAccess() {
        String stringKeyIrrelevant = "irrelevant";
        String resultIrrelevant = json.get(stringKeyIrrelevant);
    }

    private void leak() {
        System.out.println(json);
    }
}
