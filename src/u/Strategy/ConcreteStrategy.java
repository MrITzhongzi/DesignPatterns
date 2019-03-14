package u.Strategy;

 class StrategyImplA extends Strategy {

    public void method() {
        System.out.println("这是第一个实现");
    }
}

class StrategyImplB extends Strategy {

    public void method() {
        System.out.println("这是第二个实现");
    }
}

class StrategyImplC extends Strategy {

    public void method() {
        System.out.println("这是第三个实现");
    }
}
