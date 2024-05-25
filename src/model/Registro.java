package model;

public class Registro {
    private final int registroId;
    private final int turnoId;
    private final double consumo;
    private final double producao;
    private final double objetivo;

    public Registro(int registroId, int turnoId, double consumo, double producao, double objetivo) {
        this.registroId = registroId;
        this.consumo = consumo;
        this.producao = producao;
        this.objetivo = objetivo;
        this.turnoId = turnoId;
    }

    @Override
    public String toString() {
        return "ID: " + this.registroId + ", Consumo: " + this.consumo + ", Produção: " + this.producao + ", Objetivo: " + this.objetivo + ", ID Turno: " + this.turnoId;
    }

    // Getters e Setters
}
