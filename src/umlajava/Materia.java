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
     * @param nombre
     * @param titular
     */
    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;

    }

    /**
     * Método eliminarAsistencia()
     *
     */
    public void eliminarAsistencia(Asistencia asistencia) {
        this.getAsistencias().remove(asistencia);
    }

    /**
     * Método agregarAsistencia()
     *
     * @param asistencia
     */
    public void agregarAsistencia(Asistencia asistencia) {
        this.getAsistencias().add(asistencia);
    }

    /**
     * Método eliminarAlumno()
     *
     * @param alumno
     */
    public void eliminarAlumno(Alumno alumno) {
        this.getAlumnos().remove(alumno);
    }

    /**
     * Método agregarAlumno()
     *
     * @param alumno
     */
    public void agregarAlumno(Alumno alumno) {
        this.getAlumnos().add(alumno);
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

    /**
     * Método getAlumnos()
     *
     * @return alumnos
     */
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    /**
     * Método setAlumnos()
     *
     * @param alumno
     */
    public void setAlumnos(ArrayList<Alumno> alumno) {
        this.alumnos = alumno;
    }

    /**
     * Método getAsistencias()
     *
     * @return asistencias
     */
    public ArrayList<Asistencia> getAsistencias() {
        return asistencias;
    }

    /**
     * Método setAsistencias()
     *
     * @param asistencia
     */
    public void setAsistencias(ArrayList<Asistencia> asistencia) {
        this.asistencias = asistencia;
    }

    /**
     * Método calcularInscriptos()
     *
     * @return Alumnos.size()
     */
    public int calcularInscriptos() {
        return this.getAlumnos().size();
    }

    /**
     * Método calcularAsistencia
     *
     * @param fecha
     * @return asistencia
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
