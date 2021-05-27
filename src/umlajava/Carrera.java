/**
 * Clase Carrera ejercicio propuesto.
 * 
 */
package umlajava;

import java.util.ArrayList;
/**
 * @author nmcc
 */
public class Carrera {

    /**
     * Atributos nombre, facultad.
     */
    private String nombre;
    private String facultad;
    private ArrayList<Materia> materias;
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

    /**
     * Método getMaterias()
     * @return materias
     */
    public ArrayList<Materia> getMaterias() {
        return materias;
    }
       /**
     * Método agregarMateria()
     *
     * @param materia
     */
    public void agregarMateria(Materia materia) {
        this.getMaterias().add(materia);
    }

    /**
     * Método eliminarMateria()
     *
     * @param materia
     */
    public void eliminarMateria(Materia materia) {
        this.getMaterias().remove(materia);
    }

    /**
     * Método contarMaterias()
     *
     * @param
     */
    public int contarMaterias() {
        return this.getMaterias().size();
    }

    /**
     * Método encontrarMateria()
     *
     * @param nombre
     * @return Materia
     */
    public Materia encontrarMateria(String nombre) {
        for (Materia m : this.getMaterias()) {
            if (m.getNombre().equals(nombre)) {
                return m;
            }
        }
        return null;
    }

 
    }
    