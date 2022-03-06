package un6.eje6_5

import java.util.logging.Level
import java.util.logging.LogManager
import kotlin.random.Random

internal val l = LogManager.getLogManager().getLogger("").apply { level = Level.ALL }
internal fun i(tag: String, msg: String) {
    l.info("[$tag] - $msg")
}


fun main() {
    var portatil = "catalog.xml"

    val gestorDeLibros = gestionLibros(portatil)
    var nFormato = Random.nextInt(1,3)

    if(nFormato==1){
        var formato = CatalogoLibrosIUT2()
        gestorDeLibros.preguntarPorUnLibro(formato)
        gestorDeLibros.mostrarInfoDeUnLibro(formato)
    }else {
        var formato = CatalogoLibrosIUT1()
        gestorDeLibros.preguntarPorUnLibro(formato)
        gestorDeLibros.mostrarInfoDeUnLibro(formato)
    }


}

class gestionLibros(cargador:String){

    var cat = CatalogoLibrosXML(cargador)

    fun preguntarPorUnLibro(formato:CatalogoLibrosIUT) {
       formato.preguntarPorUnLibro(cat)
    }

    fun mostrarInfoDeUnLibro(formato:CatalogoLibrosIUT) {
       formato.mostrarInfoDeUnLibro(cat)
    }

}