package fr.kaibee.behavior.template;

public abstract class Job {
    public final void execute(String task) {
        Item item = read(task);
        Result result = process(item);
        save(item);
    }

    abstract protected void save(Item item);

    abstract protected Result process(Item item);

    abstract protected Item read(String task);
}
