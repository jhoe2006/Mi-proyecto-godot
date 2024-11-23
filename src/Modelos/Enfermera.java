
package Modelos;

public abstract class Enfermera {
    protected String dni;
    protected String nombres; 
    protected String especializacion; 
    protected String grado; 
    protected int horasSemanales;

public Enfermera(String dni, String nombres, String especializacion, String grado, int horasSemanales) {
    this.dni = dni; this.nombres = nombres;
    this.especializacion = especializacion; 
    this.grado = grado;
    this.horasSemanales = horasSemanales;
}
public abstract double calcularSueldoBase();

    public String getDni() {
        return dni;}

    public void setDni(String dni) {
        this.dni = dni;}

    public String getNombres() {
        return nombres;}

    public void setNombres(String nombres) {
        this.nombres = nombres;}

    public String getEspecializacion() {
        return especializacion;}

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;}

    public String getGrado() {
        return grado;}

    public void setGrado(String grado) {
        this.grado = grado;}

    public int getHorasSemanales() {
        return horasSemanales;}

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

}
