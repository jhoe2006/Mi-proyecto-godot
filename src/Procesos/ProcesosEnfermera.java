package Procesos;

import Constantes.*;
import Modelos.*;
import Vista.*;

public class ProcesosEnfermera implements Datos { public static void presentar(FrmEnfermera vista) {
    vista.setTitle(tituloFrame); vista.cbxEspecializacion.removeAllItems();
    for (String esp : especializaciones) vista.cbxEspecializacion.addItem(esp);
    vista.cbxGrado.removeAllItems();
    for (String gr : grados) vista.cbxGrado.addItem(gr); vista.setVisible(true);
    vista.setLocationRelativeTo(null);
}

public static void limpiarEntradas(FrmEnfermera vista) { 
    vista.txtDni.setText("");
    vista.txtNombres.setText("");
    vista.cbxEspecializacion.setSelectedIndex(0); 
    vista.cbxGrado.setSelectedIndex(0); 
    vista.spnHorasSemanales.setValue(0); 
    vista.txtDni.requestFocus();
}

public static EnfermeraCuidados leerDatos(FrmEnfermera vista) { 
    String dni = vista.txtDni.getText();
    String nombres = vista.txtNombres.getText();
    String especializacion = vista.cbxEspecializacion.getSelectedItem().toString(); 
    String grado = vista.cbxGrado.getSelectedItem().toString();
    int horasSemanales = (int) vista.spnHorasSemanales.getValue(); 
    return new EnfermeraCuidados(dni, nombres, 
            especializacion, grado,horasSemanales);
}
}

