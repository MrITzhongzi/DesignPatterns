package e.Prototype;

public class Test {

    /***
     *
     * @param args
     *
     *      适用性
     *
     *     1.当一个系统应该独立于它的产品创建、构成和表示时。
     *
     *     2.当要实例化的类是在运行时刻指定时，例如，通过动态装载。
     *
     *     3.为了避免创建一个与产品类层次平行的工厂*层次时。
     *
     *     4.当一个类的实例只能有几个不同状态组合中的一种时。
     */
    public static void main(String[] args) {
        Prototype pro = new ConcretePrototype("prototype");
        Prototype pro2 = (Prototype)pro.clone();
        pro2.setName("哈哈哈哈");
        System.out.println(pro.getName());
        System.out.println(pro2.getName());
    }
}
