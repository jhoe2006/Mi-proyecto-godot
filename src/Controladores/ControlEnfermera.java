
package Controladores;

import Modelos.*;
import Procesos.*;
import Vista.*; 
import Constantes.*;
import Servicios.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ControlEnfermera implements ActionListener {
    DefaultTableModel modelo = new DefaultTableModel(null,
            Datos.encabezadoTabla); FrmEnfermera vista;

public ControlEnfermera(FrmEnfermera vista) { 
    this.vista = vista; this.vista.btnRegistrar.addActionListener(this);
    this.vista.btnNuevo.addActionListener(this);
    ProcesosEnfermera.presentar(this.vista);
    this.vista.tblDatos.setModel(modelo);
    FormatosTabla.configurarAnchoTabla(this.vista.tblDatos);
}
@Override
public void actionPerformed(ActionEvent e) { if (e.getSource() == vista.btnRegistrar) {
EnfermeraCuidados enfermera = ProcesosEnfermera.leerDatos(vista);
modelo.addRow(enfermera.registro());}

if (e.getSource() == vista.btnNuevo) { ProcesosEnfermera.limpiarEntradas(vista);
        }
    }
}

