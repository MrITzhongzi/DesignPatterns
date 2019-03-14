package h.Composite;

class Programmer extends Employer {

    public Programmer(String name) {
        setName(name);
        employers = null;//程序员, 表示没有下属了
    }

    public void add(Employer employer) {

    }

    public void delete(Employer employer) {

    }
}

class ProjectAssistant extends Employer {

    public ProjectAssistant(String name) {
        setName(name);
        employers = null;//项目助理, 表示没有下属了
    }

    public void add(Employer employer) {

    }

    public void delete(Employer employer) {

    }
}
