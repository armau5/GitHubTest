package model;

public class Person {
    private long id;

    public Person(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public Person setId(long id) {
        this.id = id;
        return this;
    }
}
