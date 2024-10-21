package instance.deep;

import java.util.HashMap;
import java.util.Map;

public class Deep {

    public static void main(String[] args) {
        Deep instance = new Deep();
        instance.callLeak();
        instance.harmlessAccess();
    }

    private Map<String, String> jsonInstanceVar;

    public Deep() {
        setup();
    }

    private void setup() {
        jsonInstanceVar = new HashMap<>();
        loadData();
    }

    private void loadData() {
        // loading data
        // ...
        // make sure data is loaded
        taint(jsonInstanceVar);
    }

    private void taint(Map<String, String> jsonParam) {
        String stringKeySensitive = "field_oauth_token";
        String resultSensitive = jsonParam.get(stringKeySensitive);
    }

    private void harmlessAccess() {
        String stringKeyIrrelevant = "irrelevant";
        String resultIrrelevant = jsonInstanceVar.get(stringKeyIrrelevant);
    }

    private void callLeak() {
        leak(jsonInstanceVar);
    }

    private void leak(Object anything) {
        System.out.println(anything);
    }
}
