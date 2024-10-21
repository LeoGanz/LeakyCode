package multiclass.inheritance2;

import java.util.HashMap;
import java.util.Map;

public class Child extends Parent {

    public static void main(String[] args) {
        new Child().doAction();
    }

    private final Map<String, Object> json;

    public Child() {
        json = new HashMap<>();
    }

    private void doAction() {
        String stringKey = "secret_key";
        json.put(stringKey, "secret_value");
        leak(json);
    }
}
