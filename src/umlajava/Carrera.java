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
     * @param nombre carrera
     * @param facultad carrera
     */
    public Carrera(String nombre, String facultad) {
        this.nombre = nombre;
        this.facultad = facultad;
    }

    /**
     * Método getNombre()
     *
     * @return nombre carrera
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setNombre()
     *
     * @param nombre carrera
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getFacultad()
     *
     * @return facultad nombre
     */
    public String getFacultad() {
        return facultad;
    }

    /**
     * Método setFacultad()
     *
     * @param facultad nombre
     */
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    /**
     * Método getMaterias()
     * @return materias ArratList()
     */
    public ArrayList<Materia> getMaterias() {
        return materias;
    }
       /**
     * Método agregarMateria()
     *
     * @param materia ArrayList()
     */
    public void agregarMateria(Materia materia) {
        this.getMaterias().add(materia);
    }

    /**
     * Método eliminarMateria()
     *
     * @param materia ArrayList()1
     */
    public void eliminarMateria(Materia materia) {
        this.getMaterias().remove(materia);
    }

    /**
     * Método contarMaterias()
     *
     * @param materia tamaño Arraylist() 
     */
    public int contarMaterias() {
        return this.getMaterias().size();
    }

    /**
     * Método encontrarMateria()
     *
     * @param nombre Materia
     * @return Materia nombre
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
    