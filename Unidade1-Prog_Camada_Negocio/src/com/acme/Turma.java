package com.acme;

import java.util.ArrayList;

public class Turma {

    //Attributes
    private String codigo;
    private String local;
    private ArrayList<Aluno> alunos;

    //Constructor
    public Turma() {
        alunos = new ArrayList();
    }

    //Operations
    public void add(Aluno a) {
        alunos.add(a);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
