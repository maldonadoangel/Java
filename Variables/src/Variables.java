public class Variables {
    public static void main(String[] args){
        String mensaje = "Hola mundo desde java";
        System.out.println(mensaje);
        System.out.println("mensaje.toUpperCase() = " + mensaje.toUpperCase());
        //Convertir un Integer a un tipo primitivo int
        Integer numero = 10;
        System.out.println(numero.intValue());
        boolean verdadero = false;
        if(verdadero){
            System.out.println("Soy una variable verdadera");
        }else{
            System.out.println("Soy un valor falso");
        }

        /* Tipos primitivos */
        //Tipo booleano: es el más simple ya que tiene solo un bit, un valor de verdad que puede ser verdadero o falso
        boolean a = true;
        boolean b = false;
        /*Tipo char */
        //tipo de char: Usa el codigo unicode y ocupa cada caracter 16 bits
        char letra = 'a';
        /*Tipos de numeros enteros */
        // entre -128 a 127
        byte enteroByte = 127;
        //entre -32768 hasta 32767
        short enteroShort = 32767;
        //entre 21474883648 hasta 2147483647
        int enteroInt = 2147483647;
        /*Numeros reales */
        //el tipo flotante es menor al tipo double
        float realFloat = 3.1416f;
        double realDouble = 2.384982734;
    }
}
