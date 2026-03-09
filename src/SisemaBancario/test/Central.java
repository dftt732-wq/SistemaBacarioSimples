package SisemaBancario.test;

import SisemaBancario.dominio.Conta;

import java.util.ArrayList;

import java.util.Scanner;

public class Central {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList<>();

        //sistema inicial
        while (true) {
            System.out.println("-----------");
            System.out.println("[1]CRIAR CONTA");
            System.out.println("[2]TRANSFERIR");
            System.out.println("[3]SACAR");
            System.out.println("[4]INFORMAÇÕES CONTA");
            System.out.println("[5]EXIT");
            System.out.println("ESCOLHA:");
            int inicio = entrada.nextInt();
            System.out.println("-----------");

            //logica criar conta

            if (inicio == 1){
                System.out.println("ESCOLHA O NOME DA CONTA:");
                String nomeConta = entrada.next();
                System.out.println("SALDO INICIAL:");
                double saldoInicial = entrada.nextDouble();
                Conta conta = new Conta(nomeConta,saldoInicial);
                contas.add(conta);
            }
            if (inicio == 4){
                System.out.println("qual conta acessar");





            }


        }
    }
}