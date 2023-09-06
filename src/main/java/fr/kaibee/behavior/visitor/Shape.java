package fr.kaibee.behavior.visitor;

public interface Shape {
    void draw();
    void accept(Visitor visitor);
}
