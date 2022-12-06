/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10;

/**
 *
 * @author 41714849
 */
public class Conta {
    
    protected int agencia;
    protected int conta;
    protected String nomeCliente;
    protected double saldo;
    
    public Conta(int agencia, int conta, String nomeCliente, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    
    public void deposita(double valor) {
        this.saldo += valor;
    }
    
    public void saca(double valor) {
        this.saldo -= valor;
    }
    
    public void exibirDados() {
        System.out.println("Agência: " + this.agencia);
        System.out.println("Conta: " + this.conta);
        System.out.println("Nome: " + this.nomeCliente);
        System.out.println("Saldo: " + this.saldo);
    }
}
