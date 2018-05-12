package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.modelos.ModeloCotizacion;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
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
    public void cierreCaja ( String empleado , java.sql.Timestamp fInicio , java.sql.Timestamp fFinal ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\CajaCerrar.jasper" );
        Map valores = new HashMap ();
        valores.put ( "CAJERO" , empleado );
        valores.put ( "FECHAINICIAL" , fInicio );
        valores.put ( "FECHAFINAL" , fFinal );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        JasperPrintManager.printReport ( jasperPrint , false );
        desconectar ();
    }

    @SuppressWarnings ( "unchecked" )
    public void consumidorFinal ( int transaccion ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\doc_consum_final.jasper" );
        Map valores = new HashMap ();
        valores.put ( "IDVENTA" , transaccion );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        JasperPrintManager.printReport ( jasperPrint , false );
        desconectar ();
    }

    @SuppressWarnings ( "unchecked" )
    public void cotizacion ( int transaccion ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\cotizacion_local.jasper" );
        Map valores = new HashMap ();
        valores.put ( "NUMERO" , transaccion );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        JasperPrintManager.printReport ( jasperPrint , false );
        desconectar ();
    }

    @SuppressWarnings ( "unchecked" )
    public void cotizacionOnline ( ModeloCotizacion cotizacion ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\cotiza_online.jasper" );
        Map valores = new HashMap ();
        valores.put ( "NUMERO" , cotizacion.getIdcotizacion () );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Costos" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

    @SuppressWarnings ( "unchecked" )
    public void creditoFiscal ( int transaccion ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\doc_cred_fiscal.jasper" );
        Map valores = new HashMap ();
        valores.put ( "IDVENTA" , transaccion );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        JasperPrintManager.printReport ( jasperPrint , false );
        desconectar ();
    }

    @SuppressWarnings ( "unchecked" )
    public void pedido ( int transaccion ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\pedidoLista.jasper" );
        Map valores = new HashMap ();
        valores.put ( "NUMPEDIDO" , transaccion );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        JasperPrintManager.printReport ( jasperPrint , false );
        desconectar ();
    }

    @SuppressWarnings ( "unchecked" )
    public void receta ( int idreceta ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\recetas.jasper" );
        Map valores = new HashMap ();
        valores.put ( "IDRECETA" , idreceta );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Costos por Producto" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

    @SuppressWarnings ( "unchecked" )
    public void reporteCajasXRango ( java.sql.Date fechaInicio , java.sql.Date fechaFinal ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\cajaXfecha.jasper" );
        Map valores = new HashMap ();
        valores.put ( "FINICIO" , fechaInicio );
        valores.put ( "FFINAL" , fechaFinal );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Cajas" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        //viewer
        desconectar ();
    }

    public void reporteCatalogo () throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\catalogo.jasper" );
        Map valores = new HashMap ();
        @SuppressWarnings ( "unchecked" )
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Catalogo" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

    public void reporteCatalogoXCategoria ( String categoria ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\catalogo_categoria.jasper" );
        Map valores = new HashMap ();
        valores.put ( "CATEGORIA" , categoria );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Catalogo" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

    @SuppressWarnings ( "unchecked" )
    public void reporteCatalogoXCodigo ( String codigo ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\catalogo_codigo.jasper" );
        Map valores = new HashMap ();
        valores.put ( "CODIGO" , codigo );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Catalogo" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

    @SuppressWarnings ( "unchecked" )
    public void reporteCatalogoXNombre ( String nombre ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\catalogo_nombre.jasper" );
        Map valores = new HashMap ();
        valores.put ( "NOMBRE" , nombre );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Catalogo" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

    public void reporteClientes () throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\clientes.jasper" );
        Map valores = new HashMap ();
        @SuppressWarnings ( "unchecked" )
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Clientes" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

    @SuppressWarnings ( "unchecked" )
    public void reporteComprasXRango ( java.sql.Date fechaInicio , java.sql.Date fechaFinal ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\comprasGralXrango.jasper" );
        Map valores = new HashMap ();
        valores.put ( "FINICIO" , fechaInicio );
        valores.put ( "FFINAL" , fechaFinal );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Catalogo" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        //viewer
        desconectar ();
    }

    public void reporteCostos () throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\costos.jasper" );
        Map valores = new HashMap ();
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Costos" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setVisible ( true );
        desconectar ();
    }

    public void reporteCostosProducto () throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\productosCosteo.jasper" );
        Map valores = new HashMap ();
        @SuppressWarnings ( "unchecked" )
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Costos por Producto" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 950 , 600 );
        viewer.setVisible ( true );
        desconectar ();
    }

    @SuppressWarnings ( "unchecked" )
    public void reporteCotizacionesXCliente ( int idcliente ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\cotizaciones_cliente.jasper" );
        Map valores = new HashMap ();
        valores.put ( "IDCLIENTE" , idcliente );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Cotizaciones" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 950 , 600 );
        viewer.setVisible ( true );
        desconectar ();
    }

    @SuppressWarnings ( "unchecked" )
    public void reporteCotizacionesXRango ( java.sql.Date fechaInicio , java.sql.Date fechaFinal ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\cotizacionesXfecha.jasper" );
        Map valores = new HashMap ();
        valores.put ( "FINICIO" , fechaInicio );
        valores.put ( "FFINAL" , fechaFinal );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Catalogo" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 950 , 600 );
        viewer.setVisible ( true );
        desconectar ();
    }

    public void reporteEmpleados () throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\empleados.jasper" );
        Map valores = new HashMap ();
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Empleados" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

    public void reporteFacturasProveedor ( int idproveedor , String nombre , java.sql.Date fInicio , java.sql.Date fFinal ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\comprasXproveeXrango.jasper" );
        Map valores = new HashMap ();
        valores.put ( "IDPROVEEDOR" , idproveedor );
        valores.put ( "PROVEEDOR" , nombre );
        valores.put ( "FINICIO" , fInicio );
        valores.put ( "FFINAL" , fFinal );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Facturas por Proveedor" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

    public void reporteInventarios () throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\insumos.jasper" );
        Map valores = new HashMap ();
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Inventario" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

    public void reporteInventariosBajoStock () throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\insumos_bajos.jasper" );
        Map valores = new HashMap ();
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Inventario con Bajo Stock" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

    public void reportePedidoXCliente ( int idcliente ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\pedidos_cliente.jasper" );
        Map valores = new HashMap ();
        valores.put ( "IDCLIENTE" , idcliente );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Ventas" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

    public void reportePedidosXRango ( java.sql.Date fechaInicio , java.sql.Date fechaFinal ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\pedidosXfechas.jasper" );
        Map valores = new HashMap ();
        valores.put ( "FINICIAL" , fechaInicio );
        valores.put ( "FFINAL" , fechaFinal );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Catalogo" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

    public void reporteProveedores () throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\proveedores.jasper" );
        Map valores = new HashMap ();
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Proveedores" );
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

    public void reporteUtilidades ( java.sql.Timestamp fechaInicio , java.sql.Timestamp fechaFinal ) throws Exception {
        conectar ();
        System.out.println ( fechaInicio );
        System.out.println ( fechaFinal );
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\utilidades1.jasper" );
        Map valores = new HashMap ();
        valores.put ( "FINICIAL" , fechaInicio );
        valores.put ( "FFINAL" , fechaFinal );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Utilidades" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

    public void reporteVentaXCliente ( int idcliente ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\clientes_historico.jasper" );
        Map valores = new HashMap ();
        valores.put ( "IDCLIENTE" , idcliente );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Ventas" );
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

    public void reporteVentasAnuales ( String anio ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\ventaanual.jasper" );
        Map valores = new HashMap ();
        valores.put ( "ANIO" , anio );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Catalogo" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

    public void reporteVentasXRango ( java.sql.Date fechaInicio , java.sql.Date fechaFinal ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\ventasXrango.jasper" );
        Map valores = new HashMap ();
        valores.put ( "FINICIAL" , fechaInicio );
        valores.put ( "FFINAL" , fechaFinal );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Catalogo" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

    public void reporteVentasXTipo ( java.sql.Date fechaInicio , java.sql.Date fechaFinal ) throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\ventasXtipoventa.jasper" );
        Map valores = new HashMap ();
        valores.put ( "FINICIAL" , fechaInicio );
        valores.put ( "FFINAL" , fechaFinal );
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Ventas" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

    public void reporteProductos () throws Exception {
        conectar ();
        JasperReport reporte = ( JasperReport ) JRLoader.loadObjectFromFile ( "Reportes\\productos.jasper" );
        Map valores = new HashMap ();
        JasperPrint jasperPrint = JasperFillManager.fillReport ( reporte , valores , getConexion () );
        //JasperPrintManager.printReport(jasperPrint, false);
        JasperViewer viewer = new JasperViewer ( jasperPrint , false );
        viewer.setTitle ( "Reporte de Productos" );
        //viewer.setDefaultCloseOperation();
        viewer.setSize ( 800 , 600 );
        viewer.setLocationRelativeTo ( null );
        viewer.setVisible ( true );
        desconectar ();
    }

}
