package com.consultaserasa;

public class Pessoa {

    private String nome = "Rafael";

    private int idade = 33;

    private double saldoNoBanco = 200.20;

    private boolean nomeLimpo;

    public void isClean() {

        if(this.nomeLimpo){
            System.out.println("O nome do "+this.nome+" está limpo, parabéns!");
        }else{

            System.out.println("O nome do "+this.nome+" está sujo, safado!");
        }

    }

    public void alterarStatus(boolean status){
        this.nomeLimpo = status;
    }

}
