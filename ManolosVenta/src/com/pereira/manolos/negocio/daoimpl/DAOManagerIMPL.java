package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.negocio.dao.BitacoraCajaDAO;
import com.pereira.manolos.negocio.dao.CajaDAO;
import com.pereira.manolos.negocio.dao.CategoriaProductoDAO;
import com.pereira.manolos.negocio.dao.ClienteCreditoFiscalDAO;
import com.pereira.manolos.negocio.dao.ClienteDAO;
import com.pereira.manolos.negocio.dao.CompraDAO;
import com.pereira.manolos.negocio.dao.CostosIndirectosDAO;
import com.pereira.manolos.negocio.dao.CotizacionDAO;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.dao.DetalleCompraDAO;
import com.pereira.manolos.negocio.dao.DetalleCotizacionDAO;
import com.pereira.manolos.negocio.dao.DetallePromocionDAO;
import com.pereira.manolos.negocio.dao.DetalleRecetaDAO;
import com.pereira.manolos.negocio.dao.DetalleVentaDAO;
import com.pereira.manolos.negocio.dao.EmpleadoDAO;
import com.pereira.manolos.negocio.dao.EmpresaDAO;
import com.pereira.manolos.negocio.dao.InsumoDAO;
import com.pereira.manolos.negocio.dao.MedidaDAO;
import com.pereira.manolos.negocio.dao.ModuloDAO;
import com.pereira.manolos.negocio.dao.MovimientoCajaDAO;
import com.pereira.manolos.negocio.dao.PagoCompraDAO;
import com.pereira.manolos.negocio.dao.PermisoDAO;
import com.pereira.manolos.negocio.dao.ProductoDAO;
import com.pereira.manolos.negocio.dao.PromocionDAO;
import com.pereira.manolos.negocio.dao.ProveedorDAO;
import com.pereira.manolos.negocio.dao.PuestoDAO;
import com.pereira.manolos.negocio.dao.RecetaDAO;
import com.pereira.manolos.negocio.dao.ResolucionDAO;
import com.pereira.manolos.negocio.dao.UnidadDAO;
import com.pereira.manolos.negocio.dao.UsuarioDAO;
import com.pereira.manolos.negocio.dao.VentaDAO;
import java.io.IOException;
import java.util.logging.Logger;

public class DAOManagerIMPL implements DAOManager {

    private static final Logger LOG = Logger.getLogger ( DAOManagerIMPL.class.
            getName () );
    private static BitacoraCajaDAO svBitacoraCajaDAO = null;
    private static CajaDAO svCajaDAO = null;
    private static CategoriaProductoDAO svCategoriaProductoDAO = null;
    private static ClienteCreditoFiscalDAO svClienteCreditoFiscalDAO = null;
    private static ClienteDAO svClienteDAO = null;
    private static CompraDAO svCompraDAO = null;
    private static Costeo svCosteo = null;
    private static CostosIndirectosDAO svCostosIndirectosDAO = null;
    private static CotizacionDAO svCotizacionDAO = null;
    private static DetalleCompraDAO svDetalleCompraDAO = null;
    private static DetalleCotizacionDAO svDetalleCotizacionDAO = null;
    private static DetallePromocionDAO svDetallePromocionDAO = null;
    private static DetalleRecetaDAO svDetalleRecetaDAO = null;
    private static DetalleVentaDAO svDetalleVentaDAO = null;
    private static EmpleadoDAO svEmpleadoDAO = null;
    private static EmpresaDAO svEmpresaDAO = null;
    private static InsumoDAO svInsumoDAO = null;
    private static MedidaDAO svMedidaDAO = null;
    private static ModuloDAO svModuloDAO = null;
    private static MovimientoCajaDAO svMovimientoCajaDAO = null;
    private static PagoCompraDAO svPagoCompraDAO = null;
    private static PermisoDAO svPermisoDAO = null;
    private static ProductoDAO svProductoDAO = null;
    private static PromocionDAO svPromocionDAO = null;
    private static ProveedorDAO svProveedorDAO = null;
    private static PuestoDAO svPuestoDAO = null;
    private static RecetaDAO svRecetaDAO = null;
    private static Reportes svReportes = null;
    private static ResolucionDAO svResolucionDAO = null;
    private static UnidadDAO svUnidadDAO = null;
    private static UsuarioDAO svUsuarioDAO = null;
    private static VentaDAO svVentaDAO = null;

    public DAOManagerIMPL () {
    }

    @Override
    public BitacoraCajaDAO getBitacoraDAO () throws Exception {
        if ( svBitacoraCajaDAO == null ) {
            svBitacoraCajaDAO = new BitacoraCajaIDAO ();
        }
        return svBitacoraCajaDAO;
    }

    @Override
    public CajaDAO getCajaDAO () throws IOException {
        if ( svCajaDAO == null ) {
            svCajaDAO = new CajaIDAO ();
        }
        return svCajaDAO;
    }

    @Override
    public CategoriaProductoDAO getCategoriaProductoDAO () throws IOException {
        if ( svCategoriaProductoDAO == null ) {
            svCategoriaProductoDAO = new CategoriaProductoIDAO ();
        }
        return svCategoriaProductoDAO;
    }

    @Override
    public ClienteCreditoFiscalDAO getClienteCreditoFiscalDAO () throws IOException {
        if ( svClienteCreditoFiscalDAO == null ) {
            svClienteCreditoFiscalDAO = new ClienteCreditoFiscalIDAO ();
        }
        return svClienteCreditoFiscalDAO;
    }

    @Override
    public ClienteDAO getClienteDAO () throws IOException {
        if ( svClienteDAO == null ) {
            svClienteDAO = new ClienteIDAO ();
        }
        return svClienteDAO;
    }

    @Override
    public CompraDAO getCompraDAO () throws IOException {
        if ( svCompraDAO == null ) {
            svCompraDAO = new CompraIDAO ();
        }
        return svCompraDAO;
    }

    @Override
    public Costeo getCosteo () throws Exception {
        if ( svCosteo == null ) {
            svCosteo = new Costeo ();
        }
        return svCosteo;
    }

    @Override
    public CostosIndirectosDAO getCostosIndirectosDAO () throws IOException {
        if ( svCostosIndirectosDAO == null ) {
            svCostosIndirectosDAO = new CostosIndirectosIDAO ();
        }
        return svCostosIndirectosDAO;
    }

    @Override
    public CotizacionDAO getCotizacionDAO () throws IOException {
        if ( svCotizacionDAO == null ) {
            svCotizacionDAO = new CotizacionIDAO ();
        }
        return svCotizacionDAO;
    }

    @Override
    public DetalleCompraDAO getDetalleCompraDAO () throws IOException {
        if ( svDetalleCompraDAO == null ) {
            svDetalleCompraDAO = new DetalleCompraIDAO ();
        }
        return svDetalleCompraDAO;
    }

    @Override
    public DetalleCotizacionDAO getDetalleCotizacionDAO () throws IOException {
        if ( svDetalleCotizacionDAO == null ) {
            svDetalleCotizacionDAO = new DetalleCotizacionIDAO ();
        }
        return svDetalleCotizacionDAO;
    }

    @Override
    public DetallePromocionDAO getDetallePromocionDAO () throws IOException {
        if ( svDetallePromocionDAO == null ) {
            svDetallePromocionDAO = new DetallePromocionIDAO ();
        }
        return svDetallePromocionDAO;
    }

    @Override
    public DetalleRecetaDAO getDetalleRecetaDAO () throws IOException {
        if ( svDetalleRecetaDAO == null ) {
            svDetalleRecetaDAO = new DetalleRecetaIDAO ();
        }
        return svDetalleRecetaDAO;
    }

    @Override
    public DetalleVentaDAO getDetalleVentaDAO () throws IOException {
        if ( svDetalleVentaDAO == null ) {
            svDetalleVentaDAO = new DetalleVentaIDAO ();
        }
        return svDetalleVentaDAO;
    }

    @Override
    public EmpleadoDAO getEmpleadoDAO () throws IOException {
        if ( svEmpleadoDAO == null ) {
            svEmpleadoDAO = new EmpleadoIDAO ();
        }
        return svEmpleadoDAO;
    }

    @Override
    public EmpresaDAO getEmpresaDAO () throws IOException {
        if ( svEmpresaDAO == null ) {
            svEmpresaDAO = new EmpresaIDAO ();
        }
        return svEmpresaDAO;
    }

    @Override
    public InsumoDAO getInsumoDAO () throws IOException {
        if ( svInsumoDAO == null ) {
            svInsumoDAO = new InsumoIDAO ();
        }
        return svInsumoDAO;
    }

    @Override
    public MedidaDAO getMedidaDAO () throws IOException {
        if ( svMedidaDAO == null ) {
            svMedidaDAO = new MedidaIDAO ();
        }
        return svMedidaDAO;
    }

    @Override
    public ModuloDAO getModuloDAO () throws IOException {
        if ( svModuloDAO == null ) {
            svModuloDAO = new ModuloIDAO ();
        }
        return svModuloDAO;
    }

    @Override
    public MovimientoCajaDAO getMovimientoCajaDAO () throws IOException {
        if ( svMovimientoCajaDAO == null ) {
            svMovimientoCajaDAO = new MovimientoCajaIDAO ();
        }
        return svMovimientoCajaDAO;
    }

    @Override
    public PagoCompraDAO getPagoCompraDAO () throws IOException {
        if ( svPagoCompraDAO == null ) {
            svPagoCompraDAO = new PagoCompraIDAO ();
        }
        return svPagoCompraDAO;
    }

    @Override
    public PermisoDAO getPermisoDAO () throws IOException {
        if ( svPermisoDAO == null ) {
            svPermisoDAO = new PermisosIDAO ();
        }
        return svPermisoDAO;
    }

    @Override
    public ProductoDAO getProductoDAO () throws IOException {
        if ( svProductoDAO == null ) {
            svProductoDAO = new ProductoIDAO ();
        }
        return svProductoDAO;
    }

    @Override
    public PromocionDAO getPromocionDAO () throws IOException {
        if ( svPromocionDAO == null ) {
            svPromocionDAO = new PromocionIDAO ();
        }
        return svPromocionDAO;
    }

    @Override
    public ProveedorDAO getProveedorDAO () throws IOException {
        if ( svProveedorDAO == null ) {
            svProveedorDAO = new ProveedorIDAO ();
        }
        return svProveedorDAO;
    }

    @Override
    public PuestoDAO getPuestoDAO () throws IOException {
        if ( svPuestoDAO == null ) {
            svPuestoDAO = new PuestoIDAO ();
        }
        return svPuestoDAO;
    }

    @Override
    public RecetaDAO getRecetaDAO () throws IOException {
        if ( svRecetaDAO == null ) {
            svRecetaDAO = new RecetaIDAO ();
        }
        return svRecetaDAO;
    }

    @Override
    public Reportes getReportes () throws Exception {
        if ( svReportes == null ) {
            svReportes = new Reportes ();
        }
        return svReportes;
    }

    @Override
    public ResolucionDAO getResolucionDAO () throws Exception {
        if ( svResolucionDAO == null ) {
            svResolucionDAO = new ResolucionIDAO ();
        }
        return svResolucionDAO;
    }

    @Override
    public UnidadDAO getUnidadDAO () throws IOException {
        if ( svUnidadDAO == null ) {
            svUnidadDAO = new UnidadIDAO ();
        }
        return svUnidadDAO;
    }

    @Override
    public UsuarioDAO getUsuarioDAO () throws IOException {
        if ( svUsuarioDAO == null ) {
            svUsuarioDAO = new UsuarioIDAO ();
        }
        return svUsuarioDAO;
    }

    @Override
    public VentaDAO getVentaDAO () throws IOException {
        if ( svVentaDAO == null ) {
            svVentaDAO = new VentaIDAO ();
        }
        return svVentaDAO;
    }

}
