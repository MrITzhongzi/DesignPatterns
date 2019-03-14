package m.ChainOfResponsibility;

public class Test {
   
    private static AbstractLogger getChainOfLoggers(){
  
       AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
       AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
       AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
  
       errorLogger.setNextLogger(fileLogger);
       fileLogger.setNextLogger(consoleLogger);
  
       return errorLogger;  
    }

    /***
     *
     * @param args
     *
     *      适用性
     *
     *     1.有多个的对象可以处理一个请求，哪个对象处理该请求运行时刻自动确定。
     *
     *     2.你*在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。
     *
     *     3.可处理一个请求的对象集合应被动态指定。
     *
     */
    public static void main(String[] args) {
       AbstractLogger loggerChain = getChainOfLoggers();
  
       loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
  
       loggerChain.logMessage(AbstractLogger.DEBUG, 
          "This is a debug level information.");
  
       loggerChain.logMessage(AbstractLogger.ERROR, 
          "This is an error information.");
    }
 }