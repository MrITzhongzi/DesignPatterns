package g.Bridge;

class Jacket extends Clothing {

    public void personDressCloth(Person person) {
        System.out.println(person.getType() + "穿马甲");
    }
}

class Trouser extends Clothing {

    public void personDressCloth(Person person) {
        System.out.println(person.getType() + "穿裤子");
    }
}
