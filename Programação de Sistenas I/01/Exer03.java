/*
*João recebeu seu salário e precisa pagar duas contas que estão atrasadas. 
*Como as contas estão atrasadas, João terá que pagar multa de 2% sobre cada conta.
*Calcule e mostre quanto restará do salário de João.
*Atribua valores iniciais para o salário e valor das contas.
 */
package exer03;

/**
 *
 * @author 41714849
 */
public class Exer03 {
    public static void main(String[] args) {
        double conta_um;
        double conta_dois;
        double salario;
        double contatt;
        double restodaconta;
        conta_um = 1200;
        conta_dois = 100;
        salario = 9500;
        contatt = (conta_um+conta_dois)*1.02;
        restodaconta = (salario-contatt);
        
        System.out.println("Com as contas pagas, o que sobra do salario de João é: " + restodaconta);
        
        
        
        
        
        
        
        
               
              
        
    }
    
}
