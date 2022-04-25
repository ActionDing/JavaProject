package com.ding.lambda;

public class LambdaTest1 {
    public static void main(String[] args) {

        // 1 lambda 表达式
        ILove love = (int a) -> {
            System.out.println("I Love You" + a);
        };

        // 2 简化1：参数类型
        love = (a) -> {
            System.out.println("I Love You" + a);
        };

        // 3 简化2：小括号
        love = a -> {
            System.out.println("I Love You" + a);
        };

        // 4 简化3：花括号
        love = a -> System.out.println("I Love You" + a);


    }
}

interface ILove {
    void love(int a);
}

