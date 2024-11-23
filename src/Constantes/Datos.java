
package Constantes;

public interface Datos {
    String[] especializaciones = {"Cuidado Crítico Adulto", "Cuidado Neonatal"};
    String[] grados = {"Técnica", "Licenciada"};
    
    double[][] sueldosBase = { {2320, 4450},  {3300, 3920} };
    int HORAS_ADICIONALES = 20; double BONO_ADICIONAL = 300;
    
    String tituloFrame = "Registro de Enfermeras";
    String[] encabezadoTabla = {"DNI", "Nombres", "Especialización", "Grado", "Horas",
    "Sueldo Base", "Monto Adicional", "Sueldo Final"};
}
