package view;

import model.LinhaProducao;
import model.Registro;
import model.Turno;

public class MainView {
    public static void main(String[] args) {
        // Inicializa e chama as views apropriadas

        // Teste de toString para o Model
        LinhaProducao linhaTeste = new LinhaProducao(1, "Leo");
        Registro registroTeste = new Registro(1, 1, 1.5, 1.6, 1.8);
        Turno turnoTeste = new Turno(1, 1, "Leo");

        System.out.println(linhaTeste);
        System.out.println(registroTeste);
        System.out.println(turnoTeste);
    }
}
