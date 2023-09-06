package fr.kaibee.dp.visitor;

import fr.kaibee.behavior.visitor.Shape;
import fr.kaibee.behavior.visitor.SquareSpecifique;
import org.junit.jupiter.api.Test;

public class LauncherTest {
    private final External external = new External();

    @Test
    public void run() {
        Shape shape = new SquareSpecifique();
        external.visit(shape);
    }

    private void visit(Shape shape) {
        external.visit(shape);
    }
}
