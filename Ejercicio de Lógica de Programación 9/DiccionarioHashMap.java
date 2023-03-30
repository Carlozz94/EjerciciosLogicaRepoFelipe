package repofelipe;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author artur
 */
public class DiccionarioHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> diccionario = new HashMap<String, String>();

        diccionario.put("hola", "hello");
        diccionario.put("adiós", "goodbye");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("arbol", "tree");
        diccionario.put("libro", "book");
        diccionario.put("naranja", "orange");
        diccionario.put("manzana", "apple");
        diccionario.put("banana", "banana");
        diccionario.put("bicicleta", "bicycle");
        diccionario.put("pescado", "fish");
        diccionario.put("leche", "milk");
        diccionario.put("agua", "water");
        diccionario.put("carro", "car");
        diccionario.put("avión", "airplane");
        diccionario.put("barco", "ship");
        diccionario.put("ordenador", "computer");
        diccionario.put("teléfono", "phone");
        diccionario.put("televisión", "television");

        System.out.println("Ingresa una palabra en español: ");
        String palabra = scanner.next();

        String traduccion = diccionario.get(palabra.toLowerCase());

        if (traduccion != null) {
            System.out.println("La traducción de " + palabra + " es " + traduccion);
        } else {
            System.out.println("No se encontró la traducción de " + palabra );
        }
    }
}