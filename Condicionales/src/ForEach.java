public class ForEach {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9};

        for(int numero : numeros){
            System.out.println("numero = " + numero);
        }

        String[] nombres = {"Angel", "Hernan", "Morales", "Maldonado"};
        //La estructura for each nos facilita el manejo de iteraciones
        for(String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
