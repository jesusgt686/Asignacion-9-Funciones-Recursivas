package funciones_recursivas;

import java.util.Arrays;

public class Funciones_Recursivas {

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }

    public static int count(Object[] datos, int n, Object o) {
        if (n == 0) {
            return 0;
        }
        int coincidencia = (datos[n - 1].equals(o)) ? 1 : 0;
        return coincidencia + count(datos, n - 1, o);
    }

    public static void reverse(Object[] datos, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        Object temp = datos[inicio];
        datos[inicio] = datos[fin];
        datos[fin] = temp;
        reverse(datos, inicio + 1, fin - 1);
    }
        
    public static void main(String[] args) {
        
        System.out.println("----------------Resultados de Fibonacci----------------");
        System.out.println("Fibonacci de 5: " + fibonacci(5));
        System.out.println("Fibonacci de 40: " + fibonacci(40));
        System.out.println("");

        System.out.println("----------------Resultados de MCD----------------");
        System.out.println("Maximo comun divisor de 45 y 75: " + mcd(45, 75));
        System.out.println("Maximo comun divisor de 47 y 91: " + mcd(47, 91));
        System.out.println("");

        System.out.println("----------------Resultados de Ocurrencias----------------");
        Integer[] arregloNumeros = {1, 2, 3, 3, 2, 3, 1};
        System.out.println("Numero de ocurrencias del valor 3: " + count(arregloNumeros, arregloNumeros.length, 3));
        System.out.println("Numero de ocurrencias del valor 1: " + count(arregloNumeros, arregloNumeros.length, 1));
        System.out.println("");

        Character[] arregloLetras = {'A', 'B', 'C', 'B', 'A', 'B', 'D'};
        System.out.println("Numero de ocurrencias del valor C: " + count(arregloLetras, arregloLetras.length, 'C'));
        System.out.println("Numero de ocurrencias del valor E: " + count(arregloLetras, arregloLetras.length, 'E'));
        System.out.println("");

        System.out.println("----------------Resultados de Invertir Arreglos----------------");
        Integer[] arregloAInvertir1 = {1, 2, 3, 4, 5};
        reverse(arregloAInvertir1, 0, arregloAInvertir1.length - 1);
        System.out.println("Arreglo numerico invertido: " + Arrays.toString(arregloAInvertir1));

        Character[] arregloAInvertir2 = {'A', 'B', 'C', 'D'};
        reverse(arregloAInvertir2, 0, arregloAInvertir2.length - 1);
        System.out.println("Arreglo de letras invertido: " + Arrays.toString(arregloAInvertir2));
    }
    
}
