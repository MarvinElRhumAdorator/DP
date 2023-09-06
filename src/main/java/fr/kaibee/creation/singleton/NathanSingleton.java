package fr.kaibee.creation.singleton;

public class NathanSingleton {

    private NathanSingleton() {}

    static private class Holder {
        private static NathanSingleton instance = new NathanSingleton();
    }

    public static NathanSingleton getInstance() {
        return Holder.instance;
    }

}


