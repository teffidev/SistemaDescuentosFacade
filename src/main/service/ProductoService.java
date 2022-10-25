package main.service;

import main.model.Producto;

public class ProductoService {
    public int verificarDescuento (Producto producto){
        if(producto.getTipo().equalsIgnoreCase("lata")) {
            return 10;
        }
        return 0;
    }
}
