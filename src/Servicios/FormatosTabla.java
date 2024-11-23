
package Servicios;

import javax.swing.JTable;

public class FormatosTabla {
public static void configurarAnchoTabla(JTable tabla) {
    int[] anchoColumnas = {500, 900, 1000, 280, 130, 340, 850, 1000}; 
    for (int i = 0; i < tabla.getColumnCount(); i++) {
        tabla.getColumnModel().getColumn(i).setPreferredWidth(anchoColumnas[i]);
}
}
}
