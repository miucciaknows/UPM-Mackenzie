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
public class TesteConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaCorrente cc = new ContaCorrente(111, 1111, "João da Silva", 200.0);
        cc.exibirDados();
        cc.deposita(1000.0);
        System.out.println("Saldo atualizado da c/c: " + cc.saldo + "\n");
        
        ContaPoupanca cp = new ContaPoupanca(222, 2222, "Maria Souza", 3000.0);
        cp.exibirDados();
        cp.saca(1000.0);
        System.out.println("Saldo atualizado da c/p: " + cp.saldo);
    }
    
}
