/**
 * Clase Alumno ejercicio propuesto.
 *
 */
package umlajava;

/**
 * @author nmcc
 */
public class Alumno {

    /**
     * Atributos nombre, legajo
     */
    private String nombre;
    private int legajo;

    /**
     * Constructor por parámetros Alumno()
     *
     * @param nombre
     * @param legajo
     */
    public Alumno(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
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
     * Método setNombre()
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
     * Método setLegajo()
     *
     * @param legajo
     */
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

}
