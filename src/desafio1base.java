

import java.util.Scanner;

public class desafio1base {

    // Método que realiza la división entera
    public static int dividir(int a, int b) {
            return a / b;
            
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
            // Lectura de los números por teclado
            System.out.print("Ingresa el primer número entero (a): ");
            int a = scanner.nextInt();

            System.out.print("Ingresa el segundo número entero (b): ");
            int b = scanner.nextInt();

            // Llamada al método dividir y muestra del resultado
            int resultado = dividir(a, b);
            System.out.println("El resultado de la división es: " + resultado);

        }{
            // Cerrar el recurso del Scanner al finalizar
            System.out.println("Programa finalizado.");
        }
    }
