package w.Visitor;

class FloatElement implements Visitable {

    private Float fe;

    public FloatElement(Float fe) {
        this.fe = fe;
    }

    public Float getFe() {
        return this.fe;
    }

    public void accept(Visitor visitor) {
        visitor.visitFloat(this);
    }
}

class StringElement implements Visitable {

    private String se;

    public StringElement(String se) {
        this.se = se;
    }

    public String getSe() {
        return this.se;
    }

    public void accept(Visitor visitor) {
        visitor.visitString(this);
    }
}
