package lista2deprog2;
public class Lampada {
    boolean ligada;
    
    void liga(){
        ligada = true;
    }
    void desliga(){
        ligada = false;
    }
    
    void observar(){
        if (ligada == true){
            System.out.println("LIGADA");
        }else{
            System.out.println("DESLIGADA");
        }
    }
    
}
