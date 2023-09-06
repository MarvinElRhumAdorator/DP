package fr.kaibee.creation;

public final class PierreSingleton {
    private static final PierreSingleton instance = new PierreSingleton();

    private PierreSingleton() {
    }

    public static PierreSingleton getInstance() {
        return instance;
    }

}
