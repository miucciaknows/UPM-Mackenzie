package lab09;

public class Atleta {
    String nome;
    int numeroCamisa;
    String posicao;
    boolean status;
    DadosFisicos dados;
    
    
    int alteraStatus(){
        if (dados.calcularImc() > 25)
            return -1;
        else
            status = true;
            return 0;           
    }
  
    void exibirDados(){
        System.out.println("Nome: "+ nome);
        System.out.println("Número da Camisa: "+ numeroCamisa);
        System.out.println("Posição: "+ posicao);
        System.out.println("Status: "+ status);
        dados.exibirDados();
    }
}
