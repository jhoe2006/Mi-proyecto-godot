
package Modelos;

import Constantes.*;
import java.text.DecimalFormat;

public class EnfermeraCuidados extends Enfermera implements Acciones, Datos { 
    public EnfermeraCuidados(String dni, String nombres, String especializacion,
            String grado, int horasSemanales) {
        super(dni, nombres, especializacion, grado, horasSemanales);
}

@Override
public double calcularSueldoBase() {
    int especializacionIndex = especializacion.equals(especializaciones[0])
            ? 0 : 1; int gradoIndex = grado.equals(grados[0]) ? 0 : 1;
    return sueldosBase[gradoIndex][especializacionIndex];
}

@Override
public double calcularMontoAdicional() {
    return horasSemanales > HORAS_ADICIONALES ? BONO_ADICIONAL : 0;
}

@Override
public double calcularSueldo() {
    return calcularSueldoBase() + calcularMontoAdicional();
}

public Object[] registro() {
    DecimalFormat df = new DecimalFormat("#.00");
    return new Object[]{dni, nombres, especializacion, grado, horasSemanales,
        df.format(calcularSueldoBase()), df.format(calcularMontoAdicional()),
        df.format(calcularSueldo())};
}
}
