package Almacenes

/**
 * ## Creacion de la clase [Bebida_Azucarada]
 *
 * Creamos un constructor para [Bebida_Azucarada] que hereda de [Bebida].
 *
 * Cogemos la funcion [Calcular] que proviene de [Bebida] que si tiene alguna promocion se multiplique la cantiadad por la promoción, en caso contrario que devuelva la cantidad.
 *
 *
 * Se crea una funcion [toString] que nos devuelve el porcentajeAzucar junto a su promoción.
 *
 * @param porcentajeAzucar porcentaje de azucar que contiene la bebida.
 * @param promocion nos permite saber si la bebida azucarada tiene alguna promoción.
 *
 * @author Rubén Celis Lobato
 */
class Bebida_Azucarada:Bebida {
    var porcentajeAzucar :Int
    var promocion : Boolean

    constructor(identificador:Int, litros:Double, precio:Double, marca:String,porcentajeAzucar:Int, promocion:Boolean) :super(identificador, litros, precio, marca){
        this.porcentajeAzucar = porcentajeAzucar
        this.promocion = promocion
    }

    override fun Calcular(cantidad:Int):Double {
        if (promocion)
            return super.Calcular(cantidad)*0.9
        else
            return super.Calcular(cantidad)
    }

    override fun toString(): String {
        return super.toString()+"porcentaje: "+porcentajeAzucar+" promoción "+promocion
    }



}