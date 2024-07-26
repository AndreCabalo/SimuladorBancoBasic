package com.andrecabalo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = "Andre Cabalo";
        String tipoConta = "Corrente";
        double saldoEmConta = 5060.00;

        int opcaoSelecionada = 0;

//Dados iniciais do cliente
        System.out.printf("""
                *********************************************
                Dados inícias do cliente:
                
                Nome: %s
                Tipo da conta: %s
                Saldo inicial: R$ %.2f                
                *********************************************
                
                """,nome,tipoConta,saldoEmConta);


        while(opcaoSelecionada != 4) {
//Menu operações
        System.out.println("""
                Operações
                
                1- Consultar saldos
                2- Saque
                3- Depositar
                4- Sair
                
                Digite a opção desejada: 
                """);
        opcaoSelecionada = scanner.nextInt();

        switch (opcaoSelecionada){
            case 1:
                System.out.println("Consultando o saldo");
                System.out.println("Seu saldo atual é de : R$ " + saldoEmConta );
                break;
            case 2:
                System.out.println("Sacando dinheiro");
                System.out.println("Digite o valor que deseja sacar: (usando virgula e MÃO PONTO)");
                double valorASacar = scanner.nextDouble();
                if(valorASacar <= saldoEmConta){
                    saldoEmConta -= valorASacar;
                    System.out.printf("Seu atual saldo é de : R$ %.2f:", saldoEmConta);
                }else {
                    System.out.println("Saldo indisponivel");
                }
                break;
            case 3:
                System.out.println("Depositando dinheiro");
                System.out.println("Digite o valor que deseja depositar: (UTILIZE VIRGULA e não ponto)");
                double valorADepositar = scanner.nextDouble();
                saldoEmConta += valorADepositar;
                System.out.printf("Seu atual saldo é de : R$ %.2f %n", saldoEmConta);
                break;
            case 4:
                System.out.println("Saindo da aplicação...");
                break;
        }

        }

    }





}