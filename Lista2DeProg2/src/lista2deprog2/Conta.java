package lista2deprog2;
public class Conta {
    String nome;
    int numero;
    String agencia;
    double saldo;
    String abertura;
    double sacar;
    double depositar;
 
    void sacar(){
        if(saldo >= sacar){
            System.out.println("SALDO ANTIGO:\t"+saldo+"\nSALDO ATUAL:\t"+(saldo-sacar));
        }else{
            System.out.println("SALDO INSUFICIENTE");
        }
    }
    
    void depositar(){
        saldo += depositar;
        System.out.println("SALDO ATUAL:\t"+saldo);
    }
    
    void rendimento(){
        System.out.println("RENDIMENTO:\t"+ saldo * 0.1);
    }
    
    String recuperaDadosParaImpressao(){
        return "NOME:\t"+nome+"\nNUMERO:\t"+numero+"\nAGENCIA:\t"+agencia+"\nSALDO:\t"+saldo+"VALOR SACADO:\t"+sacar+"\nDEPOSITAR:\t"+depositar;
    }
}