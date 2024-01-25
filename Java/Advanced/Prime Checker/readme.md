# Actividad Prime Checker

## Descripción del Programa

Este programa en Java verifica si un conjunto de números si son primo utilizando la clase `Prime`. Además, se verifica si existe sobrecarga (overloading) en los métodos de la clase.

### Clase `Prime`

#### Método `checkPrime`

- **Descripción:** Verifica si uno o más números son primos y los imprime.
- **Parámetros:** Números enteros.
- **Salida:** Imprime los números primos separados por un espacio y agrega una nueva línea al final.

#### Método `isPrime`

- **Descripción:** Verifica si un número dado es primo.
- **Parámetros:** Número entero.
- **Salida:** Devuelve un valor de tipo booleano indicando si el número es primo o no.

### Clase `Solution`

#### Método `main`

- **Descripción:** Punto de entrada del programa.
- **Entrada:** Lee cinco números enteros desde la entrada del programa.
- **Proceso:** Llama a diferentes instancias del método `checkPrime` con diferentes cantidades de argumentos. Luego, verifica la sobrecarga de métodos en la clase `Prime`.
- **Salida:** Imprime los números primos y verifica si hay sobrecarga.

### Manejo de Excepciones

- Captura y manejo de excepciones para casos inesperados.