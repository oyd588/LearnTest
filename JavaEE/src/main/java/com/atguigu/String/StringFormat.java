package com.atguigu.String;

public class StringFormat {
    public static void main(String[] args) {

//        %s      -接受一个字符串并按照给定的参数格式化该字符串


//        %d    对整数进行格式化
//        %[index$][标识][最小宽度]转换方式
        int n = 9;
//        [index$]
        System.out.println(String.format("数1：%2$05d,数2：%1$-5d。",5,9)); //数1：00009,数2：5    。
//        [最小宽度]
        System.out.println(String.format("%5d", n));    //默认右对齐，补空格       9
        System.out.println(String.format("%05d",n));    //   右对齐，补      000009
        System.out.println(String.format("%-5d",n));    // - 改为左对齐      9
//        [标识]
//        '+' 包含符号位
        System.out.println(String.format("%+d", -n));    // +9
//        ',' 3位用，分割 ,也算入保留位数中
        System.out.println(String.format("%,d", -123456789)); //123,456,789
//        '(' 负数用()表示 ，而不是 负号
        System.out.println(String.format("%(9d",-999));  //    (999)
//        转换方式
//        d-十进制   o-八进制   x或X-十六进制
//        '#'    只适用于8进制和16进制，8进制时在结果前面增加一个0，16进制时在结果前面增加0x
        System.out.println(String.format("%d",9));  //9
        System.out.println(String.format("%#o",9)); //011
        System.out.println(String.format("%#x",9)); //0x9


    }
}
