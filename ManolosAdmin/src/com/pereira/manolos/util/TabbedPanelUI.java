package com.pereira.manolos.util;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

/* @author JL */
public class TabbedPanelUI extends BasicTabbedPaneUI {

    public Color colorContentBorder;
    public Color colorSel = new Color ( 0 , 0 , 0 );
    public Color colorUnSel = new Color ( 192 , 192 , 192 );
    private static final Logger LOG = Logger.getLogger ( TabbedPanelUI.class.getName () );

    public TabbedPanelUI ( Color colorSel , Color colorUnSel ) {
        this.colorSel = colorSel;
        this.colorUnSel = colorUnSel;
        this.colorContentBorder = colorSel;
    }

    @Override
    protected void paintContentBorder ( Graphics g , int tabPlacement , int selectedIndex ) {
        int width = tabPane.getWidth ();
        int height = tabPane.getHeight ();
        Insets insets = tabPane.getInsets ();

        int x = insets.left;
        int y = insets.top;
        int w = width - insets.right - insets.left;
        int h = height - insets.top - insets.bottom;

        switch ( tabPlacement ) {
            case LEFT:
                x += calculateTabAreaWidth ( tabPlacement , runCount , maxTabWidth );
                x -= tabAreaInsets.right;
                w -= ( x - insets.left );
                break;
            case RIGHT:
                w -= calculateTabAreaWidth ( tabPlacement , runCount , maxTabWidth );
                w += tabAreaInsets.left;
                break;
            case BOTTOM:
                h -= calculateTabAreaHeight ( tabPlacement , runCount , maxTabHeight );
                h += tabAreaInsets.top;
                break;
            case TOP:
            default:
                y += calculateTabAreaHeight ( tabPlacement , runCount , maxTabHeight );
                y -= tabAreaInsets.bottom;
                h -= ( y - insets.top );
        }

        if ( tabPane.getTabCount () > 0 ) {
            /*Color color = UIManager.getColor("TabbedPane.contentAreaColor");
            if (color != null) {
            g.setColor(color);
            }
            else if ( colorContentBorder == null || selectedIndex == -1 ) {
            g.setColor(tabPane.getBackground());
            }
            else {
            g.setColor(colorContentBorder);
            }*/
            g.setColor ( colorContentBorder );

            g.fillRect ( x , y , w , h );
        }
    }

    @Override
    protected void paintTabBackground ( Graphics g , int tabPlacement ,
                                        int tabIndex , int x , int y , int w , int h , boolean isSelected ) {
        Graphics2D g2 = ( Graphics2D ) g;
        g2.setColor ( ( isSelected ) ? colorSel : colorUnSel );
        g2.fillRect ( rects[ tabIndex ].x , rects[ tabIndex ].y ,
                      rects[ tabIndex ].width , rects[ tabIndex ].height );
    }

    @Override
    protected void paintTabBorder ( Graphics g , int tabPlacement ,
                                    int tabIndex , int x , int y , int w , int h , boolean isSelected ) {
        Graphics2D g2 = ( Graphics2D ) g;
        g2.setColor ( ( isSelected ) ? colorSel : colorUnSel );
        g2.drawRect ( x , y , w , h );
    }

}
