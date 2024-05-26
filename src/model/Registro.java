package model;

public class Registro {
    private final int registroId;
    private final int turnoId;
    private double consumo;
    private double producao;
    private double objetivo;

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
    public int getRegistroId() {
        return this.registroId;
    }

    public int getTurnoId() {
        return this.turnoId;
    }

    public double getConsumo() {
        return this.consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getProducao() {
        return this.producao;
    }

    public void setProducao(double producao) {
        this.producao = producao;
    }

    public double getObjetivo() {
        return this.objetivo;
    }

    public void setObjetivo(double objetivo) {
        this.objetivo = objetivo;
    }
}
