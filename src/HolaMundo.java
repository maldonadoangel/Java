import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nombre;
        System.out.println("Hola mundo");
        System.out.println("Ingresa tu nombre");
        nombre = scanner.nextLine();
        System.out.println("Bienvenido: " + nombre);
    }
}
