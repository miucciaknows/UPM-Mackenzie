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
public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(int agencia, int conta, String nomeCliente, double saldo) {
        super(agencia, conta, nomeCliente, saldo);
    }
    
    @Override
    public void saca(double valor) {
        this.saldo -= (valor + (valor * 0.10));
    }
}
