package lista2deprog2;
public class UsaEstoque {
    String nome;
    int qtdAtual;
    int qtdMinima;
    
    void darBaixaEstoque1(){
        qtdAtual -= 5;
    }
    
    void reposicaoEstoque2(){
        qtdAtual += 7;
    }
    
    void darBaixaEstoque3(){
        qtdAtual -= 4;
    }
    
    void mostrar(){
        System.out.println("NOME:\t"+nome+"\nQTD ATUAL:\t"+qtdAtual+"\nQTD MINIMA:\t"+qtdMinima);
    }
    
    void preciasRepor(){
        if (qtdAtual<=qtdMinima){
            System.out.println("PRECISA REPOR");
    }else{
            System.out.println("NÃO PRECISA REPOR");
        }
}
}