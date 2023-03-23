package Almacenes

class Almacen(){

    val estanteria1:MutableList<Bebida> = mutableListOf()
    val estanteria2:MutableList<Bebida> = mutableListOf()
    val estanteria3:MutableList<Bebida> = mutableListOf()
    val estanteria4:MutableList<Bebida> = mutableListOf()

    // Creacion de la estanteria principal de las estanterías
    var Estanterias = mutableMapOf<Int, MutableList<Bebida>>(1 to estanteria1, 2 to estanteria2, 3 to estanteria3, 4 to estanteria4)

    // Agregar un producto a la estanteria
    fun agregarProductoPrimera(bebidaNueva:Bebida, numerosEstanteria:Int){
        Estanterias[numerosEstanteria]?.add(bebidaNueva)
    }
    // Agregar con el que menos productos tengan
    fun agregar2(bebida_nueva: Bebida){
        var tamanio = Estanterias[Estanterias.keys.min()]?.size
        var posicion = Estanterias.keys.min()

        for((key, value) in Estanterias){
            if(value.size< tamanio!!){
                tamanio = value.size
                posicion = key
            }
        }
    }

    //


    fun precioTotalEstante(){
        var total_estanterias = 0.0
        for (valda in Estanterias.values){
            for (bebida_actual in valda){
                total_estanterias += bebida_actual.precio
            }
        }
        println("El precio total es $total_estanterias")
    }

    fun precioPorEstante(numeroEstanteria: Int){
        var precio_estanteria = 0.0
        for (z in Estanterias[numeroEstanteria]!!){
            precio_estanteria += z.precio
        }
        println("El precio del estante $numeroEstanteria  cada estante es de $precio_estanteria")
    }

    fun precioTotalMarca(marca:String){
        var precio_marcas = 0.0
        for (estante in Estanterias.values){
            for (bebida in estante){
                if (bebida.marca == marca)
                    precio_marcas+= bebida.precio

            }
        }
        println("El precio de la marca $marca es $precio_marcas")
    }

    fun eliminarbebida(id:Int){
        for (estante in Estanterias.values){
            for (bebida in estante)
                if (bebida.identificador == id){
                    estante.remove(bebida)
                    break
                }
        }
    }

    fun mostrarInformacion(){
        for ((clave,valda) in Estanterias){
            println("En el estante $clave se encuentra:")
            for (kBebida in valda){
                println(" identificador: ${kBebida.identificador}, litros:${kBebida.litros}, precio:${kBebida.precio}, marca:${kBebida.marca}")
            }
        }
    }
}