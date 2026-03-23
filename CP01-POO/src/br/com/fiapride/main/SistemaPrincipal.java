package br.com.fiapride.main;

import br.com.fiapride.model.Carro;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Cadastro Veículo
        Carro meuCarro = new Carro("Carlos Silva", "ABC-1234", 10.0);

        // Operações
        meuCarro.adicionarGasolina(40);        
        meuCarro.gastarGasolina(15);   
        meuCarro.setGasolina(-100);    // Tentativa de erro

        // Exibição dos Dados
        System.out.println("\n===== SISTEMA FIAPRIDE: CADASTRO DE FROTA =====");
        System.out.println("MOTORISTA: " + meuCarro.getIndividuo());
        System.out.println("PLACA    : " + meuCarro.getPlaca());
        System.out.println("STATUS   : " + meuCarro.getGasolina() + " litros no tanque.");
        System.out.println("===============================================\n");
    }
}