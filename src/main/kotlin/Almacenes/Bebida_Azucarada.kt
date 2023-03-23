package Almacenes

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