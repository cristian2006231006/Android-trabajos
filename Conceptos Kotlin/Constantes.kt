 En Kotlin, las constantes también pueden manejar nulos de manera segura mediante las siguientes técnicas:

Constantes no nulas por defecto:
Al igual que las variables, las constantes en Kotlin son no nulas por defecto. 
Esto implica que una constante de tipo val no puede contener null a menos que se declare explícitamente como nullable.


val PI: Double = 3.14159 // No puede ser null
val nombre: String? = null // Puede ser null

Operadores seguros (?.):
El operador ?. también se puede utilizar con constantes para acceder a miembros de un objeto solo si la referencia no es nula.


val longitud: Int? = nombre?.length

Operador de elvis (?:):
El operador ?: permite proporcionar un valor por defecto en caso de que la constante sea null.


val nombreLength: Int = nombre?.length ?: 0

Llamadas seguras (let):
La función let se puede usar con constantes para ejecutar un bloque de código solo si el objeto no es nulo.


nombre?.let {
    println("El nombre es $it")
}

Lanzamiento explícito de excepciones (!!):
Al igual que con las variables, se puede forzar una excepción NullPointerException mediante el uso del operador !! para indicar que se asume la no nulabilidad de una constante.


val length: Int = nombre!!.length

Estas estrategias permiten manejar las constantes nulas de manera efectiva en Kotlin, 
asegurando la integridad y la seguridad del código al evitar excepciones NullPointerException y manejar valores por defecto de manera adecuada cuando sea necesario.