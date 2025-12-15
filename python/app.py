from sign_validator import SignValidator

def run_sign_validator():
    validator = SignValidator()
    
    cadena1 = "{[()]}"  # Debería ser True
    cadena2 = "{[(])}"  # Debería ser False 
    
    print(f"Cadena: {cadena1} es valida? {validator.is_valid(cadena1)}")
    print(f"Cadena: {cadena2} es valida? {validator.is_valid(cadena2)}")

if __name__ == "__main__":
    run_sign_validator()