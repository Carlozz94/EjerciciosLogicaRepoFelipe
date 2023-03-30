package repofelipe;

import java.text.DecimalFormat;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author artur
 */
public class DiaSemana {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Ingresa un día de la semana (Lunes - Viernes): ");
        String diaSemana = scan.next();
        
        System.out.println("Ingresa una hora (HH:mm): ");
        String horaString = scan.next();
        LocalTime hora = LocalTime.parse(horaString);
        
        DecimalFormat df = new DecimalFormat("###");

        double minutosFaltantes = 0;
        switch (diaSemana) {
            case "lunes":
                minutosFaltantes = (24 - hora.getHour()) * 60 - hora.getMinute();
                minutosFaltantes += 24 * 60 * 3; 
                minutosFaltantes += 3 * 60 * 4.667; 
                break;
            case "martes":
                minutosFaltantes = (24 - hora.getHour()) * 60 - hora.getMinute();
                minutosFaltantes += 24 * 60; 
                minutosFaltantes += 3 * 60 * 4.667; 
                break;
            case "miercoles":
                minutosFaltantes = (24 - hora.getHour()) * 60 - hora.getMinute();
                minutosFaltantes += 24 * 60 ; 
                minutosFaltantes += 3 * 60 * 4.667; 
                break;
            case "jueves":
                minutosFaltantes = (24 - hora.getHour()) * 60 - hora.getMinute();
                minutosFaltantes += 24 * 60; 
                minutosFaltantes += 3 * 60; 
                break;
            case "viernes":
                if (hora.isBefore(LocalTime.of(15, 0))) {
                    minutosFaltantes = (15 - hora.getHour()) * 60 - hora.getMinute();
                }
                break;
            default:
                System.out.println("Día de la semana no valido");
                return;
        }

        System.out.println("Faltan " + df.format(minutosFaltantes) + " minutos para el fin de semana");
    }
}  
