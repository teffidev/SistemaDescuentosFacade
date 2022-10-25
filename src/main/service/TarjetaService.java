package main.service;

import main.model.Tarjeta;

public class TarjetaService {

    public int verificarDescuento(Tarjeta tarjeta) {
        if (tarjeta.getBanco().compareTo("Star Bank") == 0) {
            return 20;
        }
        return 0;
    }

}
