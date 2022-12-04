package com.erivelton.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {

    public static void main(String[] args) {

        //Dados o valor de um carro, descubra em quantas vezes pode ser parcelado
        //Condicao valorParcela>1000

        double valorTotal = 30000;

        for(int parcela = 1;parcela<= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}