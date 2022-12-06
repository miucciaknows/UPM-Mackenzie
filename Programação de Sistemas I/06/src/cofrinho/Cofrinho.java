package cofrinho;

/**
 *
 * @author Nastya
 */
public class Cofrinho {
    
    String dono;
    boolean estado;
    int moedas10;
    int moedas25;
    int moedas50;
    
    Cofrinho() {
    }
    
    Cofrinho(String dono) {
        this.dono = dono;
    } 
    
    public void trancar() {
        this.estado = true;
        System.out.println("O cofrinho está trancado");
    }
    
    public void destrancar() {
        this.estado = false;
        System.out.println("O cofrinho está destrancado");
    }
    
    public void depositarMoeda10(int quant) {
        this.moedas10 += quant;
    }
    
    public void depositarMoeda25(int quant) {
        this.moedas25 += quant;
    }
    
    public void depositarMoeda50(int quant) {
        this.moedas50 += quant;
    }
    
    public double calcularTotal() {
        double total = (0.10 * this.moedas10) + (0.25 * this.moedas25) + (0.50 * this.moedas50);
        return total;
    }
    
    public double calcularTotalDolar(double valorDolar) {
        double total = (0.10 * this.moedas10) + (0.25 * this.moedas25) + (0.50 * this.moedas50);
        return (total / valorDolar);
    }
    
}