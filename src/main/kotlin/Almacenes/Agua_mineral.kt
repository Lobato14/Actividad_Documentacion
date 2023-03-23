package Almacenes

class Agua_mineral:Bebida{

    var manantialOrigen:String

    constructor (identificador:Int, litros:Double, precio:Double, marca:String,manantialOrigen: String):super(identificador, litros, precio, marca) {
        this.manantialOrigen = manantialOrigen
    }
    override fun Calcular(cant_prod:Int):Double{
        return cant_prod * precio
    }
}