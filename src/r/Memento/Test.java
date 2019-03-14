package r.Memento;

public class Test {
    /***
     *
     * @param args
     *      适用性
     *
     *     1.必须*存一个对象在某一个时刻的(部分)状态,这样以后需要时它才能恢复到先前的状态。
     *
     *     2.如果一个用接口来让其它对象直接得到这些状态，将会暴露对象的实现细节并破坏对象的封装性。
     */
    public static void main(String[] args) {
        Originator org = new Originator();
        org.setState("开会中");

        Caretaker ctk = new Caretaker();
        ctk.setMemento(org.createMemento());//将数据封装在Caretaker

        org.setState("睡觉中");
        org.showState();//显示

        org.setMemento(ctk.getMemento());//将数据重新导入
        org.showState();
    }

}
