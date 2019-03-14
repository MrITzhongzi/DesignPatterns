package d.Singleton;

public class Test{

    /***
     *
     * @param args
     *
     *      适用性
     *
     *     1.当类只能有一个实例而且客户可以从一个众所周知的访问点访问它时。
     *
     *     2.当这个唯一实例应该是通过子类化可扩展的，并且客户应该无需更改代码就能使用一个扩展的实例时。
     */
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
    }
}
