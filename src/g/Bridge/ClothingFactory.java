package g.Bridge;

public class ClothingFactory {
    static Clothing getClothing(){
        return new Clothing() {
            @Override
            public void personDressCloth(Person person) {

            }
        };
    }
}
