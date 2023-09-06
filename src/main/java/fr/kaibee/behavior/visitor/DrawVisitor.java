package fr.kaibee.behavior.visitor;

public class DrawVisitor implements Visitor {
    @Override
    public void visit(Shape shape) {
        shape.draw();
    }

    @Override
    public void visit(Square shape) {
        shape.draw();
    }

    @Override
    public void visit(SquareSpecifique shape) {
        shape.draw();
    }
}
