import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hasta que numero deseas contar con el ciclo for?");
        int numero = scanner.nextInt();

        for(int i = 1; i <= numero; i++){
            System.out.println("numero: " + i);
        }

        System.out.println("Fin del ciclo for.");



    }
}
