package p.Iterator;

public class Test {
    /***
     *
     * @param args
     *
     *      适用性
     *
     *     1.访问一个聚合对象的内容而无需暴露它的内部表示。
     *
     *     2.支持对聚合对象的多种遍历。
     *
     *     3.为遍历不同的聚合结构提供一*统一的接口(即,支持多态迭代)。
     */
    public static void main(String[] args) {

        List list = new ListImpl();
        list.add("a");
        list.add("b");
        list.add("c");
        //第一种迭代方式
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("=====");
        //第二种迭代方式
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }

    }
}
