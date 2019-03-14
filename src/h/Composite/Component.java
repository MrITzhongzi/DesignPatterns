package h.Composite;

import java.util.List;

abstract class Employer {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void add(Employer employer);

    public abstract void delete(Employer employer);

    public List employers;

    public void printInfo() {
        System.out.println(name);
    }

    public List getEmployers() {
        return this.employers;
    }
}
