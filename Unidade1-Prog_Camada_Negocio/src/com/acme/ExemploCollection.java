package com.acme;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ExemploCollection {

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList(); //object list
        list.add("Ijuí");
        list.add(50);
        list.add(list);
        
        ArrayList<String> nomes = new ArrayList();
        nomes.add("Pedro");
        nomes.add("Rafael");
        //nomes.add(78);
        foo(nomes);
                
    }
    
    public static void foo(ArrayList<String> v) {
        
        for(String n: v) {
            System.out.println(n.length());
        }
    }
    
}
