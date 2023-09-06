package fr.kaibee.dp.visitor;

import fr.kaibee.behavior.visitor.DrawVisitor;
import fr.kaibee.behavior.visitor.Shape;

public class External {
    public External() {
    }

    void visit(Shape shape) {
        DrawVisitor drawVisitor = new DrawVisitor();
        drawVisitor.visit(shape);
    }
}
