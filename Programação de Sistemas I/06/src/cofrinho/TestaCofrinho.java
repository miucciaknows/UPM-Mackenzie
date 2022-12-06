package cofrinho;

/**
 *
 * @author Nastya
 */
public class TestaCofrinho {
    
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho("Nathália");
        
        cofrinho.destrancar();
        
        cofrinho.depositarMoeda10(5);
        cofrinho.depositarMoeda25(2);
        cofrinho.depositarMoeda50(10);
        
        System.out.println("O dono do cofrinho é: " + cofrinho.dono);
        
        System.out.println("A quantidade de moedas de 10 centavos é: " + cofrinho.moedas10);
        System.out.println("A quantidade de moedas de 25 centavos é: " + cofrinho.moedas25);
        System.out.println("A quantidade de moedas de 50 centavos é: " + cofrinho.moedas50);
        
        double total = cofrinho.calcularTotal();
        System.out.println("O valor total do cofrinho é: R$" + total);
        
        double totalDolar = cofrinho.calcularTotalDolar(4.30);
        System.out.println("O valor total do cofrinho em dolar é: $" + totalDolar);
        
        cofrinho.trancar();
    }
    
}
