import java.util.Random;

public class caracoroa {
    public static void main(String[] args)
    {  
        Random gerador = new Random();
        int numero = gerador.nextInt(2); // 0 até 1
    
        if (numero == 1)
        {
            System.out.print ("\n\n\tCaiu cara\n\n"); //True
        }else{
            System.out.print ("\n\n\tCaiu Coroa\n\n"); //False
        }
    }
}