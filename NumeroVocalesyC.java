import java.util.Scanner;

public class NumeroVocalesyC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una palabra (solo minúsculas, sin acentos ni números): ");
        String palabra = sc.nextLine();

        int vocales = 0;
        int consonantes = 0;

        // Recorremos cada letra de la palabra
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            // Usamos switch como estructura de control
            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vocales++;
                    break;
                default:
                    // Verificamos si es una letra válida (entre a-z)
                    if (letra >= 'a' && letra <= 'z') {
                        consonantes++;
                    }
                    break;
            }
        }

        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);

        sc.close();
    }
}
