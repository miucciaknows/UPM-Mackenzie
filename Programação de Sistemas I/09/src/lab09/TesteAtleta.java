
package lab09;

public class TesteAtleta {
    public static void main(String[] args) {
        
        Atleta Pedro = new Atleta();
        DadosFisicos dados1 = new DadosFisicos();
                
        Pedro.nome = "Pedro";
        Pedro.numeroCamisa = 12;
        Pedro.posicao = "Centroavante";
        Pedro.status = false;
       
        dados1.peso = 98;
        dados1.altura = 1.88;
        dados1.idade = 25;
        
        Pedro.dados = dados1;
        Pedro.exibirDados();
        
        Pedro.dados.calcularImc();
        if (Pedro.dados.calcularImc() > 30){
            System.out.println("Jogador está obeso");
        }else
            if(Pedro.dados.calcularImc() > 25 && Pedro.dados.calcularImc() <=30){
                System.out.println("Jogador tem peso acima da normalidade");           
            }else
                if (Pedro.dados.calcularImc() > 18.5 && Pedro.dados.calcularImc() <=25){
                    System.out.println("Jogador tem peso dentro da normalidade");
                }else
                    if (Pedro.dados.calcularImc() <= 18.5){
                        System.out.println("Jogador tem peso abaixo da normalidade");
                    }               
        }
    
}
