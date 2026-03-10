import java.util.Scanner;

public class DiferenciaArreglos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] arreglo1 = new int[7];
        int[] arreglo2 = new int[7];
        int[] arreglo3 = new int[7];

        double suma = 0;

        // Llenar primer arreglo
        System.out.println("Ingrese 7 números para el primer arreglo:");

        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo1[i] = entrada.nextInt();
            suma += arreglo1[i];
        }

        // Llenar segundo arreglo
        System.out.println("\nIngrese 7 números para el segundo arreglo:");

        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo2[i] = entrada.nextInt();
            suma += arreglo2[i];
        }

        // Calcular diferencia entre arreglos
        for (int i = 0; i < 7; i++) {
            arreglo3[i] = arreglo1[i] - arreglo2[i];
        }

        // Calcular promedio
        double promedio = suma / 14;

        // Mostrar resultados
        System.out.println("\nDatos del tercer arreglo (Diferencia):");

        for (int i = 0; i < 7; i++) {
            System.out.println("Posición " + i + ": " + arreglo3[i]);
        }

        System.out.println("\nPromedio de todos los datos: " + promedio);

        entrada.close();
    }
}