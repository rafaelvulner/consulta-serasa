package com.consultaserasa;

public class Consulta {

    private static Pessoa pessoa = new Pessoa();

    public void alterarStatusNome(boolean status){

        pessoa.alterarStatus(status);
    }

    public void verificarStatus(){

        pessoa.isClean();
    }
}
