package br.com.fiapride.model;

public class Carro {

    // Atributos privados (Encapsulamento)
    private String individuo;
    private String placa;
    private double gasolina;

    // Construtor garantir que a gasolina não comece negativa
    public Carro(String individuo, String placa, double gasolinaInicial) {
        this.individuo = individuo;
        this.placa = placa;
        setGasolina(gasolinaInicial);
    }

    // Método Abastecer
    public void adicionarGasolina(double quantidade) {
        if (quantidade > 0) {
            this.gasolina += quantidade;
            System.out.println("Sucesso: " + quantidade + "L adicionados.");
        } else {
            System.out.println("Erro: Quantidade inválida para abastecimento.");
        }
    }

    // Método Gastar combustível
    public void gastarGasolina(double quantidade) {
        if (quantidade > 0 && this.gasolina >= quantidade) {
            this.gasolina -= quantidade;
            System.out.println("Viagem realizada.");
        } else {
            System.out.println("Alerta: Combustível insuficiente.");
        }
    }

    // Encapsulamento e Blindagem
    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getGasolina() {
        return gasolina;
    }

    // Blindagem para impedir valor negativo
    public void setGasolina(double gasolina) {       
        if (gasolina < 0) {
            this.gasolina = 0;
        } else {
            this.gasolina = gasolina;
        }
    }
}