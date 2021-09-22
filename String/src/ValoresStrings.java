import java.util.Locale;
import java.util.Scanner;

public class ValoresStrings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nombre, apellido;
        System.out.println("Ingrese su nombre");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(nombre).append(" ").append(apellido));

        /*Los metodos más importantes del objeto string, el metodo length nos permite conocer el largo de un texto */
        String nombre1 = "  Hernan";
        System.out.println("nombre.length = " + nombre1.length());
        /*El metodo para convertir un texto en mayusculas */
        System.out.println("nombre.uppercase = " + nombre1.toUpperCase());
        /*Metodo para hacer una comparacion del texto por valor, toma en cuenta las mayusculas y minusculas */
        System.out.println("nombre.equals() = " + nombre1.equals("hernan"));
        /*Metodo para hacer una comparacion del texto por valor, ignorando si son mayusculas o minusculas */
        System.out.println("nombre.equalsIgnoreCase = " + nombre1.equalsIgnoreCase("hernan"));
        /*Reemplazar valores de un texto */
        String trabaLenguas = "Trabalenguas";
        System.out.println("trabalenguas = " + trabaLenguas.replace("a", "."));
        /*Eliminar los espacios en blancos */
        System.out.println("nombre sin espacios = " + nombre1.trim());


    }
}
