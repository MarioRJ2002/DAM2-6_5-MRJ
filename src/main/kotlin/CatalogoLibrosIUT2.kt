package un6.eje6_5

class CatalogoLibrosIUT2():CatalogoLibrosIUT {
    override fun preguntarPorUnLibro(cat: CatalogoLibros) {
        println("Enter an ID: ")
        var idLibro = readLine()!!
        if (cat.existeLibro(idLibro))
            println("The book $idLibro exists!")
        else
            println("The book $idLibro doesn't exist!")
    }

    override fun mostrarInfoDeUnLibro(cat: CatalogoLibros) {
        println("Enter an ID: ")
        var idLibro = readLine()!!
        var infoLibro = cat.infoLibro(idLibro)
        if (!infoLibro.isEmpty())
            println("This is the info of the book \n$infoLibro")
        else
            println("No info found about the book")
    }
}