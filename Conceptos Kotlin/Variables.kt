En Kotlin, la declaración de variables ofrece diversas opciones para manejar datos de manera flexible y segura 
Para empezar, puedes usar val para definir variables inmutables, ideales para valores que no cambiarán después de la inicialización, como el valor de π:

EJEMPLO:
val pi = 3.14

Por otro lado, var te permite crear variables mutables, cuyos valores pueden modificarse durante la ejecución, como en el caso de un nombre que puede cambiar:

EJEMPLO:
var nombre = "Juan"
nombre = "Pedro"

Kotlin permite especificar explícitamente el tipo de variable si es necesario, aunque el compilador puede inferirlo automáticamente en la mayoría de los casos:

EJEMPLO:
val edad: Int = 30
var salario: Double = 2500.50

Para manejar inicialización tardía o nulabilidad,puedes usar lateinit para variables que no se inicializan de inmediato o declararlas con el tipo nulo (String?) 
y asignarles un valor posteriormente:

EJEMPLO:
lateinit var nombre: String
var direccion: String? = null

Finalmente, para definir constantes que no cambian, puedes usar const val dentro de clases o como propiedades de nivel superior, 
asegurando que su valor sea constante durante la ejecución:

EJEMPLO:
const val PI = 3.1416

Estas características hacen que Kotlin sea versátil y eficiente para manejar diferentes tipos de datos y escenarios de programación, 
asegurando tanto la flexibilidad como la seguridad en la manipulación de variables y constantes.