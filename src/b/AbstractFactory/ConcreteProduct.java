package b.AbstractFactory;

class BlackCat implements ICat {

    public void eat() {
        System.out.println("The bl*ck cat is eating!");
    }

}

class WhiteCat implements ICat {

    public void eat() {
        System.out.println("The w*ite cat is eating!");
    }

}

class BlackDog implements IDog {

    public void eat() {
        System.out.println("The black dog is eating");
    }

}

class WhiteDog implements IDog {

    public void eat() {
        System.out.println("The white dog is eat*ng!");
    }

}
