import utils.*;
public class App {

    public static void main(String[] args) throws Exception {
        runSingValidator();
    }

    private static void runSingValidator() {
        SingValidator singValidator = new SingValidator();
        String cadena1 = "{[()]}"; // VALIDO
        String cadena2 = "{[(])}"; // NO VALIDO

        System.out.println("Cadena: " + cadena1 + " es valida? " + singValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " es valida? " + singValidator.isValid(cadena2));
    }
}
