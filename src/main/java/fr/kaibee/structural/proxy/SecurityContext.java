package fr.kaibee.structural.proxy;

import java.nio.file.Path;

public class SecurityContext {

    private static boolean authorized;

    public static void setAuthorized(boolean authorized) {
        SecurityContext.authorized = authorized;
    }

    public static boolean hasAccessTo(Path path) {
        return authorized;
    }
}
