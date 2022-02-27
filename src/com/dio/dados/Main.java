package com.dio.dados;

public class Main {
    public static void main(String[] args) {
//      byte armazena de -128 a 127 | valor default 0
        byte b1 = 20;
        byte b2 = 50;
        byte b3 = 127;

//      short de -32768 a 32767 | valor default 0
        short s1 = 300;
        short s2 = 5000;

//      int de -2147483648 a 2147483647  (inteiros 32 bits) | valor default 0
        int i1 = 340000000;
        int i2 = -340000;

//      long de -9223372036854775808 a 9223372036854775807 (inteiros 64 bits) | valor default 0L
        long l1 = 647826784762874L;
        long l2 = 6473862764873672648L;

//        float são números fracionados de 32 bits | valor default 0f
//        f ao final obrigatorio
        float f1 = 647382648.54f;
        float f2 = 478329748932747389.4f;

//        double números fracionados de 64 bits, d opcional | valor default 0d
        double d1 = 647836248763478392.4;
        double d2 = 47839274893072498730289473284738927.4d;

//        char caractere 16 bit unicode | valor defaul '\u0000'
        char c = '\u0084';
        char c2 = 'B';

//      Strings são do tipo composto, considerados objetos em Java | valor default null
        String st1 = "Texto";
        String st2 = "b";

//      boolean são dados do tipo lógico, true ou false | valor default false
        boolean bo1 = false;
        boolean bo2 = true;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c);
        System.out.println(c2);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(bo1);
        System.out.println(bo2);

    }
}
