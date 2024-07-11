En Kotlin, puedes declarar variables que pueden contener valores nulos agregando ? al tipo de dato, 
lo que evita errores de NullPointerException.

Puedes usar el operador ?. para realizar operaciones seguras con valores nulos, como acceder a propiedades o llamar métodos sin preocuparte por que la variable sea nula.

EJEMPLO:
val longitudNombre = nombre?.length

El operador Elvis ?: te permite proporcionar un valor predeterminado si una expresión es nula.

EJEMPLO:
val longitudOpcion = nombre?.length ?: -1

Para convertir tipos que pueden ser nulos a tipos no nulos, se usa as?, que devuelve null si la conversión falla.

EJEMPLO:
val numero: Int? = edad as? Int

Evita usar !! siempre que sea posible, ya que fuerza una excepción NullPointerException. lo cual compromete la estabilidad y confiabilidad de la aplicación.

EJEMPLO:
val longitud = nombre!!.length

Kotlin también ofrece tipos de datos que no admiten valores nulos, lo que ayuda a prevenir errores de referencia nula en tiempo de compilación.

EJEMPLO:
val cantidad: Int = 10 // No puede ser nulo

Al definir funciones con parámetros que pueden ser nulos, especifica explícitamente que el parámetro puede ser nulo usando ?.

EJEMPLO:
fun longitudNombre(nombre: String?): Int {
    return nombre?.length ?: 0
}

Estas características hacen que Kotlin sea seguro y robusto para manejar nulabilidad, mejorando la claridad y seguridad del código.