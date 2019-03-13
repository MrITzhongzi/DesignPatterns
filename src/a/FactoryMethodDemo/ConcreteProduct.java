package a.FactoryMethodDemo;

class StudentWork implements Work {
    @Override
    public void doWork() {
        System.out.println("学生写作业!");
    }
}

class TeacherWork implements Work {

    public void doWork() {
        System.out.println("老师审批作业!");
    }

}

