package com.acme;

public class ExemploBoxing {

    public static void main(String[] args) {
        //para criar objetos int = new...
        int a = 4;
        a = a + 1; //ou a++
        Integer i = a;
        int [] x;
        x = new int [10];
        System.out.println(a);
        
        Float g = 12.55f;
        int j = g.intValue();
        System.out.println(j);
        
        String b = Integer.toBinaryString(48);
        System.out.println(b);
        //INSTANCIA == OBJETO;
        
        String s = "Ijuí";
        int t = s.length();
        System.out.println(t);
    }
    
}
