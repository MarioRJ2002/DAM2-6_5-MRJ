package un6.eje6_5

open class CatalogoLibros(cargador:String){

    open fun infoLibro(idLibro:String):Map<String,Any>{return mapOf()}

    open fun existeLibro(idLibro: String): Boolean{return false}
}