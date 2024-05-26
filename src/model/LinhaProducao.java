package model;

public class LinhaProducao {
    private final int linhaId;
    private final String nome;

    public LinhaProducao(int linhaId, String nome) {
        this.linhaId = linhaId;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ID: " + this.linhaId + ", Nome: " + this.nome;
    }

    // Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public int getId() {
        return this.linhaId;
    }
}
