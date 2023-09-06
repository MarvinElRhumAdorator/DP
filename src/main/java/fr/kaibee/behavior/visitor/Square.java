package fr.kaibee.behavior.visitor;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("draw Square");
    }

    @Override
    public void accept(Visitor visitor) {

    }
}
