//https://play.kotlinlang.org/
fun main() {
/*
    Variables val y var
    Las variables de solo lectura deben definirce como val
    Las variables de pueden actualizarse deben nombrarse  como var
    Las variables deben tener una anotación de tipo o ser inicializadas

 */
    val w: Int = 0 //Asignación directa
    val x = 6 //Tipo Int utilizando inferencia de tipos
    val y: Int // Sin inicializar
    y = 7
    val z = 3
    var contador = 0
    contador++;
    println(contador)

    // String template  es una forma de crear String dinamicos
    var n = 1
    println("n = $n")
    val resultado = "n es ${if(n > 0) "positivo" else " negativo"}"
    println(resultado)
    println(multiplicar(4,5))
    println(mutiplicarInLine(5,3))
    println(multiplicaDefault())
    imprimirResultado(2 * 2,2)
    verificar(3)

    /*
        Uso seguro de elementos null
        Para hacer referencia aun elemento nulo deberia ser marcado con ?
         indicando que puede ser nullable es decir hay posibilidad
         de elementos nulos
     */

    val cadena: String ? = null

    //Verificando si un elemento es nulo
    val longitud = if (cadena != null) cadena.length else 0
    //Forma alernativa
    val longitudDos = cadena?.length

    /*
        uso de is para verificación de tipos y as
        para conversión de tipos

        El operador is es utilizado para verificar si un objeto es
        una instancia de cierto tipo, is convertirá automaticamente el objeto
        verificado en el tipo que se está comprobando.
     */

    val str: Any = "HOLA CON IS" // Variable de tipo Any inicializada con una cadena
    if (str is String) //Esto es verdadero
        println(str.length) // Entonces Any es convertido a String

    //Conversión explicita con as convertir un objeto a un tipo especifico
    val cadenaAs: Any = "HOLA CON AS"
    println((cadenaAs as String).length) //La variable es convertida de Any a un String


    /*
        Estructuras de tipo bucle for while
        for es usado para iterar sobre cualquier objeto iterable por ejemplo
        una colección , secuencia o rango
    */
    val colecion = listOf(1,2,3,4,5,6)
    for (elemento in colecion)
        println(elemento)

    /*
        Para recorrer un rango de números podemos usar el operador rango
        por ejemplo del 1 .. 100
     */
     for (i in 1 .. 100)
         println(i)

    /*
        El bucle while es otra forma para repetir bloques de código
        siempre y cuando una condición sea verdadera
     */
   // while (true)
   // {
        //Se queda iterando por siempre
    //}
    var j = 0
    while(j < 100)
    {
        j++
        println("Valor de j = $j")

    }


}

//Función que recibe elemento nulo
fun getElemento(str: String) : String?
{
    return null
}

/*
    Funciones en Kotlin
    Una función es un bloque de código reusable
    Las funciones se declaran utilizando la palabra clave fun
    Una función puede tomar variables o otras funciones como parametros
*/

fun multiplicar(a: Int, b: Int): Int
{
    return a * b
}

//Función con expresión directamente en el cuerpo
fun mutiplicarInLine(a: Int, b: Int) = a * b

//Función con parametros por defecto
fun multiplicaDefault(a: Int = 4, b: Int = 6) = a * b
/*
    La función sin valor de retorno utilizan Unit como tipo
    de retorno, que también se puede omitir.
 */
fun imprimirResultado(a: Int,b: Int)
{
    println("Resultado: " + multiplicaDefault(a, b))
    println("Resultado dos: ${multiplicaDefault(a, b)}")
}

/*
    Flujos de control if y when.
    Se utilizan para seleccionar qué código se ejecutará
    en función de algunas condiciones.
 */

fun numeroPar(a: Int): Boolean
{
    // Si a es un par retorna verdadero
    if (a % 2 == 0) return true else return false
    //return a % 2 == 0
}

fun parInLine(a: Int) = if (a % 2 == 0) true else false

//Versión simplificada
fun parSimplificado(a: Int) = (a % 2 == 0)

//When intenta secuencialmente hacer coincidir su argumento con todas las ramas.
/*
    Si when se usa como expresión, else es obligatorio.
 */

fun verificar(a: Int)
{
     when(a % 2)
     {
         0 -> println("Número par")
         else -> println("Impar")
     }
}



