package com.dio.dados;

//exercicio para praticar conversões
public class Casting {

    public static void main(String[] args) {

        //downcast que perde informação
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;
        System.out.println(b1);

        //upcast sem problemas
        long l1;
        int i1 = 10;
        l1 = i1;
        System.out.println(l1);

        //outro downcast que perde informação
        int i2;
        long l2 = 100000000000000L;
        i2 = (int) l2;
        System.out.println(i2);

        //downcast que ocorre sem problemas por estar no range
        int i3;
        long l3 = 10000000L;
        i3 = (int) l3;
        System.out.println(i3);

        //upcast de float para double
        double d1;
        float f1 = 10.5f;
        d1 = f1;
        System.out.println(d1);


        //dois exemplos de downcast de double para float, o segundo com perda de informação
        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2;
        double d3 = 10000.588888888888888888888888888888888888888888888888888888888888888888888888888888d;
        f3 = (float) d3;
        System.out.println(f2);
        System.out.println(f3);

        //valor fracionado para parte inteira ignora a parte fracionada, truncar
        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4;
        System.out.println(i4);

        //conversões podem ser feitas entre qualquer tipo de dados, mas downcasts podem gerar perda de informação
        b1 = (byte) d3;
        System.out.println(b1);









    }

}
