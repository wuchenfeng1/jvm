package com.order;

/**
 * @author: wuchenfeng
 * 日期 2020/10/29 16:25
 */
public class SonExcuteOrder extends FatherExcuteOrder{
    static {
        System.out.println("我是儿子静态代码块,静态块，用static关键字声明，JVM加载类时执行，仅执行一次");
    }
    {
        System.out.println("我是儿子实例代码块，类中直接用{}声明，在每次创建对象时执行");
    }

    public static void method(){
        System.out.println("我是儿子静态方法");
    }
    @Override
    public  void ok(){
        System.out.println("我是儿子实例方法");
    }
    SonExcuteOrder(){
        System.out.println("我是儿子构造器");
    }
}
