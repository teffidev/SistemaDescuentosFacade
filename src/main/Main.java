package main;

import main.facade.DescuentoFacade;
import main.facade.impl.DescuentoFacadeImpl;
import main.model.Producto;
import main.model.Tarjeta;

public class Main {
    public static void main(String[] args) {

        DescuentoFacade descuentoFacade = new DescuentoFacadeImpl();

        Tarjeta tarjeta = new Tarjeta("125548951465", "Star Bank");
        Producto producto = new Producto("Arvejas", "lata");
        int cantidad = 13;

        int desceuntoTotal = descuentoFacade.verificarDescuento(tarjeta, producto, cantidad);



        System.out.println("Tu descuento fue de un: " + desceuntoTotal + "%");

    }
}