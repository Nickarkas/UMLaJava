/**
 * Clase Materia ejercicio propuesto.
 *
 */
package umlajava;

/**
 * @author nmcc
 */
public class Materia {

    /**
     * Atributos nombre, titular
     */
    private String nombre;
    private Profesor titular;

    /**
     * Constructor por parámetro Materia()
     *
     * @param nombre
     * @param titular
     */
    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
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
     * Método getTitular()
     *
     * @return titular
     */
    public Profesor getTitular() {
        return titular;
    }

    /**
     * Método setTitular()
     *
     * @param titular
     */
    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

}
