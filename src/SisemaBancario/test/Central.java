package SisemaBancario.test;

import SisemaBancario.dominio.Conta;

import java.util.ArrayList;

import java.util.Scanner;
//ainda faltam algumas coisas para finalizar e melhorar
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
                //não manjo como faz para impedir de colocar letras e não vou pegar a solução do chat gpt
                System.out.println("ESCOLHA O NOME DA CONTA:");
                String nomeConta = entrada.next();
                System.out.println("SALDO INICIAL:");
                double saldoInicial = entrada.nextDouble();
                Conta conta = new Conta(nomeConta,saldoInicial);
                contas.add(conta);
                System.out.println(conta.getId());
            }else if (inicio == 2){
                System.out.println("voce deseja transferir de qual conta (id)");
                int idContaDeTranferencia = entrada.nextInt();
                System.out.println("qual conta deve receber (id)");
                int idContaReceber = entrada.nextInt();
                Conta receber = contas.get(idContaReceber);
                System.out.println("QUAL O VALOR A TRANSFERIR");
                int valorDeTransferencia = entrada.nextInt();
                contas.get(idContaDeTranferencia).transferir(receber,valorDeTransferencia);
            }else if (inicio == 3){
                System.out.println("DE QUAL CONTA DEVE SER SACADA(ID)");
                int contaSacar = entrada.nextInt();
                System.out.println("VALOR A SER SACADO");
                double valorASacar = entrada.nextDouble();
                contas.get(contaSacar).sacar(valorASacar);
            }else if (inicio == 4){
                System.out.println("ESCOLHA O ID DA CONTA");
                for (Conta conta:contas) {
                    System.out.println(conta.getId()+" "+conta.getNome());
                }
                int idconta = entrada.nextInt();
                contas.get(idconta).imprime();
            }else if (inicio == 5){
                System.out.println("SEÇÃO ENCERRADA");
                break;
            }
        }
    }
}