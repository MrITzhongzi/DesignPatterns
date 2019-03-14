package s.Observer;

public class Test {
    /***
     *
     * @param args
     *      适用性
     *
     *     1.当一个抽象模型有两个方面,其中一个方面依赖于另一方面。
     *       将这二者封装*独立的对象中以使它们可以各自独立地改变和复用。
     *
     *     2.当对一个对象的改变需要同时改变其它对象,而不知道具体*多少对象有待改变。
     *
     *     3.当一个对象必须通知其它对象，而它又不能假定其它对象是谁。
     */
    public static void main(String[] args) {
        Policeman thPol = new TianHePoliceman();
        Policeman hpPol = new HuangPuPoliceman();

        Citizen citizen = new HuangPuCitizen(hpPol);
        citizen.sendMessage("unnormal");
        citizen.sendMessage("normal");

        System.out.println("===========");

        citizen = new TianHeCitizen(thPol);
        citizen.sendMessage("normal");
        citizen.sendMessage("unnormal");

    }
}
