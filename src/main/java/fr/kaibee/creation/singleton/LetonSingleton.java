package fr.kaibee.creation.singleton;

public class LetonSingleton {
    private static LetonSingleton instance;

    private LetonSingleton() {
    }

    public static LetonSingleton getInstance() {
            // T2
            // T1
        if (instance == null) {
            instance = new LetonSingleton();
        }
        return instance;
    }

}
