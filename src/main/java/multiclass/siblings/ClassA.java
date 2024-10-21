package multiclass.siblings;

import java.util.HashMap;

public class ClassA {

    public static final HashMap<String, String> JSON = new HashMap<>();

    public static void main(String[] args) {
        ClassB.staticLeak(JSON);
        ClassA a = new ClassA();
        a.updateB();
        a.taint();
    }

    private final ClassB b;

    public ClassA() {
        b = new ClassB();
    }

    private void updateB() {
        b.setJson(JSON);
    }

    private void taint() {
        String stringKey = "field_oauth_token";
        b.getFromMap(stringKey);
    }
}
