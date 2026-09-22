
//Ejercicio 1

/* 
class Libro(
    val titulo: String,
    val autor: String,
    internal var estadoPrestamo: String,
    private val codigoInterno: String
) {
    
    fun verResumen(): String {
        return "libro $titulo de $autor"
    }

    internal fun prestar() {
        estadoPrestamo = "prestado"
        println("el libro $titulo ahora esta prestado")
    }

    fun chequearCodigo(codigoPrueba: String): Boolean {
        return codigoPrueba == codigoInterno
    }
}

fun main() {
    val miLibro = Libro(
        titulo = "el señor de los anillos",
        autor = "tolkien",
        estadoPrestamo = "disponible",
        codigoInterno = "clave123"
    )

    println(miLibro.titulo)
    println(miLibro.verResumen())
    
    miLibro.prestar()

    val sirveElCodigo = miLibro.chequearCodigo("clave123")
    println("el codigo es correcto $sirveElCodigo")
}
*/
/*aca hice la clase libro con datos publicos para que se vean en cualquier lado
tambien use internal para el estado asi solo se maneja dentro de este modulo
y le puse private al codigo interno porque es sensible y nadie de afuera debe verlo*/

//Ejercicio 2

/* 
class CuentaBancaria(
    val numeroCuenta: String,
    saldoInicial: Double
) {
    var saldo: Double = saldoInicial
        private set

    fun depositar(cantidad: Double) {
        saldo += cantidad
        println("depositaste $cantidad el saldo quedo en $saldo")
    }

    fun retirar(cantidad: Double) {
        if (cantidad <= saldo) {
            saldo -= cantidad
            println("retiraste $cantidad el saldo quedo en $saldo")
        } else {
            println("no hay plata suficiente")
        }
    }
}

fun main() {
    val miCuenta = CuentaBancaria("cta98765", 1000.0)

    println("mi cuenta es ${miCuenta.numeroCuenta}")
    println("mi saldo inicial es ${miCuenta.saldo}")

    miCuenta.depositar(500.0)
    miCuenta.retirar(200.0)

    println("saldo final para consultar de afuera ${miCuenta.saldo}")
}*/

/*aca arme la cuenta bancaria usando val en el numero para que se vea pero no se cambie
al saldo le puse private set para que cualquiera lo consulte pero nadie lo altere directo
y le agregue funciones para meter y sacar plata que son las unicas que cambian el valor
*/

//Ejercicio 3



/* 
class Computador(val marca: String) {

class Procesador(val modelo: String, val nucleos: Int) {
    fun mostrarInfo() {
        println("procesador $modelo con$nucleos nucleos")
    }
}

inner class Memoria(val gigas: Int) {
    fun mostrarInfo() {
        println("memoria de $gigas gb instalada en un equipo$marca")
    }
}
}

fun main() {
    val miProcesador = Computador.Procesador("intel core i7", 8)
    miProcesador.mostrarInfo()

    val miCompu = Computador("asus")
    val miMemoria = miCompu.Memoria(16)
    miMemoria.mostrarInfo()
}*/

/*aca hice el computador con un procesador como clase anidada normal para que no dependa del equipo
y le agregue la memoria usando la palabra inner para que si pueda leer la marca del computador
asi queda tal cual el ejercicio mostrando la diferencia entre las dos formas de meter clases*/


//Ejercicio 4

/* 
class Pedido(val codigo: String, val total: Double) {

class CalculadoraImpuestos(val porcentaje: Int) {
    fun calcular(monto: Double): Double {
        return monto * (porcentaje / 100.0)
    }
}

inner class EstadoPedido(val estadoActual: String) {
    fun mostrarDetalle() {
        println("el pedido $codigo con total $total esta en estado$estadoActual")
    }
}
}

fun main() {
    val impuesto = Pedido.CalculadoraImpuestos(19)
    val valorImpuesto = impuesto.calcular(1000.0)
    println("el impuesto es $valorImpuesto")

    val miPedido = Pedido("ped123", 1000.0)
    val estado = miPedido.EstadoPedido("enviado")
    estado.mostrarDetalle()
}*/

/*  aca cree el pedido con una clase anidada para calcular el impuesto sin depender del pedido
 y una clase interna con inner que si usa el total y el codigo del pedido principal para ver el estado*/



//Ejercicio 5

/*data class Usuario(val id: Int, val nombre: String, val correo: String)

fun main() {
    val usuario1 = Usuario(1, "carlos", "carlos@mail.com")
    val usuario2 = Usuario(1, "carlos", "carlos@mail.com")
    val usuario3 = Usuario(2, "ana", "ana@mail.com")

    println("los usuarios 1 y 2 son iguales ${usuario1 == usuario2}")

        val usuarioModificado = usuario1.copy(correo = "nuevo@mail.com")
        println("usuario modificado $usuarioModificado")

println("impresion legible del usuario original $usuario1")
} */

/*aca cree el data class usuario para que compare objetos automaticamente con equals
tambien use la funcion copy para cambiar un atributo facil manteniendo el resto
y el formato de impresion sale legible solo con llamar al objeto en el print*/

//Ejercicio 6

/*
data class Producto(val nombre: String, val precio: Double, val categoria: String)

fun main() {
    val producto1 = Producto("camisa", 45000.0, "ropa")
    val producto2 = Producto("camisa", 45000.0, "ropa")
    val producto3 = Producto("pantalon", 80000.0, "ropa")

println("el producto 1 y 2 son iguales ${producto1 == producto2}")
println("el producto 1 y 3 son iguales ${producto1 == producto3}")

val productoConDescuento = producto1.copy(precio = 35000.0)
    println("producto original $producto1")
    println("producto clonado con nuevo precio $productoConDescuento")
    }
*/
/*aca use data class para el producto con nombre precio y categoria para que compare facil
tambien clone un producto cambiando solo el precio con copy y se imprime estructurado solo */

//Ejercicio 7

/*
data class Coordenada(val latitud: Double, val longitud: Double, val altitud: Double)

fun main() {
    val ubicacion1 = Coordenada(4.6097, -74.0817, 2600.0)
    val ubicacion2 = Coordenada(4.6097, -74.0817, 2600.0)

println("las ubicaciones son iguales ${ubicacion1 == ubicacion2}")

    val ubicacionModificada = ubicacion1.copy(latitud = 4.7110)
    println("copia con cambio minimo $ubicacionModificada")

val (lat, lon, alt) = ubicacion1
    println("valores desestructurados latitud $lat longitud $lon altitud$alt")
    } 
*/

/*
aca cree el data class coordenada para comparar ubicaciones de forma automatica
tambien use copy para hacer copias cambiando solo un valor por ejemplo la latitud
y use la desestructuracion para sacar los valores en variables separadas facil
*/

//Ejercicio 8

/* 
sealed class ResultadoOperacion {
    data class Exito(val mensaje: String) : ResultadoOperacion()
    data class Error(val codigo: Int, val detalle: String) : ResultadoOperacion()
    data object EnProgreso : ResultadoOperacion()
}

fun evaluarResultado(resultado: ResultadoOperacion) {
    when (resultado) {
        is ResultadoOperacion.Exito -> println("operacion exitosa ${resultado.mensaje}")
        is ResultadoOperacion.Error -> println("fallo la operacion codigo ${resultado.codigo} detalle${resultado.detalle}")
        ResultadoOperacion.EnProgreso -> println("la operacion sigue en progreso")
}
}
fun main() {
        val res1: ResultadoOperacion = ResultadoOperacion.Exito("datos guardados")
        val res2: ResultadoOperacion = ResultadoOperacion.Error(500, "error de servidor")
        val res3: ResultadoOperacion = ResultadoOperacion.EnProgreso

        evaluarResultado(res1)
        evaluarResultado(res2)
        evaluarResultado(res3)
     }
*/
/*
aca cree una sealed class llamada resultadooperacion para definir estados cerrados
use data class y object para las clases hijas permitidas segun las buenas practicas de kotlin
y cree una funcion con when para evaluar cada escenario de forma segura y limpia
*/

//Ejercicio 9

/*
sealed class ResultadoAutenticacion {
    data class UsuarioValido(val nombre: String) : ResultadoAutenticacion()
    data class CredencialesIncorrectas(val intentosRestantes: Int) : ResultadoAutenticacion()
    data class CuentaBloqueada(val motivo: String) : ResultadoAutenticacion()
}

fun procesarAutenticacion(resultado: ResultadoAutenticacion) {
    when (resultado) {
        is ResultadoAutenticacion.UsuarioValido -> 
            println("bienvenido de vuelta ${resultado.nombre}")
        is ResultadoAutenticacion.CredencialesIncorrectas -> 
            println("contrasena incorrecta te quedan ${resultado.intentosRestantes} intentos")
        is ResultadoAutenticacion.CuentaBloqueada -> 
            println("cuenta bloqueada por ${resultado.motivo}")
    }
}

fun main() {
    val auth1: ResultadoAutenticacion = ResultadoAutenticacion.UsuarioValido("carlos")
    val auth2: ResultadoAutenticacion = ResultadoAutenticacion.CredencialesIncorrectas(2)
    val auth3: ResultadoAutenticacion = ResultadoAutenticacion.CuentaBloqueada("demasiados intentos fallidos")

    procesarAutenticacion(auth1)
    procesarAutenticacion(auth2)
    procesarAutenticacion(auth3)
}
*/
/*
aca use una sealed class para definir los estados posibles de la autenticacion
cree clases hijas para el usuario valido las credenciales incorrectas y la cuenta bloqueada
y use un when para mostrar un mensaje distinto dependiendo de lo que devuelva el sistema
*/

//Ejercicio 10

/*
open class Empleado(val nombre: String) {
    open fun calcularSalario(): Double {
        return 0.0
    }
}

class EmpleadoFijo(nombre: String, val salarioMensual: Double) : Empleado(nombre) {
    override fun calcularSalario(): Double {
        return salarioMensual
    }
}

class EmpleadoPorHoras(nombre: String, val horasTrabajadas: Int, val valorHora: Double) : Empleado(nombre) {
    override fun calcularSalario(): Double {
        return horasTrabajadas * valorHora
    }
}

fun main() {
    val emp1: Empleado = EmpleadoFijo("carlos", 2500000.0)
    val emp2: Empleado = EmpleadoPorHoras("ana", 40, 35000.0)

    println("el salario de ${emp1.nombre} es ${emp1.calcularSalario()}")
    println("el salario de ${emp2.nombre} es ${emp2.calcularSalario()}")
}
*/

/*
aca cree una clase abierta empleado con una funcion abierta para calcular el salario
despues hice empleados de tipo por hora y fijo heredando y sobrescribiendo el calculo
asi cada tipo de empleado calcula su sueldo de forma diferente segun su contrato
*/

//Ejercicio 11

/*
abstract class Figura {
    abstract fun calcularArea(): Double
    abstract fun calcularPerimetro(): Double
}

class Circulo(val radio: Double) : Figura() {
    override fun calcularArea(): Double {
        return 3.1416 * radio * radio
    }

    override fun calcularPerimetro(): Double {
        return 2 * 3.1416 * radio
    }
}

class Rectangulo(val base: Double, val altura: Double) : Figura() {
    override fun calcularArea(): Double {
        return base * altura
    }

    override fun calcularPerimetro(): Double {
        return 2 * (base + altura)
    }
}

fun main() {
    val fig1: Figura = Circulo(5.0)
    val fig2: Figura = Rectangulo(4.0, 6.0)

    println("area del circulo ${fig1.calcularArea()} y perimetro ${fig1.calcularPerimetro()}")
    println("area del rectangulo ${fig2.calcularArea()} y perimetro ${fig2.calcularPerimetro()}")
}
*/

/*
aca cree una clase abstracta figura con metodos vacios para area y perimetro
despues hice las clases concretas circulo y rectangulo heredando de figura
asi cada una calcula su propio resultado obligatoriamente con override
*/

//Ejercicio 12

/*
abstract class MetodoDePago(val monto: Double) {
    fun mostrarComprobante() {
        println("comprobante por un valor de $monto")
    }

    abstract fun procesarPago()
}

class Tarjeta(monto: Double, val numeroTarjeta: String) : MetodoDePago(monto) {
    override fun procesarPago() {
        println("procesando pago con tarjeta terminada en ${numeroTarjeta.takeLast(4)}")
        mostrarComprobante()
    }
}

class Efectivo(monto: Double) : MetodoDePago(monto) {
    override fun procesarPago() {
        println("procesando pago en efectivo en caja")
        mostrarComprobante()
    }
}

fun main() {
    val pago1: MetodoDePago = Tarjeta(150000.0, "1234567890123456")
    val pago2: MetodoDePago = Efectivo(50000.0)

    pago1.procesarPago()
    println("-------------------")
    pago2.procesarPago()
}
*/

/*
aca cree una clase abstracta metododepago con un metodo comun para mostrar comprobante
despues hice las clases tarjeta y efectivo implementando la logica para procesar el pago
asi cada metodo de pago maneja su propia forma de cobrar pero comparten la estructura
 */