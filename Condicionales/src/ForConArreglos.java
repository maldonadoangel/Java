public class ForConArreglos {
    public static void main(String[] args){
        String[] nombres = {"Angel", "Hernan", "Morales", "Maldonado"};
        int contadorArreglo = nombres.length;


        for(int i = 0; i < contadorArreglo; i++){
            if(nombres[i].equalsIgnoreCase("morales")){
                System.out.println("Encontramos morales, gracias al equalsIgnoreCase que busca sin importar las mayusculas");
                    System.out.println(nombres[i]);
            }
           // System.out.println(nombres[i]);

        }
    }
}
