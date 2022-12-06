package 5_lista;

/**
 *
 * @author 41714849
 */
public class Carro {
    
    String carro;
    String modelo;
    Double velocidadeAtual;
    Double velocidadeMaxima;
    
    public void ligar() {
        System.out.println("O carro está ligado!");
    }
    
    public void buzinar() {
        System.out.println("!BIBI!");
    }
    
    public int acelerar(Double quantidade) {
        this.velocidadeAtual += quantidade;     
        
        if (this.velocidadeAtual >= this.velocidadeMaxima)
            return -1;
        else
            return 0;
    }
    
    public int pegarMarcha() {
        if (this.velocidadeAtual == 0)
            return -1;
        else if (this.velocidadeAtual > 0 && this.velocidadeAtual <= 25)
            return 1;
        else if (this.velocidadeAtual > 25 && this.velocidadeAtual <= 40)
            return 2;
        else if (this.velocidadeAtual > 40 && this.velocidadeAtual <= 60)
            return 3;
        else if (this.velocidadeAtual > 60 && this.velocidadeAtual <= 80)
            return 4;
        else
            return 5;
    }
    
}
