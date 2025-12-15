class SignValidator:
    
    def is_valid(self, text: str) -> bool:
        stack = []
        
        for char in text:
            
            if char == '(' or char == '{' or char == '[':
                stack.append(char)
            
            elif char == ')' or char == '}' or char == ']':
                if not stack:
                    return False
                
                ultimo = stack.pop()
                
                
                if char == ')' and ultimo != '(':
                    return False
                if char == '}' and ultimo != '{':
                    return False
                if char == ']' and ultimo != '[':
                    return False
        
       
        return len(stack) == 0