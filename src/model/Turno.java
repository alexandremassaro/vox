package model;

public class Turno {
    private final int turnoId;
    private final int linhaId;
    private final String nome;

    public Turno(int turnoId, int linhaId, String nome) {
        this.turnoId = turnoId;
        this.linhaId = linhaId;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ID: " + turnoId + ", Nome: " + nome + ", Linha: " + linhaId;
    }

    // Getters e Setters
}
