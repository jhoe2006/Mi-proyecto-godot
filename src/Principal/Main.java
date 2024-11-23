
package Principal;

import Controladores.*; 
import Vista.*;
 
public class Main {
    public static void main(String[] args) { FrmEnfermera vista = new FrmEnfermera();
    ControlEnfermera control = new ControlEnfermera(vista);
}
}

