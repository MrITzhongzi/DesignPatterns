package n.Command;

public class Test {
    /***
     *
     * @param args
     *
     *      适用性
     *
     *     1.抽象出待执行的动作以参数化某对象。
     *
     *     2.在不同的时刻指定、排列和执行请求。
     *
     *     3.支持取消操作。
     *
     *     4.支持修改日志，这样当系统崩溃时，这*修改可以被重做一遍。
     *
     *     5.用构建在原语操作上的高层操作构造一个系统。
     */
    public static void main(String[] args) {
        Receiver rec = new Receiver();
        Command cmd = new CommandImpl(rec);
        Invoker i = new Invoker();
        i.setCommand(cmd);
        i.execute();
    }
}
