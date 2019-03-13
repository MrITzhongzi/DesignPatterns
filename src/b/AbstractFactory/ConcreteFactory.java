package b.AbstractFactory;

class BlackAnimalFactory implements IAnmalFactory {

    public ICat createCat() {
        return new BlackCat();
    }

    public IDog createDog() {
        return new BlackDog();
    }

}

class WhiteAnimalFactory implements IAnmalFactory {

    public ICat createCat() {
        return new WhiteCat();
    }

    public IDog createDog() {
        return new WhiteDog();
    }

}