import java.util.Scanner;

public class CadenaTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una cadena
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();

        // Variable para guardar el resultado
        String invertida = "";

        // Recorremos la cadena al revés usando un for
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }

        // Mostrar resultado
        System.out.println("Cadena invertida: " + invertida);

        scanner.close();
    }
}
