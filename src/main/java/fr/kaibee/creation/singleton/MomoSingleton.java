package fr.kaibee.creation.singleton;

final public class MomoSingleton {
    private static volatile MomoSingleton instance;

    private MomoSingleton() {
    }

    public static MomoSingleton getInstance() {
        if (instance == null) {
            synchronized (MomoSingleton.class) {
                if (instance == null) {
                    instance = new MomoSingleton();
                }
            }
        }
        return instance;
    }
}
