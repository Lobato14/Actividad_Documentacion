package Almacenes

abstract class Bebida(identificador:Int, litros:Double, precio:Double, marca:String) {

    var identificador = identificador
    var litros = litros
        get() {
            return field
        }
        set(value) {
            if (value < 0){
                println("Error")
            }else{
                field = value
            }
        }

    var precio = precio
        get() {
            return field
        }
        set(value) {
            if (value < 0.0){
                println("El precio no puede ser menor a 0")
            }
            field = value
        }

    var marca = marca

    init {
        this.identificador = identificador
        this.litros = litros
        this.precio = precio
        this.marca = marca
    }

    open fun Calcular(cant_prod:Int):Double{
        return cant_prod * precio
    }

    override fun toString(): String {
        return "Bebida(identificador=$identificador, litros=$litros, precio=$precio, marca='$marca')"
    }


}