package com.cunzai;

/**
 * @author: wuchenfeng
 * 日期 2020/10/29 16:54
 */
public class test {

    static {
        num = 2;
        number = 20;
//        System.out.println(num);
//            System.out.println(number);    //报错：非法的前向引用（可以赋值，但不能调用）
    }
        private static int num = 1;

        private static int number = 10;      //linking之prepare: number = 0 --> initial: 10 --> 20



        public static void main(String[] args) {
            System.out.println(test.num);//2
            System.out.println(test.number);//10
        }

}
