package h.Composite;

import java.util.List;

public class Test {
    /***
     *
     * @param args
     *      适用性
     *
     *     1.你想表示对象的部分-整体层次结构。
     *
     *     2.你希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。
     */
    public static void main(String[] args) {
        Employer pm = new ProjectManager("项目经理");
        Employer pa = new ProjectAssistant("项目助理");
        Employer programmer1 = new Programmer("程序员一");
        Employer programmer2 = new Programmer("程序员二");

        pm.add(pa);//为项目经理添加项目助理
        pm.add(programmer2);//*项目经理*加程序员

        List ems = pm.getEmployers();
        for (Object em : ems) {
            System.out.println(((Employer) em).getName());
        }
    }
}
