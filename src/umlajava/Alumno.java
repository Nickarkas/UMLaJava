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
     * Constructor por defecto Alumno()
     */
    public Alumno() {

    }

    /**
     * Constructor por parámetros Alumno()
     *
     * @param nombre alumno
     * @param legajo alumno
     */
    public Alumno(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    /**
     * Método getNombre()
     *
     * @return nombre alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setNombre()
     *
     * @param nombre alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getLegajo()
     *
     * @return legajo alumno
     */
    public int getLegajo() {
        return legajo;
    }

    /**
     * Método setLegajo()
     *
     * @param legajo alumno
     */
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

}
