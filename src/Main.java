import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int numeroGenerado = new Random().nextInt(50);
        int intentos = 0;

        while (intentos < 3) {
            System.out.println("introduce un número entre 0 y 50:");
            int numeroDelUsuario = lector.nextInt();
            intentos++;

            if (numeroDelUsuario == numeroGenerado) {
                System.out.println("genial, adivinaste");
                break;
            } else if (numeroDelUsuario > numeroGenerado) {
                System.out.println("el número es menor");
            } else {
                System.out.println("el número es mayor");
            }
        }
        if (intentos == 3) {
            System.out.println("No adivinaste el numero en 3 intentos :(. El número es" + numeroGenerado);
        }
    }
}
