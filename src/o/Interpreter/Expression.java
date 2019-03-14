package o.Interpreter;

class AdvanceExpression extends Expression {

    void interpret(Context ctx) {
        System.out.println("这是高级解析器!");
    }
}

class SimpleExpression extends Expression {

    void interpret(Context ctx) {
        System.out.println("这是普通解析器!");
    }
}
