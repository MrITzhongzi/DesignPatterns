package c.Builder;

public class Test {

    /***
     *
     * @param args
     *
     *      适用性
     *
     *     1.当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时。
     *
     *     2.当构造过程必须允*被构造的对象有不同*表示时。
     */
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person person = pd.constructPerson(new ManBuilder());

        System.out.println(person.getHead());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
    }
}
