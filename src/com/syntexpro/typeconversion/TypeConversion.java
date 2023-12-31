package com.syntexpro.typeconversion;

public class TypeConversion {


    //Conversion happens when:
    //1. type compatible
    //2. destination type > source type
    // byte > short > int > float > long > double
    // 8    > 16    > 32  > 32    > 64   > 64


    public static void main(String[] args) {


        // Widening - implicit
        short a = 50;
        double b = a;
        System.out.println(b);

        //Narrowing - explicit
        double c = 50.0;
        long d = (long) c;
        System.out.println(d);




    }
}
