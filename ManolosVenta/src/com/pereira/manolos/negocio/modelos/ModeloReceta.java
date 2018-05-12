package com.pereira.manolos.negocio.modelos;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class ModeloReceta {

    private boolean baja;
    private double costoCIF;
    private double costoINV;
    private double costoMOD;
    private BigDecimal vCosto;
    private double vEstimadomensual;
    private int vHoras;
    private int vIdreceta;
    private double vMaximo;
    private double vMinimo;
    private int vMinutos;
    private String vNombre;
    private double vRendimiento;
    private double vStock;
    private String vTiporeceta;
    private ModeloUnidad vUnidad;

    private static final Logger LOG = Logger.getLogger(ModeloReceta.class.getName());

    public ModeloReceta(int pIdreceta, String pNombre, String pTiporeceta, ModeloUnidad pUnidad, BigDecimal pCosto, double pStock,
            double pRendimiento, double pEstimadomensual, double pMaximo, double pMinimo, int pMinutos, int pHoras,
            double pCostoCIF, double pCostoMOD, double pCostoINV, boolean pBaja) {
        this.vIdreceta = pIdreceta;
        this.vNombre = pNombre;
        this.vTiporeceta = pTiporeceta;
        this.vUnidad = pUnidad;
        this.vCosto = pCosto;
        this.vStock = pStock;
        this.vRendimiento = pRendimiento;
        this.vEstimadomensual = pEstimadomensual;
        this.vMaximo = pMaximo;
        this.vMinimo = pMinimo;
        this.vMinutos = pMinutos;
        this.vHoras = pHoras;
        this.costoCIF = pCostoCIF;
        this.costoMOD = pCostoMOD;
        this.costoINV = pCostoINV;
        this.baja = pBaja;
    }

    public ModeloReceta(String pNombre, String pTiporeceta, ModeloUnidad pUnidad, BigDecimal pCosto, double pStock, double pRendimiento,
            double pEstimadomensual, double pMaximo, double pMinimo, int pHoras, int pMinutos) {
        this.vNombre = pNombre;
        this.vTiporeceta = pTiporeceta;
        this.vUnidad = pUnidad;
        this.vCosto = pCosto;
        this.vStock = pStock;
        this.vRendimiento = pRendimiento;
        this.vEstimadomensual = pEstimadomensual;
        this.vMaximo = pMaximo;
        this.vMinimo = pMinimo;
        this.vHoras = pHoras;
        this.vMinutos = pMinutos;
    }

    /**
     * @return the vCosto
     */
    public BigDecimal getCosto() {
        return vCosto;
    }

    /**
     * @return the costoCIF
     */
    public double getCostoCIF() {
        return costoCIF;
    }

    /**
     * @return the costoINV
     */
    public double getCostoINV() {
        return costoINV;
    }

    /**
     * @return the costoMOD
     */
    public double getCostoMOD() {
        return costoMOD;
    }

    /**
     * @return the vEstimadomensual
     */
    public double getEstimadomensual() {
        return vEstimadomensual;
    }

    /**
     * @return the vHoras
     */
    public int getHoras() {
        return vHoras;
    }

    /**
     * @return the vIdreceta
     */
    public int getIdreceta() {
        return vIdreceta;
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
     * @return the vMinutos
     */
    public int getMinutos() {
        return vMinutos;
    }

    /**
     * @return the vNombre
     */
    public String getNombre() {
        return vNombre;
    }

    /**
     * @return the vRendimiento
     */
    public double getRendimiento() {
        return vRendimiento;
    }

    /**
     * @return the vStock
     */
    public double getStock() {
        return vStock;
    }

    /**
     * @return the vTiporeceta
     */
    public String getTiporeceta() {
        return vTiporeceta;
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
     * @param costoCIF the costoCIF to set
     */
    public void setCostoCIF(double costoCIF) {
        this.costoCIF = costoCIF;
    }

    /**
     * @param costoINV the costoINV to set
     */
    public void setCostoINV(double costoINV) {
        this.costoINV = costoINV;
    }

    /**
     * @param costoMOD the costoMOD to set
     */
    public void setCostoMOD(double costoMOD) {
        this.costoMOD = costoMOD;
    }

    /**
     * @param estimadomensual the estimadomensual to set
     */
    public void setEstimadomensual(double estimadomensual) {
        this.vEstimadomensual = estimadomensual;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.vHoras = horas;
    }

    /**
     * @param idreceta the idreceta to set
     */
    public void setIdreceta(int idreceta) {
        this.vIdreceta = idreceta;
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
     * @param minutos the minutos to set
     */
    public void setMinutos(int minutos) {
        this.vMinutos = minutos;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.vNombre = nombre;
    }

    /**
     * @param rendimiento the rendimiento to set
     */
    public void setRendimiento(double rendimiento) {
        this.vRendimiento = rendimiento;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(double stock) {
        this.vStock = stock;
    }

    /**
     * @param tiporeceta the tiporeceta to set
     */
    public void setTiporeceta(String tiporeceta) {
        this.vTiporeceta = tiporeceta;
    }

    /**
     * @param unidad the unidad to set
     */
    public void setUnidad(
            ModeloUnidad unidad) {
        this.vUnidad = unidad;
    }

}
