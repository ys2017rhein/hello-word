package com.ys.enumTest;

enum FreshJuiceSize{SMALL, MEDIUM, LARGE};

public class EnumTest {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.LARGE;//获取类中的枚举
        System.out.println(juice.size);
        System.out.println(FreshJuiceSize.MEDIUM);//获取枚举
    }
}
