package main.service;

public class CantidadService {

    public int verificarDescuento (int cuantos) {
        if (cuantos > 11) {
            return 15;
        }
        return 0;
    }

}
