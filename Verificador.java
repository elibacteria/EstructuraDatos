package tarea9main;

public class Verificador {
    
    public boolean estaBalanceado(String texto){
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < texto.length(); i++) {
            char caracterActual = texto.charAt(i);
            
            if(caracterActual == '{' || caracterActual == '[' || caracterActual == '('){
                stack.push(caracterActual);
            }
            
            if(caracterActual == '}' || caracterActual == ']' || caracterActual == ')'){
                if(stack.estaVacia()){
                    return false;
                }
                
                char top = stack.pop();
                
                if((caracterActual == '}' && top != '{') || (caracterActual == ']' && top != '[') || (caracterActual == ')' && top != '(')){
                    return false;
                }
            }
        }
        return stack.estaVacia();
    }
}
