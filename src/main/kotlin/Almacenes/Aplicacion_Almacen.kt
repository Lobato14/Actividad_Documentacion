package Almacenes

fun main(){
    // Creacion de los productos

    var producto1 = Bebida_Azucarada(15,25.24,30.25,"Fanta", 8, true)
    var producto2 = Bebida_Azucarada(16, 48.14, 50.80, "Pepsi", 12, false)
    var producto3 = Agua_mineral(17, 18.20, 16.50, "Lanjarón", "Sierra Nevada")
    var producto4 = Agua_mineral(18, 14.50, 14.70, "FontBella", "Alcehún")
    var producto5 = Agua_mineral(19, 15.50, 16.25, "Bonté", "Guadal")
    var producto6 = Bebida_Azucarada(20, 48.14, 50.80, "Pepsi", 12, false)
    // Creacion del Almacen Principal
    var almacenPrincipal=Almacen()
    // Añadimos los productos a las estanterías
    almacenPrincipal.Estanterias[1]?.add(producto1)
    almacenPrincipal.Estanterias[2]?.add(producto2)
    almacenPrincipal.Estanterias[2]?.add(producto3)
    almacenPrincipal.Estanterias[3]?.add(producto4)
    almacenPrincipal.Estanterias[4]?.add(producto5)
    almacenPrincipal.Estanterias[4]?.add(producto6)
    // Imprimir por estanterias
    println("----Productos------")
    almacenPrincipal.mostrarInformacion()
    // Agregamos los productos
    almacenPrincipal.agregarProductoPrimera(producto1, 1)
    //eliminar bebida
    almacenPrincipal.eliminarbebida(16)
    println("---Precio Total del Almacen-----")
    // Precio Total del Almacén
    almacenPrincipal.precioTotalEstante()
    // Precio Total por estante
    println("---Precio Total por Estante-----")
    almacenPrincipal.precioPorEstante(1)
    println()
    almacenPrincipal.precioPorEstante(2)
    println()
    almacenPrincipal.precioPorEstante(3)
    println()
    almacenPrincipal.precioPorEstante(4)
    println()
    //precio total de la marca
    println("---Precio Total de la marca Pepsi----")
    almacenPrincipal.precioTotalMarca("Pepsi")

}


