package utils;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class SingValidator {

    public boolean isValid(String signos){
        Stack<Character> stack = new Stack<Character>();
        
        char[] caracteres = signos.toCharArray();
        for (Character character : caracteres) {
            //comprobamos si es abierto o cierre
            if(getIsApertura(character)){
                //ingreso a pila
                stack.push(character);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char ultimo = stack.pop();
                //ultimo es del mismo tipo que el character?
                if (!isTipoIgual(ultimo,character)) {
                    return false;
                } 
            }
        }

        return stack.isEmpty();
    }

    public boolean getIsApertura(char c){
        //char comparador[]=["{","(","["];
        if (c == '{' || c == '(' || c == '[') 
            return true;
        return false;       
    }

    public boolean isTipoIgual(char ultimo, char character) {

    if ((character == '}' && ultimo == '{') || 
        (character == ']' && ultimo == '[') || 
        (character == ')' && ultimo == '(')) {
        return true;
    }
    return false;
    }

    public boolean isPalindrome(String text) {
        //evitar problemas con espacio y mayus
        String cleanText = text.toLowerCase().replace(" ", "");

        Stack<Character> stack = new Stack<>();

        //meter las letras en la pila
        for (int i = 0; i < cleanText.length(); i++) {
            char caracter = cleanText.charAt(i);
            stack.push(caracter);
        }

        //sacamos y comparamos
        for (int i = 0; i < cleanText.length(); i++) {
            char caracterOriginal = cleanText.charAt(i);
            char caracterInvertido = stack.pop(); 
            //aprovechando la propiedad del stack una vez ponemos 
            //toda la palabra la sacamos y comparamos con la original
            if (caracterOriginal != caracterInvertido) {
                return false;
                //cuando una con corresponda es que no es un palindromo
            }
        }
        return true;
    }

    public boolean palindromeQueue(String text){
        //evitar problemas con espacio y mayus
        String cleanText = text.toLowerCase().replace(" ", "");

        Queue<Character> cola = new LinkedList<>();

        for (int i = 0; i < cleanText.length(); i++) {
            cola.add(cleanText.charAt(i));
        }

        //copiar y pegar parte del Stack, claramente remplazando el tipo de variable


        int i = cleanText.length() - 1;

        while (!cola.isEmpty()) {//mientras la cola no este vacia
            while (!cola.isEmpty()) {
            // Sacamos el primero 
            char charDeLaCola = cola.poll();

            // Obtenemos el caracter del final 
            char charDelString = cleanText.charAt(i);

            //comnprobacion
            if (charDeLaCola != charDelString) {
                return false;
            }

            // vamos al siguiente
            i--;
            }   
        }
        return true;

        //VER ESTO PARA TALVEZ HACERLO EN PYTHON
    }
}
