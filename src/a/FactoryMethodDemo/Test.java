package a.FactoryMethodDemo;

public class Test {

    /*
        适用性

        1.当一个类不知道它所必须创建的对象的类的时候。

        2.当一个类希望由它的子类来指定它所创建的对象的时候。

        3.当*将创建对象的职责委托给多个帮助*类中的某一个，并且希望将哪一个帮助子类是代理者这一信息局部化的时候。
    */
    public static void main(String[] args) {
        IWorkFactory iWorkFactory1 = new StudentWorkFactory();
        iWorkFactory1.getWork().doWork(); // "学生写作业"

        IWorkFactory iWorkFactory2 = new TeacherWorkFactory();
        iWorkFactory2.getWork().doWork(); // 老师批作业

    }
}
