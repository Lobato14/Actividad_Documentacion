package Almacenes

/**
 * ## Creación de la Clase [Agua_mineral]
 *
 * La clase [Agua_mineral] hereada de la clase [Bebida] creando un constructor incializacialilzando la variable [manantialOrigen].
 *
 * Cogemos la funcion [Calcular] que proviene de [Bebida] donde devuelve la cantidad del producto por el precio.
 *
 * @param manantialorigen indica el origen del manantial en donde proviene el agua.
 *
 *
 * @author Rubén Celis Lobato
 */

class Agua_mineral:Bebida{

    var manantialOrigen:String

    constructor (identificador:Int, litros:Double, precio:Double, marca:String,manantialOrigen: String):super(identificador, litros, precio, marca) {
        this.manantialOrigen = manantialOrigen
    }
    override fun Calcular(cant_prod:Int):Double{
        return cant_prod * precio
    }
}