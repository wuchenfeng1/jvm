package com.order;

/**
 * @author: wuchenfeng
 * 日期 2020/10/29 16:25
 */
public class FatherExcuteOrder {
    static {
        System.out.println("我是父亲静态代码块,静态块，用static关键字声明，JVM加载类时执行，仅执行一次");
    }
    {
        System.out.println("我是父亲实例代码块，类中直接用{}声明，在每次创建对象时执行");
    }

    public static void method(){
        System.out.println("我是父亲静态方法");
    }
    public  void ok(){
        System.out.println("我是父亲实例方法");
    }
    FatherExcuteOrder(){
        System.out.println("我是父亲构造器");
    }
}
