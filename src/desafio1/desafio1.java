
package desafio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class desafio1 {

    // Método que realiza la división entera
    public static int dividir(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("\n[Error Aritmético]: No es posible dividir por cero.");
            return 0; // Valor de retorno por defecto en caso de error
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Lectura de los números por teclado
            System.out.print("Ingresa el primer número entero (a): ");
            int a = scanner.nextInt();

            System.out.print("Ingresa el segundo número entero (b): ");
            int b = scanner.nextInt();

            // Llamada al método dividir y muestra del resultado
            int resultado = dividir(a, b);
            System.out.println("El resultado de la división es: " + resultado);

        } catch (InputMismatchException e) {
            // Se ejecuta si el usuario ingresa texto, un decimal o un valor fuera del rango entero
            System.out.println("\n[Error de Entrada]: Debes ingresar únicamente números enteros válidos.");
        } finally {
            // Cerrar el recurso del Scanner al finalizar
            scanner.close();
            System.out.println("Programa finalizado.");
        }
    }
}
    

