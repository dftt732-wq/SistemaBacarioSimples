package SisemaBancario.dominio;

public class Conta {
    private String nome;
    private double saldo;
    private double saldoRetirado = 0;
    private static int contadorID = 0;
    private int id;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        this.id = contadorID;
        contadorID++;
    }
    public void imprimeIDeNome(){
        System.out.println(this.id);
        System.out.println(this.nome);
    }

    private boolean temsaldo(double valor) {
        if (valor<=0){
            return false;
        }
        if(this.saldo>=valor){
            return true;
        }else{
            System.out.println("a operaçao nao pode ser concluida");
            return false;
        }
    }

    public void sacar (double valor){
        if (temsaldo(valor)){
            this.saldo-=valor;
            saldoRetirado += valor;
        }
    }

    public void transferir(Conta conta,double valor){
        if (temsaldo(valor)){
            sacar(valor);
            conta.depositar(valor);
        }
    }

    public void depositar(double valor){
        if (valor<=0){
            System.out.println("a operaçao nao pode ser concluida");
            return;
        }
        saldo+=valor;
    }

    public void imprime(){
        System.out.println("--------------");
        System.out.println("ID DA CONTA:"+this.id);
        System.out.println("NOME DO USUÁRIO:"+this.nome);
        System.out.println("SALDO EM CONTA:"+this.saldo);
        System.out.println("DINHEIRO SACADO/TRANSFERIDO:"+this.saldoRetirado);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoRetirado() {
        return saldoRetirado;
    }

    @Override
    public String toString() {
        return "id:"+id+" "+"nome:"+this.nome;
    }
}
