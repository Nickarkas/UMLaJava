/**
 * Clase Profesor ejercicio propuesto.
 *
 */
package umlajava;

/**
 * @author nmcc
 */
public class Profesor {

    /**
     * Atributos nombre, legajo, basico, antiguedad.
     */
    private String nombre;
    private int legajo;
    private double basico;
    private int antiguedad;

    /**
     * Constructor por defecto Profesor()
     */
    public Profesor() {

    }

    /**
     * Constructor por parámetros Profesor()
     *
     * @param nombre profesor
     * @param legajo profesor
     * @param basico profesor
     * @param antiguedad profesor 
     */
    public Profesor(String nombre, int legajo, double basico, int antiguedad) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    /**
     * Método getNombre()
     *
     * @return nombre profesor
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método getLegajo()
     *
     * @return legajo profesor
     */
    public int getLegajo() {
        return legajo;
    }

    /**
     * Método getBasico()
     *
     * @return basico profesor
     */
    public double getBasico() {
        return basico;
    }

    /**
     * Método getAntiguedad()
     *
     * @return antiguedad profesor
     */
    public int getAntiguedad() {
        return antiguedad;
    }

    /**
     * Método setNombre()
     *
     * @param nombre profesor 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método setLegajo()
     *
     * @param legajo profesor
     */
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    /**
     * Método setBasico()
     *
     * @param basico profesor
     */
    public void setBasico(double basico) {
        this.basico = basico;
    }

    /**
     * Método setAntiguedad()
     *
     * @param antiguedad profesor
     */
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    /**
     * Método calcularSueldo() profesor
     * @return nuevoSueldo profesor
     */
    public double calcularSueldo() {
        double sueldoIncrementado = this.getBasico();

        int cantidadDeAumentos = (int) (this.getAntiguedad() / 5);

        for (int x = 1; x <= cantidadDeAumentos; x++) {
            sueldoIncrementado += (this.getBasico() * 0.10);
        }
        return sueldoIncrementado;
    }
}
