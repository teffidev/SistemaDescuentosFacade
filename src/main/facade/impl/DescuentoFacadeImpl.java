package main.facade.impl;
import main.facade.DescuentoFacade;
import main.model.Producto;
import main.model.Tarjeta;
import main.service.CantidadService;
import main.service.ProductoService;
import main.service.TarjetaService;

public class DescuentoFacadeImpl implements DescuentoFacade {

    private TarjetaService tarjetaService;
    private ProductoService productoService;
    private CantidadService cantidadService;

    public DescuentoFacadeImpl(){
        tarjetaService = new TarjetaService();
        productoService = new ProductoService();
        cantidadService = new CantidadService();
    }


    @Override
    public int verificarDescuento(Tarjeta tarjeta, Producto producto, int cantidad) {

        int descuento = 0;
        //Aca es donde llamo a los servicios y hacer que funcionen
        //Aca es donde creo los servicios
        descuento += tarjetaService.verificarDescuento(tarjeta);
        descuento += productoService.verificarDescuento(producto);
        descuento += cantidadService.verificarDescuento(cantidad);


        return descuento;
    }
}
