package com.consultaserasa;

public class ExecutarTarefas {

    public static void main(String[] args) {
        Consulta consulta = new Consulta();

        consulta.alterarStatusNome(true);

        consulta.verificarStatus();
    }
}
