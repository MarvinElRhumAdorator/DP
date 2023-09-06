package fr.kaibee.creation.singleton;

final public class MySingleton {

    private MySingleton() {
    }

    private static final class InstanceHolder {
        private static final MySingleton instance = new MySingleton();
    }

    public static MySingleton getInstance() {
        return InstanceHolder.instance;
    }
}
