package com.ys.enumTest;

//enum实例
public enum Color {
    LARGE(size), SMALL(size), MEDIUM(size);
    private static String size;

    Color(String size) {
    }


//    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
//    private String name; //成员变量
//    private int index;
//
//    //必重写构造函数
//    Color(String name, int i) {
//        this.name = name;
//        this.index = i;
//    }
}
