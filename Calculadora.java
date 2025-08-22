import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;

        do {
            System.out.println("===== CALCULADORA =====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                num2 = sc.nextDouble();

                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado: " + resultado);
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                        }
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Opción inválida, intenta de nuevo.");
            }

            System.out.println();

        } while (opcion != 5);

        System.out.println("¡Gracias por usar la calculadora!");
        sc.close();
    }
}
