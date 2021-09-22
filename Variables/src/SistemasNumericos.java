public class SistemasNumericos {
    public static void main(String[] args){
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        int numeroBinario = 0b111110100;
        System.out.println("El valor binario 111110100 es = " + numeroBinario);
        System.out.println("Numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroBinario));
        int numeroOctal = 0764;
        System.out.println("Numero octal " + numeroOctal);
        System.out.println("Numero hexadecimal de: " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
    }
}
