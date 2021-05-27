/**
 * Clase Materia ejercicio propuesto.
 *
 */
package umlajava;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author nmcc
 */
public class Materia {

    /**
     * Atributos nombre, titular
     */
    private String nombre;
    private Profesor titular;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Asistencia> asistencias;

    /**
     * Constructor por parámetro Materia()
     *
     * @param nombre materia
     * @param titular profesor materia
     */
    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;

    }
    /**
     * Constructor por parámetro Materia()
     *
     * @param nombre materia
     */
    public Materia(String nombre){
        this.nombre = nombre;
    }
    /**
     * Método eliminarAsistencia()
     * @param asistencia alumnos
     */
    public void eliminarAsistencia(Asistencia asistencia) {
        this.getAsistencias().remove(asistencia);
    }

    /**
     * Método agregarAsistencia()
     *
     * @param asistencia alumnos
     */
    public void agregarAsistencia(Asistencia asistencia) {
        this.getAsistencias().add(asistencia);
    }

    /**
     * Método eliminarAlumno()
     *
     * @param alumno nombre
     */
    public void eliminarAlumno(Alumno alumno) {
        this.getAlumnos().remove(alumno);
    }

    /**
     * Método agregarAlumno()
     *
     * @param alumno nombre
     */
    public void agregarAlumno(Alumno alumno) {
        this.getAlumnos().add(alumno);
    }

    /**
     * Método getNombre()
     *
     * @return nombre materia
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setNombre()
     *
     * @param nombre materia
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getTitular()
     *
     * @return titular profesor
     */
    public Profesor getTitular() {
        return titular;
    }

    /**
     * Método setTitular()
     *
     * @param titular profesor
     */
    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    /**
     * Método getAlumnos()
     *
     * @return alumnos Arraylist()
     */
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    /**
     * Método setAlumnos()
     *
     * @param alumno ArrayList()
     */
    public void setAlumnos(ArrayList<Alumno> alumno) {
        this.alumnos = alumno;
    }

    /**
     * Método getAsistencias()
     *
     * @return asistencias alumnos
     */
    public ArrayList<Asistencia> getAsistencias() {
        return asistencias;
    }

    /**
     * Método setAsistencias()
     *
     * @param asistencia alumnos
     */
    public void setAsistencias(ArrayList<Asistencia> asistencia) {
        this.asistencias = asistencia;
    }

    /**
     * Método calcularInscriptos()
     *
     * @return tamaño ArrayList() alumnos inscritos
     */
    public int calcularInscriptos() {
        return this.getAlumnos().size();
    }

    /**
     * Método calcularAsistencia
     *
     * @param fecha calendario
     * @return asistencia alumnos
     */
    public double calcularAsistencia(Date fecha) {
        for (Asistencia asist : this.getAsistencias()) {
            if ((asist.getFecha()).compareTo(fecha) == 0) {
                return (double) asist.contarAlumnos() / (double) this.calcularInscriptos();
            }
        }
        return 0;
    }
}
