package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.modelos.ModeloBitacoraCaja;
import com.pereira.manolos.negocio.modelos.ModeloCaja;
import com.pereira.manolos.negocio.modelos.ModeloCotizacion;
import com.pereira.manolos.negocio.modelos.ModeloVenta;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import javax.swing.JDialog;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/* @author JL Desk */
public class Reportes extends Conexion {

    private static final Logger LOG = Logger.getLogger ( Reportes.class.getName () );

    public Reportes () throws IOException {
    }

    @SuppressWarnings ( "unchecked" )
    public void aperturaCaja ( String empleado , BigDecimal saldo ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\CajaAbrir.jasper" );
        Map valores = new HashMap ();
        valores.put ( "CAJERO" , empleado );
        valores.put ( "SALDOINICIAL" , saldo );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        JasperPrintManager.printReport ( jasperPrint , false );
        desconectar ();
    }

    @SuppressWarnings ( "unchecked" )
    public void cierreCaja ( String empleado , java.sql.Timestamp fInicio , java.sql.Timestamp fFinal , ModeloCaja caja ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\CajaCerrar.jasper" );
        Map valores = new HashMap ();
        valores.put ( "CAJERO" , empleado );
        valores.put ( "FECHAINICIAL" , fInicio );
        valores.put ( "FECHAFINAL" , fFinal );
        valores.put ( "IDCAJA" , caja.getIdcaja () );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        JasperPrintManager.printReport ( jasperPrint , false );
        desconectar ();
    }

    public void corteGZ ( java.sql.Timestamp fInicial , java.sql.Timestamp fFinal , int idcaja ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\corte_gran_Z.jasper" );
        Map valores = new HashMap ();
        valores.put ( "FINICIAL" , fInicial );
        valores.put ( "FFINAL" , fFinal );
        valores.put ( "IDCAJA" , idcaja );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        JasperPrintManager.printReport ( jasperPrint , false );
        desconectar ();
    }

    public void corteX ( java.sql.Timestamp fInicial , java.sql.Timestamp fFinal , int idcaja ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\corte_X.jasper" );
        Map valores = new HashMap ();
        valores.put ( "FINICIAL" , fInicial );
        valores.put ( "FFINAL" , fFinal );
        valores.put ( "IDCAJA" , idcaja );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        JasperPrintManager.printReport ( jasperPrint , false );
        desconectar ();
    }

    public void corteZ ( java.sql.Timestamp fInicial , java.sql.Timestamp fFinal , int idcaja ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\corte_z.jasper" );
        Map valores = new HashMap ();
        valores.put ( "FINICIAL" , fInicial );
        valores.put ( "FFINAL" , fFinal );
        valores.put ( "IDCAJA" , idcaja );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        JasperPrintManager.printReport ( jasperPrint , false );
        desconectar ();
    }

    public void reporteCierreStock () throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\corteInventario.jasper" );
        Map valores = new HashMap ();
        @SuppressWarnings ( "unchecked" )
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setSize ( 750 , 600 );
        viewer.setLocationRelativeTo ( null );
        JDialog dialog = new JDialog ( new javax.swing.JFrame () , true );//the owner
        dialog.setContentPane ( viewer.getContentPane () );
        dialog.setSize ( viewer.getSize () );
        dialog.setTitle ( "Corte de Insumos" );
        dialog.setLocationRelativeTo ( null );
        dialog.setVisible ( true );
        desconectar ();
    }

    public void reporteVentasDiarias () throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\tktVentasDiarias.jasper" );
        Map valores = new HashMap ();
        @SuppressWarnings ( "unchecked" )
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setSize ( 750 , 600 );
        JDialog dialog = new JDialog ( new javax.swing.JFrame () , true );//the owner
        dialog.setContentPane ( viewer.getContentPane () );
        dialog.setSize ( viewer.getSize () );
        dialog.setTitle ( "Ventas del Dia" );
        dialog.setLocationRelativeTo ( null );
        dialog.setVisible ( true );
        desconectar ();
    }

    @SuppressWarnings ( "unchecked" )
    public void ticketEgreso ( ModeloBitacoraCaja egreso ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\tkt_egresando.jasper" );
        Map valores = new HashMap ();
        valores.put ( "CAJERO" , egreso.getEmplado () );
        valores.put ( "NUMCAJA" , egreso.getCaja ().getDetalle () );
        valores.put ( "CUANTO" , egreso.getValor ().toString () );
        valores.put ( "MOTIVO" , egreso.getComentario () );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        JasperPrintManager.printReport ( jasperPrint , false );
        desconectar ();
    }

    @SuppressWarnings ( "unchecked" )
    public void tktCotizacion ( ModeloCotizacion cotizacion ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\tkt_cotiza.jasper" );
        Map valores = new HashMap ();
        valores.put ( "IDCOTIZACION" , cotizacion.getIdcotizacion () );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        JasperPrintManager.printReport ( jasperPrint , false );
        desconectar ();
    }

    @SuppressWarnings ( "unchecked" )
    public void tktDevolucion ( ModeloVenta venta ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\tkt_devol_dgii.jasper" );
        Map valores = new HashMap ();
        valores.put ( "IDVENTA" , venta.getIdventa () );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        JasperPrintManager.printReport ( jasperPrint , false );
        desconectar ();
    }

    @SuppressWarnings ( "unchecked" )
    public void tktVenta ( ModeloVenta venta ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\tkt_vtas_dgii.jasper" );
        Map valores = new HashMap ();
        valores.put ( "IDVENTA" , venta.getIdventa () );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        JasperPrintManager.printReport ( jasperPrint , false );
        desconectar ();
    }

    @SuppressWarnings ( "unchecked" )
    public void tktVenta200 ( ModeloVenta venta ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\tkt_200_dgii.jasper" );
        Map valores = new HashMap ();
        valores.put ( "IDVENTA" , venta.getIdventa () );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        JasperPrintManager.printReport ( jasperPrint , false );
        desconectar ();
    }

    @SuppressWarnings ( "unchecked" )
    public void tktVentaDomicilio ( ModeloVenta venta ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\tkt2Domicilio.jasper" );
        Map valores = new HashMap ();
        valores.put ( "IDVENTA" , venta.getIdventa () );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        JasperPrintManager.printReport ( jasperPrint , false );
        desconectar ();
    }

}
