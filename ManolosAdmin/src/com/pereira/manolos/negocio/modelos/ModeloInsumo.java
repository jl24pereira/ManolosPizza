package com.pereira.manolos.negocio.modelos;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class ModeloInsumo {

    private boolean baja;
    private boolean produccion;
    private BigDecimal vCosto;
    private int vIdinsumo;
    private double vMaximo;
    private double vMinimo;
    private String vNombre;
    private double vStock;
    private ModeloUnidad vUnidad;
    private static final Logger LOG = Logger.getLogger(ModeloInsumo.class.
            getName());

    public ModeloInsumo(int pIdinsumo, String pNombre, BigDecimal pCosto,
            double pMinimo, double pMaximo, double pStock,
            ModeloUnidad pUnidad, boolean pBaja,
            boolean pProduccion) {
        this.vIdinsumo = pIdinsumo;
        this.vNombre = pNombre;
        this.vCosto = pCosto;
        this.vMinimo = pMinimo;
        this.vMaximo = pMaximo;
        this.vStock = pStock;
        this.vUnidad = pUnidad;
        this.baja = pBaja;
        this.produccion = pProduccion;
    }

    public ModeloInsumo(boolean produccion, BigDecimal vCosto, double vMaximo, double vMinimo, String vNombre, double vStock, ModeloUnidad vUnidad) {
        this.produccion = produccion;
        this.vCosto = vCosto;
        this.vMaximo = vMaximo;
        this.vMinimo = vMinimo;
        this.vNombre = vNombre;
        this.vStock = vStock;
        this.vUnidad = vUnidad;
    }

    /**
     * @return the vCosto
     */
    public BigDecimal getCosto() {
        return vCosto;
    }

    /**
     * @return the vIdinsumo
     */
    public int getIdinsumo() {
        return vIdinsumo;
    }

    /**
     * @return the vMaximo
     */
    public double getMaximo() {
        return vMaximo;
    }

    /**
     * @return the vMinimo
     */
    public double getMinimo() {
        return vMinimo;
    }

    /**
     * @return the vNombre
     */
    public String getNombre() {
        return vNombre;
    }

    /**
     * @return the vStock
     */
    public double getStock() {
        return vStock;
    }

    /**
     * @return the vUnidad
     */
    public ModeloUnidad getUnidad() {
        return vUnidad;
    }

    /**
     * @return the baja
     */
    public boolean isBaja() {
        return baja;
    }

    /**
     * @return the produccion
     */
    public boolean isProduccion() {
        return produccion;
    }

    /**
     * @param baja the baja to set
     */
    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(BigDecimal costo) {
        this.vCosto = costo;
    }

    /**
     * @param idinsumo the idinsumo to set
     */
    public void setIdinsumo(int idinsumo) {
        this.vIdinsumo = idinsumo;
    }

    /**
     * @param maximo the maximo to set
     */
    public void setMaximo(double maximo) {
        this.vMaximo = maximo;
    }

    /**
     * @param minimo the minimo to set
     */
    public void setMinimo(double minimo) {
        this.vMinimo = minimo;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.vNombre = nombre;
    }

    /**
     * @param produccion the produccion to set
     */
    public void setProduccion(boolean produccion) {
        this.produccion = produccion;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(double stock) {
        this.vStock = stock;
    }

    /**
     * @param unidad the unidad to set
     */
    public void setUnidad(
            ModeloUnidad unidad) {
        this.vUnidad = unidad;
    }

}
