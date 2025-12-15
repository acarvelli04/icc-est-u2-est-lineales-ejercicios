import utils.*;
public class App {

    public static void main(String[] args) throws Exception {
        runSingValidator();
        runPalindromeValidator();
        palindromeQueue();
    }

    private static void runSingValidator() {
        SingValidator singValidator = new SingValidator();
        String cadena1 = "{[()]}"; // VALIDO
        String cadena2 = "{[(])}"; // NO VALIDO

        System.out.println("Cadena: " + cadena1 + " es valida? " + singValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " es valida? " + singValidator.isValid(cadena2));
    }

    private static void runPalindromeValidator() {
        SingValidator validator = new SingValidator();

        String palabra1 = "Reconocer";      // Debería ser true
        String palabra2 = "Hola Mundo";     // Debería ser false
        String palabra3 = "Anita lava la tina"; // Debería ser true

        System.out.println("ADD: Ejercicio 02 - Stack Sorter Palindrome en Java");
        System.out.println("Es '" + palabra1 + "' palíndromo? " + validator.isPalindrome(palabra1));
        System.out.println("Es '" + palabra2 + "' palíndromo? " + validator.isPalindrome(palabra2));
        System.out.println("Es '" + palabra3 + "' palíndromo? " + validator.isPalindrome(palabra3));
    }

    private static void palindromeQueue() {
        SingValidator validator = new SingValidator();

        String palabra1 = "Reconocer";      
        String palabra2 = "Hola Mundo";    
        String palabra3 = "Anita lava la tina"; 

        System.out.println("ADD: Ejercicio 03 - Queue Palindrome en Java");
        System.out.println("Es '" + palabra1 + "' palíndromo? " + validator.isPalindrome(palabra1));
        System.out.println("Es '" + palabra2 + "' palíndromo? " + validator.isPalindrome(palabra2));
        System.out.println("Es '" + palabra3 + "' palíndromo? " + validator.isPalindrome(palabra3));
    }
    
}
