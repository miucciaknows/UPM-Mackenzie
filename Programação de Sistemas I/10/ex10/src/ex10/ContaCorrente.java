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
public class ContaCorrente extends Conta {
    
    public ContaCorrente(int agencia, int conta, String nomeCliente, double saldo) {
        super(agencia, conta, nomeCliente, saldo);
    }
    
    @Override
    public void deposita(double valor) {
        this.saldo += (valor - 0.10);
    }
}
