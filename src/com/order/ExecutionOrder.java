package com.order;

/**
 * @author: wuchenfeng
 * 日期 2020/10/29 16:09
 */
public class ExecutionOrder {


    static {
        System.out.println("我是静态代码块,静态块，用static关键字声明，JVM加载类时执行，仅执行一次");
    }
    {
        System.out.println("我是实例代码块，类中直接用{}声明，在每次创建对象时执行");
    }

    public static void method(){
        System.out.println("我是静态方法");
    }
    public  void ok(){
        System.out.println("我是实例方法");
    }
    ExecutionOrder(){
        System.out.println("我是构造器");
    }

    public static void main(String[] args) {
        System.out.println("我是main()方法");
        ExecutionOrder executionOrder=new ExecutionOrder();
        executionOrder.ok();
        ExecutionOrder.method();
        ExecutionOrder.method();
//        ExecutionOrder executionOrder1=new ExecutionOrder();
//        executionOrder1.ok();
//        executionOrder1.method();
//        executionOrder1.method();
    }
}
