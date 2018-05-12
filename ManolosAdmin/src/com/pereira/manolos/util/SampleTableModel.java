package com.pereira.manolos.util;

import java.util.Arrays;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.BarChart;
import javax.swing.table.AbstractTableModel;

/**
 * SampleTableModel
 */
public class SampleTableModel extends AbstractTableModel {

    private final Object[][] data = {
        { "Costos Indirectos de Fabricación" , new Double ( 0 ) } ,
        { "Mano de Obra Directa" , new Double ( 0 ) } ,
        { "Costo en Inventarios" , new Double ( 0 ) }
    };

    private final String[] names = { "Costo" , "Valor" };
    private static ObservableList<BarChart.Series> bcData;

    public ObservableList<BarChart.Series> getBarChartData () {
        if ( bcData == null ) {
            bcData = FXCollections.<BarChart.Series>observableArrayList ();
            for ( int row = 0 ; row < getRowCount () ; row++ ) {
                ObservableList<BarChart.Data> series = FXCollections.<BarChart.Data>observableArrayList ();
                series.add ( new BarChart.Data ( "Costos de Producción" , getValueAt ( row , 1 ) ) );
                bcData.add ( new BarChart.Series ( series ) );
            }
        }
        return bcData;

    }

    @Override
    public Class getColumnClass ( int column ) {
        return getValueAt ( 0 , column ).getClass ();
    }

    @Override
    public int getColumnCount () {
        return names.length;
    }

    @Override
    public String getColumnName ( int column ) {
        return names[ column ];
    }

    public List<String> getColumnNames () {
        return Arrays.asList ( names );
    }

    @Override
    public int getRowCount () {
        return data.length;
    }

    public double getTickUnit () {
        return 1000;
    }

    @Override
    public Object getValueAt ( int row , int column ) {
        return data[ row ][ column ];
    }

    @Override
    public boolean isCellEditable ( int row , int column ) {
        return true;
    }

    @Override
    public void setValueAt ( Object value , int row , int column ) {
        if ( value instanceof Double ) {
            data[ row ][ column ] = ( Double ) value;
        }

        fireTableCellUpdated ( row , column );
    }

}
