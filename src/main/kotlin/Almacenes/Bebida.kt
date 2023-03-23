package Almacenes

/**
 * ## Creación de la clase [Bebida]
 *
 * Creamos la funcion [Calcular] que devolverá la cantidad del producto por su precio.
 *
 * Creamos la función [toString] para que nos devuelva los parámetros del productos.
 *
 * Se crean getters y setters en sus parámetros.
 *
 * Creamos una clase llamada [Bebida] que contiene los siguientes parametros:
 *
 * La clase [Bebida] será abstracta.
 *
 * @param identificador identificador del producto.
 * @param litros cantidad de litros que contiene el producto.
 * @param precio precio del producto.
 * @param marca marca del producto.
 *
 * @author Rubén Celis Lobato
 *
 */

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