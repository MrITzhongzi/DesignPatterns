package f.Adapter;

public class Test {

    /***
     *
     * @param args
     *      适用性
     *
     *     1.你想使*一个已经存在的类，而它的接口不符合你的需求。
     *
     *     2.你想创建一个可以复用的类，该类可以与其他不相关的类或不可预见的类（即那*接口可能不一定兼容的类）协同工作。
     *
     *     3.（仅适用于对象Adapter）你想使用一些已经存在的子类，但是不可能对每一个都进行
     */
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.adapteeMethod();

        target.adapterMethod();
    }

}
