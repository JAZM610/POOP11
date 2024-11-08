/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11;

/**
 * Clase que representa a un alumno con sus datos personales y académicos.
 * 
 * @author poo03alu25
 */
public class Alumno {
    private String nombre;
    private String apPat;
    private String apMat;
    private int numCuenta;
    private int edad;
    private int semestre;

    /**
     * Constructor vacío de la clase Alumno.
     */
    public Alumno() {
    }

    /**
     * Constructor con parámetros de la clase Alumno.
     * 
     * @param nombre Nombre del alumno.
     * @param apPat Apellido paterno del alumno.
     * @param apMat Apellido materno del alumno.
     * @param numCuenta Número de cuenta del alumno.
     * @param edad Edad del alumno.
     * @param semestre Semestre que cursa el alumno.
     */
    public Alumno(String nombre, String apPat, String apMat, int numCuenta, int edad, int semestre) {
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.numCuenta = numCuenta;
        this.edad = edad;
        this.semestre = semestre;
    }

    /**
     * Obtiene el nombre del alumno.
     * 
     * @return Nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del alumno.
     * 
     * @param nombre Nombre del alumno.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtiene el apellido paterno del alumno.
     * 
     * @return Apellido paterno del alumno.
     */
    public String getApPat() {
        return apPat;
    }

    /**
     * Establece el apellido paterno del alumno.
     * 
     * @param apPat Apellido paterno del alumno.
     */
    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    /**
     * Obtiene el apellido materno del alumno.
     * 
     * @return Apellido materno del alumno.
     */
    public String getApMat() {
        return apMat;
    }

    /**
     * Establece el apellido materno del alumno.
     * 
     * @param apMat Apellido materno del alumno.
     */
    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    /**
     * Obtiene el número de cuenta del alumno.
     * 
     * @return Número de cuenta del alumno.
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
     * Establece el número de cuenta del alumno.
     * 
     * @param numCuenta Número de cuenta del alumno.
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * Obtiene la edad del alumno.
     * 
     * @return Edad del alumno.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del alumno.
     * 
     * @param edad Edad del alumno.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * Obtiene el semestre que cursa el alumno.
     * 
     * @return Semestre que cursa el alumno.
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * Establece el semestre que cursa el alumno.
     * 
     * @param semestre Semestre que cursa el alumno.
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    /**
     * Método que simula al alumno estudiando.
     */
    public void estudiar() {
        System.out.println("Estoy estudiando");
    }

    /**
     * Representación en cadena de los datos del alumno.
     * 
     * @return Cadena de texto con los datos del alumno.
     */
    @Override
    public String toString() {
        return nombre + "," + apPat + "," + apMat + "," + numCuenta + "," + edad + "," + semestre;
    }
}