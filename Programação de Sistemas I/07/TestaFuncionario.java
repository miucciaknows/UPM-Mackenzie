/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

public class TestaFuncionario {
    public static void main(String[] args) { 
        
        Funcionario func1 = new Funcionario("Ana Souza", 1500);
        func1.deptoFunc = "Vendas";
        func1.rgFunc = "97567543-0";
        func1.recebeAumento(20);
        
        System.out.println("\nInformações do 1o funcionario: ");
        func1.exibeInformacoes();
        
        double salarioAnual1 = func1.calculaGanhoAnual();
        System.out.println("Salario Anual: " + salarioAnual1);
        
        
        Funcionario func2 = new Funcionario("Joao da Silva", 2000);
        func2.deptoFunc = "RH";
        func2.rgFunc = "34567543-0";  
        func2.recebeAumento(30);
        
        System.out.println("\nInformações do 2o funcionario: ");
        func2.exibeInformacoes();

        double salarioAnual2 = func2.calculaGanhoAnual();
        System.out.println("Salario Anual: " + salarioAnual2);
    }
}
