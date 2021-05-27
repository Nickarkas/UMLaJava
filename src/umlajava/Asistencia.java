/**
 * Clase Asistencia ejercicio propuesto.
 *
 */
package umlajava;

/**
 * Importamos el paquete de Java -> Date
 */
import java.util.Date;
import java.util.ArrayList;

/**
 * @author nmcc
 */
public class Asistencia {

    /**
     * Atributo fecha
     */
    private Date fecha;
    private static ArrayList<Alumno> alumnos;

    /**
     * Constructor por parámetro Asistencia()
     *
     * @param fecha calendario
     */
    public Asistencia(Date fecha) {
        this.fecha = fecha;
        
    }

    /**
     * Método getFecha()
     *
     * @return fecha calendario
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Método setFecha()
     *
     * @param fecha calendario
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
     * @param Arraylist() de alumnos
     */
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    /**
     * Método agregarAlumno()
     *
     * @param alumno ArrayList()
     */
    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    /**
     * Método eliminarAlumno()
     *
     * @param alumno ArrayList()
     */
    public void eliminarAlumno(Alumno alumno) {
        this.alumnos.remove(alumno);
    }

    /**
     * Método contarAlumnos()
     *
     * @return número de alumnos
     */

    public int contarAlumnos() {

        return this.getAlumnos().size();
    }

}
