package multiclass.inheritance;

import java.util.HashMap;

public class Child extends Parent {

    private static final HashMap<String, String> json = new HashMap<>();

    public Child() {
        super(json);
    }

    private void taint() {
        String stringKeySensitive = "field_oauth_token";
        String resultSensitive = json.get(stringKeySensitive);
    }

    public static void main(String[] args) {
        new Child().taint();
    }
}
