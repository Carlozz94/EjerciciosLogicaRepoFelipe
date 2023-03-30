package repofelipe;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author artur
 */
public class DiccionarioVerificar {
    public static void main(String[] args) {
         Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hola", "hello");
        dictionary.put("adiós", "goodbye");
        dictionary.put("casa", "house");
        dictionary.put("coche", "car");
        dictionary.put("perro", "dog");
        dictionary.put("gato", "cat");
        dictionary.put("sol", "sun");
        dictionary.put("luna", "moon");
        dictionary.put("libro", "book");
        dictionary.put("ordenador", "computer");
        dictionary.put("cine", "cinema");
        dictionary.put("televisión", "television");
        dictionary.put("música", "music");
        dictionary.put("fútbol", "football");
        dictionary.put("comida", "food");
        dictionary.put("bebida", "drink");
        dictionary.put("juego", "game");
        dictionary.put("trabajo", "work");
        dictionary.put("estudio", "study");
        dictionary.put("amigo", "friend");
        
        String[] words = new String[5];
        int index = 0;
        Random random = new Random();
        for (String key : dictionary.keySet()) {
            if (random.nextBoolean() && index < 5) {
                words[index] = key;
                index++;
            }
        }
        
        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0;
        int incorrectAnswers = 0;
        for (String word : words) {
            System.out.println("Ingresa la traducción al inglés de \"" + word + "\": ");
            String translation = scanner.nextLine();
            if (dictionary.containsKey(word) && dictionary.get(word).equals(translation.toLowerCase())) {
                System.out.println("¡Respuesta correcta!");
                correctAnswers++;
            } else {
                System.out.println("Respuesta incorrecta. La traducción correcta es \"" + dictionary.get(word) + "\".");
                incorrectAnswers++;
            }
        }
        
        System.out.println("Respuestas correctas: " + correctAnswers);
        System.out.println("Respuestas incorrectas: " + incorrectAnswers);
    }
}