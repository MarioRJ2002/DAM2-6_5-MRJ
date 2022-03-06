package un6.eje6_5

class CatalogoLibrosIUT1():CatalogoLibrosIUT{

    override fun preguntarPorUnLibro(cat: CatalogoLibros) {
        println("Introduzca un ID: ")
        var idLibro = readLine()!!
        if (cat.existeLibro(idLibro))
            println("El libro $idLibro existe!")
        else
            println("El libro $idLibro NO existe!")
    }

    override fun mostrarInfoDeUnLibro(cat: CatalogoLibros) {
        println("Introduzca un ID: ")
        var idLibro = readLine()!!
        var infoLibro = cat.infoLibro(idLibro)
        if (!infoLibro.isEmpty())
            println("La información sobre es la siguiente\n$infoLibro")
        else
            println("No se encontró información sobre el libro")
    }
}