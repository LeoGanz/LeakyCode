package multiclass.siblings;

import java.util.HashMap;
import java.util.Map;

public class ClassB {
    public static void staticLeak(HashMap<String, String> json) {
        System.out.println(json);
    }

    private Map<String, String> json;

    public ClassB() {
        json = new HashMap<>();
    }

    public void setJson(Map<String, String> json) {
        this.json = json;
    }

    public String getFromMap(String stringKey) {
        return json.get(stringKey);
    }
}
