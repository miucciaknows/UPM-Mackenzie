/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

public class Funcionario {
    public String nomeFunc;
    public String deptoFunc;
    public double salarioFunc;
    public String rgFunc;
    
    public Funcionario (String nome, double salario) {
        this.nomeFunc = nome;
        this.salarioFunc = salario;
    }
	
    public void recebeAumento(double percAumento) {
        this.salarioFunc = this.salarioFunc + (this.salarioFunc * (percAumento / 100));
    }
	
    public double calculaGanhoAnual() {
        double ganhoAnual = this.salarioFunc * 12;
        return ganhoAnual;         
    }
    
    public void exibeInformacoes() {
        System.out.println("Nome do funcionario: "+this.nomeFunc);
        System.out.println("Departamento do funcionario: "+this.deptoFunc); 
        System.out.println("Salario do funcionario: "+this.salarioFunc);

   } 
}
