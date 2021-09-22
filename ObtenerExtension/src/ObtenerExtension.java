public class ObtenerExtension {
    public static void main(String[] args){
        String archivo = "archivo.pdf";
        int i = archivo.indexOf(".");
        System.out.println(archivo.length());
        System.out.println(archivo.substring(i+1));
        char[] arreglo = archivo.toCharArray();
        int largo = arreglo.length;

        for(int j = 0; j < largo; j++){
            System.out.println("Arreglo = " + arreglo[j]);
        }
    }
}
