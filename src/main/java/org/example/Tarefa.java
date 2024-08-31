package org.example;

public class Tarefa {
    private String nome;
    private String prazo;
    private boolean concluida;

    public Tarefa(String nome, String prazo) {
        this.nome = nome;
        this.prazo = prazo;
        this.concluida = false;
    }

    public void concluirTarefa() {
        this.concluida = true;
    }

    public void alterarPrazo(String novoPrazo) {
        this.prazo = novoPrazo;
    }

    public boolean isConcluida() {
        return this.concluida;
    }

    public String getNome() {
        return this.nome;
    }

    public String getPrazo() {
        return this.prazo;
    }

    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Estudar Java", "2024-09-01");

        System.out.println("Nome: " + tarefa1.getNome());
        System.out.println("Prazo: " + tarefa1.getPrazo());
        System.out.println("Concluída: " + tarefa1.isConcluida());

        tarefa1.concluirTarefa();
        System.out.println("Tarefa concluída? " + tarefa1.isConcluida());

        tarefa1.alterarPrazo("2024-09-10");
        System.out.println("Novo Prazo: " + tarefa1.getPrazo());
    }
}
