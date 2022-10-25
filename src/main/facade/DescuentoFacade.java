package main.facade;

import main.model.Producto;
import main.model.Tarjeta;

public interface DescuentoFacade {
    //Le paso los 3 porque esta interfaz obtiene el resultado de los
    //tres sistemas funcionando...
    int verificarDescuento(Tarjeta tarjeta, Producto producto, int cantidad);

}
