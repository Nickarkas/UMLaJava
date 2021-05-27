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
     * @param fecha
     */
    public Asistencia(Date fecha) {
        this.fecha = fecha;
        
    }

    /**
     * Método getFecha()
     *
     * @return fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Método setFecha()
     *
     * @param fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
     */
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    /**
     * Método agregarAlumno()
     *
     * @param alumno
     */
    public static void agregarAlumno(Alumno alumno) {
        this.getAlumnos().add(alumno);
    }

    /**
     * Método eliminarAlumno()
     *
     * @param alumno
     */
    public static void eliminarAlumno(Alumno alumno) {
        this.getAlumnos().remove(alumno);
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
