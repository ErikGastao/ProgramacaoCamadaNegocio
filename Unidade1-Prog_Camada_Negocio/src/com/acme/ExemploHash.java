package com.acme;

import java.util.HashMap;

public class ExemploHash {

    public static void main(String[] args) {

        HashMap<String, Aluno> dados = new HashMap();

        Aluno al = new Aluno();
        al.setNome("João");

        dados.put("123456", al);
        
        long start = System.nanoTime(); 
        boolean res = dados.containsKey("123456");
        long end = System.nanoTime();
        
        System.out.println("Time --> "+ (end-start));
        
        System.out.println(res);

    }

}
