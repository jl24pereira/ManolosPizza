package com.pereira.manolos.util;

/* @author JL Desk */
public class CostoPromedio {

    private final double cantEntrada;
    private final double cantExistencia;
    private final double precioEntrada;
    private final double precioExistencia;
    private double totalCosto;
    private double totalStock;

    public CostoPromedio ( double cantEntrada , double precioEntrada , double cantExistencia , double precioExistencia ) {
        this.cantEntrada = cantEntrada;
        this.precioEntrada = precioEntrada;
        this.cantExistencia = cantExistencia;
        this.precioExistencia = precioExistencia;
    }

    public double calcularCosto () {
        double costo = ( costoExistencia () + costoEntrada () ) / getTotalStock ();
        return costo;
    }

    public double getTotalStock () {
        return ( cantEntrada + cantExistencia );
    }

    private double costoEntrada () {
        double costoTotal;
        costoTotal = cantEntrada * precioEntrada;
        return costoTotal;
    }

    private double costoExistencia () {
        double costoTotal;
        costoTotal = cantExistencia * precioExistencia;
        return costoTotal;
    }

}
