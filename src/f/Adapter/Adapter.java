package f.Adapter;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void adapteeMethod() {
        adaptee.adapteeMethod();
    }

    public void adapterMethod() {
        System.out.println("Adapter method!");
    }
}
