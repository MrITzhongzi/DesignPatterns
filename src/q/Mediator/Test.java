package q.Mediator;

public class Test {
    /***
     *
     * @param args
     *
     *      适用性
     *
     *     1.一组对象以定义良好但是复杂的方式进行通信。产生的相互依赖关系结构混乱且难以理解。
     *
     *     2.一个对象引用其他很多对象并且直接与这些对象通信,导致难以复*该对象。
     *
     *     3.想定制一个分布在多个类中的行为，*又不想生成太多的子类。
     */
    public static void main(String[] args) {
        Mediator med = new ConcreteMediator();
        //老板来了
        med.notice("boss");

        //客户来*
        med.notice("client");

    }
}
