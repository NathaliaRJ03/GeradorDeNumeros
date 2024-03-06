import java.util.Random;
               
public class MegaSena {
    public static void main (String [] args){
        Random gerar = new Random ();
        
        int i = 0;
        while(i < 6){ //while (true) -> loops infinito
        int num = gerar.nextInt (60);
        System.out.println (num);
        i++;
        
        }
        
    }
}
