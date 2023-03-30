package repofelipe;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class cadenaInvertida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
        System.out.println("Ingrese una palabra");
        
        String cadena = scan.next();
        
        String invertida = "";
        
        for(int i = cadena.length()-1; i >= 0; i--){
             
            invertida += cadena.charAt(i);
        }
        
        System.out.println("Cadena original: " + cadena);
        
        
        System.out.println("Cadena invertidad: " + invertida);
       
    }
    
}
