package com.pereira.manolos.negocio.dao;

import com.pereira.manolos.negocio.daoimpl.Costeo;
import com.pereira.manolos.negocio.daoimpl.Reportes;
import com.pereira.manolos.negocio.daoimpl.Respaldo;

public interface DAOManager {

    BitacoraCajaDAO getBitacoraDAO () throws Exception;

    CajaDAO getCajaDAO () throws Exception;

    CategoriaProductoDAO getCategoriaProductoDAO () throws Exception;

    ClienteCreditoFiscalDAO getClienteCreditoFiscalDAO () throws Exception;

    ClienteDAO getClienteDAO () throws Exception;

    CompraDAO getCompraDAO () throws Exception;

    CostosIndirectosDAO getCostosIndirectosDAO () throws Exception;

    CotizacionDAO getCotizacionDAO () throws Exception;

    DetalleCompraDAO getDetalleCompraDAO () throws Exception;

    DetalleCotizacionDAO getDetalleCotizacionDAO () throws Exception;

    DetallePromocionDAO getDetallePromocionDAO () throws Exception;

    DetalleRecetaDAO getDetalleRecetaDAO () throws Exception;

    DetalleVentaDAO getDetalleVentaDAO () throws Exception;

    EmpleadoDAO getEmpleadoDAO () throws Exception;

    EmpresaDAO getEmpresaDAO () throws Exception;

    InsumoDAO getInsumoDAO () throws Exception;

    MedidaDAO getMedidaDAO () throws Exception;

    ModuloDAO getModuloDAO () throws Exception;

    MovimientoCajaDAO getMovimientoCajaDAO () throws Exception;

    PagoCompraDAO getPagoCompraDAO () throws Exception;

    PermisoDAO getPermisoDAO () throws Exception;

    ProductoDAO getProductoDAO () throws Exception;

    PromocionDAO getPromocionDAO () throws Exception;

    ProveedorDAO getProveedorDAO () throws Exception;

    PuestoDAO getPuestoDAO () throws Exception;

    RecetaDAO getRecetaDAO () throws Exception;

    UnidadDAO getUnidadDAO () throws Exception;

    UsuarioDAO getUsuarioDAO () throws Exception;

    VentaDAO getVentaDAO () throws Exception;

    Costeo getCosteo () throws Exception;

    ResolucionDAO getResolucionDAO () throws Exception;

    Reportes getReportes () throws Exception;

    Respaldo getRespaldo () throws Exception;
}
