//Ejercicio 1

/* 
fun main() {
    println("ingrese numero: ")

    val numero = readln().toDouble()

    if (numero>0) {
        println(" el numero es positivo")
    } else if (numero < 0 ) {
        println(" el numero es negativo")
    } else {
        println("es cero")
    }
}         
*/


//Si numero > 0 es Positivo, Si numero < 0 es Negativo, Si no es ninguno de los anteriores es cero

//Ejercico 2
 /* 
fun main() {
    print("Ingrese el lado 1: ")
    val lado1 = readln().toDouble()

    print("Ingrese el lado 2: ")
    val lado2 = readln().toDouble()

    print("Ingrese el lado 3: ")
    val lado3 = readln().toDouble()

    if (lado1 == lado2 && lado2 == lado3) {
        println("El triángulo es equilátero")
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        println("El triángulo es isósceles")
    } else {
        println("El triángulo es escaleno")
    }
}
*/

//Primero le pido al usuario los tres lados del triángulo y los guardo en variables despues uso condiciones if y else if para comparar los lados si los tres son iguales, el triángulo es equilátero Si solamente dos son iguales es isósceles y si los tres son diferentes es escaleno

//Ejercicio 3

/* 
fun main() {
    print("Ingrese el primer número: ")
    val numero1 = readln().toDouble()

    print("Ingrese el segundo número: ")
    val numero2 = readln().toDouble()

    print("Ingrese un operador (+, -, *, /): ")
    val operador = readln()

    when (operador) {
        "+" -> println("Resultado: ${numero1 + numero2}")
        "-" -> println("Resultado: ${numero1 - numero2}")
        "*" -> println("Resultado: ${numero1 * numero2}")
        "/" -> println("Resultado: ${numero1 / numero2}")
        else -> println("Operador no válido")
    }
}

*/

//Ejercicio 4

/* 
    fun main() {

    println("ingrese nota")
    val nota = readln().toDouble()

    if (nota>= 90){

        println("Excelente")

    } else if (nota >= 70){

        println("Aprobado")
    
    } else if (nota >= 50) {

        println("Regular")
    } else if (nota < 50){

        println("Reprobado")++

    }
}
    */

    // Primero pedí al usuario una nota entre 0 y 100 y la guardé en una variable. Después usé `if` y `else if` para revisar en qué rango estaba la nota y mostrar si era Excelente, Aprobado, Regular o Reprobado.


    // Ejercicio 5

    /* 
    fun main() {
    print("Ingrese un número: ")
    val numero = readln().toInt()

    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}*/

// Pido un número y uso un for para recorrer del 1 al 10. En cada vuelta multiplico el número y muestro el resultado.

// Ejercicio 6

/* 
fun main() {
    var suma = 0
    var numero: Int

    do {
        print("Ingrese un numero: ")
        numero = readln().toInt()
        suma += numero
    } while (numero != 0)

    println("La suma es: $suma")
}*/

// Creé una variable para ir acumulando la suma de todos los números ingresados Utilice un ciclo do while para seguir pidiendo numeros hasta que el usuario escribiera 0, momento en el que se termina el ciclo


//Ejercicio 7

/* 
fun main() {
    print("Cuantos numeros va a ingresar?: ")
    val cantidad = readln().toInt()

    var pares = 0

    repeat(cantidad) {
        print("Ingrese un numero: ")
        val numero = readln().toInt()

        if (numero % 2 == 0) {
            pares++
        }
    }

    println("Cantidad de pares: $pares")
}
*/

// Primero pregunte cuántos números se iban a ingresar y luego utilice repeat para recibirlos con % 2 revisé cuáles eran divisibles entre dos y aumenté un contador cada vez que encontraba un número par

//Ejercicio 8

/*fun main() {
    val numeros = arrayOf(10, 20, 30, 40, 50)

    for (numero in numeros) {
        println(numero)
    }
} */

//Cree un arreglo con varios números para tenerlos almacenados en una sola variable despues utilice un ciclo for para recorrer todos los elementos y mostrarlos uno por uno.

//Ejercicio 9

/*
fun main() {
    val numeros = arrayOf(10, 20, 30, 40, 50)

    val promedio = numeros.average()

    println("Promedio: $promedio")
} */

//Primero cree un arreglo con diferentes numeros y despues utilice la función average() de Kotlin esta funcion se encarga de calcular el promedio de todos los valores que están dentro del arreglo.

//Ejercicio 10

/*
fun main() {
    val numeros = arrayOf(15, 8, 32, 4, 20)

    val mayor = numeros.maxOrNull()

    println("El mayor es: $mayor")
}
*/

//Guarde varios números dentro de un arreglo y utilicé maxOrNull() para buscar automaticamente el valor mas grande finalmente guardé ese resultado y lo mostre en pantalla.

// Ejercicio 11

/*
fun main() {
    val nombres = mutableListOf<String>()

    while (true) {
        print("Ingrese un nombre: ")
        val nombre = readln()

        if (nombre.lowercase() == "fin") {
            break
        }

        nombres.add(nombre)
    }

    println("Nombres ingresados:")
    println(nombres)
}
*/

//Cree una lista para almacenar los nombres que vaya ingresando el usuario utilice un ciclo while que continua funcionando hasta que se escriba fin y los demas nombres se agregan a la lista

//ejercicio 12

/*
fun main() {
    val nombres = listOf("Juan", "Pedro", "Maria", "Ana")

    print("Ingrese el nombre a buscar: ")
    val nombre = readln()

    if (nombre in nombres) {
        println("El nombre está en la lista")
    } else {
        println("El nombre no está en la lista")
    }
}
*/

//use in para revisar si el nombre que escribi se encuentra dentro de la lista

//ejercicio 13

/*
fun main() {
    val numeros = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8)

    numeros.removeAll { it % 2 != 0 }

    println("Lista sin impares: $numeros")
}
*/

//use removeAll para eliminar los numeros impares y dejar solamente los pares

//ejercicio 14

/*
fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    print("Ingrese numero 1: ")
    val a = readln().toInt()

    print("Ingrese numero 2: ")
    val b = readln().toInt()

    println("Resultado: ${sumar(a, b)}")
}
*/

//Despues desde el main pedi los dos numeros y llame la funcion para mostrar el resultado

//Ejercicio 15

/*
fun factorial(numero: Int): Long {
    var resultado = 1L

    for (i in 1..numero) {
        resultado *= i
    }

    return resultado
}

fun main() {
    print("Ingrese un numero: ")
    val numero = readln().toInt()

    println("Factorial: ${factorial(numero)}")
}
*/

//Use un for para ir multiplicando los numeros desde 1 hasta el numero que ingreso

//ejercicio 16

/*
fun main() {
    val notas = mutableListOf<Double>()

    repeat(5) {
        print("Ingrese una nota: ")
        notas.add(readln().toDouble())
    }

    println("Mayor: ${notas.maxOrNull()}")
    println("Menor: ${notas.minOrNull()}")
    println("Promedio: ${notas.average()}")
}
*/

//Despues use funciones para sacar la nota mayor la menor y el promedio de todas

//ejercicio 17

/*
fun main() {
    val secreto = 7
    var numero: Int

    do {
        print("Adivine el numero: ")
        numero = readln().toInt()

        if (numero < secreto) {
            println("Es mayor")
        } else if (numero > secreto) {
            println("Es menor")
        }

    } while (numero != secreto)

    println("Correcto")
}
 */

 //Primero coloque un numero secreto que el usuario debe intentar adivinar despues use un ciclo para permitir varios intentos y con condiciones le digo si debe ingresar un numero mayor menor Cuando el numero coincide con el secreto el ciclo termina y aparece el mensaje de correcto

 //ejercicio 18

 /*
 fun main() {
    val numeros = listOf(5, 2, 8, 1, 10, 3)

    val resultado = numeros
        .filter { it > 3 }
        .map { it * 2 }
        .sorted()

    println(resultado)
}
 */

 //Primero cree una lista con varios numeros y filtre solamente los que fueran mayores a 3 despues multiplique esos numeros por 2 y finalmente los ordene de menor a mayor asi puedo hacer varias operaciones sobre la lista sin tener que crear varios ciclos

 //ejercicio 19

 /*
 fun sumar(a: Double, b: Double) = a + b
fun restar(a: Double, b: Double) = a - b
fun multiplicar(a: Double, b: Double) = a * b
fun dividir(a: Double, b: Double) = a / b

fun main() {
    val a = 10.0
    val b = 5.0

    println("Suma: ${sumar(a, b)}")
    println("Resta: ${restar(a, b)}")
    println("Multiplicacion: ${multiplicar(a, b)}")
    println("Division: ${dividir(a, b)}")
}
 */
//Primero cree una funcion diferente para cada operacion matematica que se necesita realizar despues coloque dos numeros y llame cada funcion para realizar la suma resta multiplicacion y division de esta manera tengo cada operacion separada y puedo utilizar las funciones cuando las necesite

 //ejercicio 20

 /*
 fun main() {
    print("¿Cuantos terminos?: ")
    val cantidad = readln().toInt()

    var a = 0
    var b = 1

    repeat(cantidad) {
        print("$a ")

        val siguiente = a + b
        a = b
        b = siguiente
    }
}
 */
//Primero empece la secuencia con los numeros 0 y 1 que son los primeros valores de Fibonacci despues fui sumando los dos numeros anteriores para obtener el siguiente y actualice las variables en cada vuelta use repeat para repetir el proceso la cantidad de veces que indique el usuario

//ejercicio 21

/*
fun main() {
    print("Ingrese el lado: ")
    val lado = readln().toDouble()

    val area = lado * lado
    val perimetro = lado * 4

    println("Area: $area")
    println("Perímetro: $perimetro")
}
*/

//Primero pedi el valor de un lado del cuadrado y lo guarde como un numero decimal despues calcule el area multiplicando el lado por si mismo y el perimetro multiplicando el lado por cuatro al final muestro los dos resultados para que el usuario pueda verlos

//ejercicio 22

/*
fun main() {
    print("Ingrese un numero: ")
    val numero = readln().toInt()

    if (numero in 1..100) {
        println("Esta dentro del rango")
    } else {
        println("Esta fuera del rango")
    }
}
*/

//Primero pedi un numero al usuario para saber si cumple con el rango establecido despues use in para comprobar si el numero esta entre 1 y 100 dependiendo del resultado muestro si esta dentro o fuera del rango

//ejercicio 23

/*
fun main() {
    print("Ingrese un texto: ")
    val texto = readln()

    if (texto == texto.lowercase()) {
        println("El texto está en minusculas")
    } else {
        println("El texto tiene mayusculas")
    }
}
 */
 //Primero pedi un texto y lo guarde en una variable para poder revisarlo despues use lowercase para convertir el texto a minusculas y lo compare con el texto original si son iguales quiere decir que el texto ya estaba escrito completamente en minusculas

 //Ejercicio 24

 /*
 fun main() {
    while (true) {
        print("Ingrese un numero: ")
        val numero = readln().toInt()

        if (numero < 0) {
            println("Número negativo. Programa terminado.")
            break
        }

        println("Ingreso: $numero")
    }
}
 */
//Primero hice un ciclo que permite ingresar numeros continuamente sin saber cuantas veces se van a ingresar despues revise si el numero era negativo y cuando lo es utilizo break para salir del cicloi mientras no sea negativo el programa sigue mostrando el numero ingresado

//Ejercicio 25

/*
fun main() {
    print("Ingrese el radio: ")
    val radio = readln().toDouble()

    val area = Math.PI * radio * radio

    println("area del círculo: $area")
}
*/
//Primero pedi el radio del circulo y lo guarde como un numero decimal Despues use la formula del area que multiplica PI por el radio dos veces al final guardo el resultado en una variable y lo muestro en pantall

// Ejercicio 26

/*
fun main() {
    print("Ingrese temperatura en Celsius: ")
    val celsius = readln().toDouble()

    val fahrenheit = (celsius * 9 / 5) + 32

    println("Fahrenheit: $fahrenheit")
}
*/
//Primero pedi la temperatura en grados Celsius y la guarde en una variable despues aplique la formula para convertir Celsius a Fahrenheit haciendo las operaciones correspondientes finalmente muestro la temperatura convertida al usuario

// Ejercicio 27

/*
fun main() {
    val numeros = listOf(10.0, 20.0, 30.0, 40.0, 50.0)

    val promedio = numeros.average()

    println("Promedio: $promedio")
}
 */

 //Primero cree una lista con varios numeros que voy a utilizar para sacar el promedio despues use la funcion average que se encarga de calcular el promedio de todos los valores de la lista finalmente muestro el resultado obtenido

 //ejercicio 28

 /*
 fun main() {
    print("Ingrese lado 1: ")
    val a = readln().toDouble()

    print("Ingrese lado 2: ")
    val b = readln().toDouble()

    print("Ingrese lado 3: ")
    val c = readln().toDouble()

    val perimetro = a + b + c

    println("Perimetro: $perimetro")
}
 */

 //Primero pedi los tres lados del triangulo y los guarde en diferentes variables despues sume los tres valores porque el perimetro de un triangulo se obtiene sumando todos sus lados al final muestro el resultado del perimetro

 // Ejercicio 29

 /*
 fun main() {
    print("Ingrese hasta que numero: ")
    val limite = readln().toInt()

    for (i in 1..limite) {
        if (i % 2 != 0) {
            println(i)
        }
    }
}
 */
//Primero pedi un numero limite para saber hasta donde queria buscar los numeros impares despues use un for para recorrer todos los numeros desde 1 y con el modulo revise cuales no eran divisibles entre dos solamente muestro los numeros que cumplen esa condicion

 //ejercico 30

 /*
 fun main() {
    print("Ingrese la cantidad de numeros: ")
    val cantidad = readln().toInt()

    val impares = mutableListOf<Int>()

    repeat(cantidad) {
        print("Ingrese un numero: ")
        val numero = readln().toInt()

        if (numero % 2 != 0) {
            impares.add(numero)
        }
    }

    println("numeros impares: $impares")
}
 */

 //Primero pedi cuantos numeros queria ingresar y cree una lista vacia donde voy a guardar solamente los impares despues use repeat para ingresar los numeros y con el modulo revise si cada uno era impar cuando encontraba uno impar lo agregaba a la lista y al final muestro todos los que encontre