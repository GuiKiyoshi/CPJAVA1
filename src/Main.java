package org.example;

import Veiculo.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var Carro = new Veiculo(

        );


        var Moto = new Veiculo(

        );

        Moto.Ligar();
        Carro.Ligar();

        Moto.Desligar();

        //====Chamar/Invocar - função/Metodo======
        var novoVeiculo1 = CadastrarVeiculo();
        //var novoEletrodomestico2 =CadastrarEletrodomestico();
        //var novoEletrodomestico3 =CadastrarEletrodomestico();

    }

    //====Metodo====
    public static Veiculo CadastrarVeiculo()
    {
        var scanner = new Scanner(System.in);
        var novoVeiculo = new Veiculo();

        System.out.println("Por favor digite a marca do eletrdomestico");
        novoVeiculo.setMarca(scanner.nextLine());

        System.out.println("Agora, digite a nome do eletrodmestico");
        novoVeiculo.setNome(scanner.nextLine());

        System.out.println("Agora, digite a descrição do eletrodmestico");
        novoVeiculo.setDescricao(scanner.nextLine());

        System.out.println("Agora, digite a voltagem do eletrodmestico");
        novoVeiculo.setAno(scanner.nextInt());

        System.out.println(
                "Cadastro concluido: " + novoVeiculo.toString()
        );

        return novoVeiculo;
    }
}