# Ejercicio 5: IsbnInvalidoException

## Explicación Lógica
1. **Excepción No Verificada:** Al heredar de `RuntimeException`, señala la violación de un invariante de la clase sin obligar la declaración `throws` en el constructor.
2. **Programación Defensiva:** El constructor valida el formato de entrada (largo exacto de 13 caracteres), garantizando que ningún objeto sea instanciado en un estado no válido.