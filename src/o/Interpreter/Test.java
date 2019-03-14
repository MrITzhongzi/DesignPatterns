package o.Interpreter;

public class Test {
    /***
     *
     * @param args
     *
     *      适用性
     *
     *     当有一个语言需要解释执行,并且你可将该语言中的句子表示为一个抽象语法树时，可使
     *     用解释器模式。而当存在*下情况时该模式效果最好：
     *
     *     1.该文法简单对于复杂的文法,文法的*层次变得庞大而无法管理。
     *
     *     2.效率不是一个关键问题最高效的解释器通常不是通过直接解释语法分析树实现的,而是首先将它们转换成另一种形式。
     */
    public static void main(String[] args) {

        Context ctx = new Context();
        ctx.add(new SimpleExpression());
        ctx.add(new AdvanceExpression());
        ctx.add(new SimpleExpression());

        for (Object eps : ctx.getList()) {
            ((Expression)eps).interpret(ctx);
        }
    }

}
