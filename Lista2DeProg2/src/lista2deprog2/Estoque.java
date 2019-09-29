package lista2deprog2;
public class Estoque {
    String nome;
    int qtdAtual;
    int qtdMinima;
    
    
    void mudarNome(String nome){
        
    }
    
    
    void mudarQtdMinima(int qtdMinima){
        
    }
    
    
    void repor(int qtd){
       qtdAtual += qtd; 
    }
    
    
    void darBaixa(int qtd){
       qtdAtual -= qtd;
    }
    
    
    String mostrar(){
       
        return "NOME DO PRODUTO:\t"+nome+" QUANTIDADE MINIMA:\t"+qtdMinima+"QUANTIDADE ATUAL:\t"+qtdAtual;
        
    }
    
    boolean precisaRepor(){
       if(qtdAtual<=qtdMinima){
           return true;
    }else {
        return false;
    }
}
}