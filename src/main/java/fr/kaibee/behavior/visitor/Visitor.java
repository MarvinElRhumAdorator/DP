package fr.kaibee.behavior.visitor;

public interface Visitor {
    void visit(Shape shape);

    void visit(Square shape);

    void visit(SquareSpecifique shape);
}
