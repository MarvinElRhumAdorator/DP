package fr.kaibee.creation.singleton;

public class Service {
    public void doSomething() {
        // .......

        LetonSingleton instance = LetonSingleton.getInstance();
        instance.toString();


        // ...........
    }
}
