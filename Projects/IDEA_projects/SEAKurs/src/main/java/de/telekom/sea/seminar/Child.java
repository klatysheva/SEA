package de.telekom.sea.seminar;

public class Child {
    private Object parent;

    public Object getParent() {
        return parent;
    }

    public void setParent(Object parent) {
        System.out.println("New value is set for parent: " + parent);
        this.parent = parent;
    }
}
