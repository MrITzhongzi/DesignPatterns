package i.Decorator;

public class Test {

    /***
     *
     * @param args
     *      适用性
     *
     *     1.在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责。
     *
     *     2.处理那些可以撤消的职责。
     *
     *     3.当不能采用生成子类的方法进行扩充时。
     */

    public static void main(String[] args) {
        Man man = new Man();
        ManDecoratorA md1 = new ManDecoratorA();
        ManDecoratorB md2 = new ManDecoratorB();

        md1.setPerson(man);
        md2.setPerson(md1);
        md2.eat();
    }

}
