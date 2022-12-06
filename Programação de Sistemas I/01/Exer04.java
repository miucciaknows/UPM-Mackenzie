/*
*Armazene em uma variável o preço de um produto. Calcule e apresente 
*o novo preço sabendo-se que este sofreu um desconto de 7,5%.
 */
package exer04;

/**
 *
 * @author Nastya
 */
public class Exer04 {
    public static void main(String[] args) {
        double price;
        double porcentagem;
        double resultado;
        price = 350;
        porcentagem = 7.5;
        resultado = price+(price*porcentagem)/100;
                
        
        
        System.out.println("O preço antigo era de R$: "+price);
        System.out.println("Com o ajuste de 7.5% ficou em R$: "+resultado);
        
        
        
    }
    
}
