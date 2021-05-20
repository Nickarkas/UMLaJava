/**
 * Clase Carrera ejercicio propuesto.
 * 
 */
package umlajava;

/**
 * @author nmcc
 */
public class Carrera {

    /**
     * Atributos nombre, facultad.
     */
    private String nombre;
    private String facultad;

    /**
     * Constructor por parámetro Carrera()
     *
     * @param nombre
     * @param facultad
     */
    public Carrera(String nombre, String facultad) {
        this.nombre = nombre;
        this.facultad = facultad;
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
     * Método getFacultad()
     *
     * @return facultad
     */
    public String getFacultad() {
        return facultad;
    }

    /**
     * Método setFacultad()
     *
     * @param facultad
     */
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

}
