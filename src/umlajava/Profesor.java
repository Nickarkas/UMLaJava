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
     * Constructor por parámetros Profesor()
     *
     * @param nombre
     * @param legajo
     * @param basico
     * @param antiguedad
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
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método getLegajo()
     *
     * @return legajo
     */
    public int getLegajo() {
        return legajo;
    }

    /**
     * Método getBasico()
     *
     * @return basico
     */
    public double getBasico() {
        return basico;
    }

    /**
     * Método getAntiguedad()
     *
     * @return antiguedad
     */
    public int getAntiguedad() {
        return antiguedad;
    }

    /**
     * Método setNombre()
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método setLegajo()
     *
     * @param legajo
     */
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    /**
     * Método setBasico()
     *
     * @param basico
     */
    public void setBasico(double basico) {
        this.basico = basico;
    }

    /**
     * Método setAntiguedad()
     *
     * @param antiguedad
     */
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

}
