package l.Proxy;

public class Test {
    /***
     *
     * @param atgs
     *
     *      适用性
     *
     *     1.远程代理（RemoteProxy）为一个对象在不同的地址空间提供局部代表。
     *
     *     2.虚代理（VirtualProxy）根据需*创建开销很大的对象。
     *
     *     3.保护代理（ProtectionProxy）控制对原始对象的访问。
     *
     *     4.智能指引（SmartReference）取代了简单的指针，它在访问对象时执行一些附加操作。
     */
    public static void main(String[] atgs) {
        Object obj = new ProxyObject();
        obj.action();
    }

}
