package utils;

import java.util.Stack;

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
    // character es el que acabas de leer (debe ser cierre: }, ], ) )
    // ultimo es el que sacaste de la pila (debe ser apertura: {, [, ( )
    
    if ((character == '}' && ultimo == '{') || 
        (character == ']' && ultimo == '[') || 
        (character == ')' && ultimo == '(')) {
        return true;
    }
    return false;
}
}
