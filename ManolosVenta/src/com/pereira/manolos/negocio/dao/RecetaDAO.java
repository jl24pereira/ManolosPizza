package com.pereira.manolos.negocio.dao;

import com.pereira.manolos.negocio.modelos.ModeloReceta;
import java.util.List;

public interface RecetaDAO extends DAO<ModeloReceta> {

    ModeloReceta findById ( int id );

    void prepararReceta ( ModeloReceta receta , int cantidad ,
                          DAOManager manager );

    void descontarReceta ( ModeloReceta receta , double descuento );

    void actualizarCosto ( ModeloReceta receta ) throws Exception;

    void actualizarAllCosto ( List<ModeloReceta> recetas ) throws Exception;
}
