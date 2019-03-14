package g.Bridge;

class Man extends Person {

    public Man() {
        setType("男人");
    }

    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}

class Lady extends Person {

    public Lady() {
        setType("女人");
    }

    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}
