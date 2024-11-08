/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.util.ArrayList;

import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase principal que realiza diversas operaciones con archivos y manipulación de datos.
 * 
 * @author poo03alu25
 */
public class POOP11 {

    /**
     * Método principal que ejecuta la lógica de la aplicación.
     *
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Verifica si el archivo "archivo.txt" existe
        File archivo = new File("archivo.txt");
        System.out.println(archivo.exists()); // aun no existe
        
        try {
            // Intenta crear el archivo "archivo.txt"
            boolean seCreo = archivo.createNewFile();
            System.out.println(archivo.exists()); // verifica si el archivo se creó
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("############ FileInputStream #############");
        
        try {
            // Lectura de texto desde la entrada estándar y escritura en un archivo
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe texto para el archivo");
            String texto = br.readLine(); // espera hasta detectar un \n
            System.out.println(texto);
            
            // Escritura del texto en el archivo "archivo.txt"
            FileWriter fw = new FileWriter("archivo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println(texto); // imprime la línea escrita
            salida.println("Esta es la segunda línea");
            
            // Agrega 10 líneas numeradas al archivo
            for (int i = 0; i < 10; i++) {
                salida.println("Línea " + i);
            }
            
            // Simula una carga de archivo
            for (int i = 0; i < 10; i++) {
                salida.println("Cargando archivo: " + i * 10 + "%");
            }
            
            salida.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("############ FileReader #############");
        
        try {
            // Lectura del contenido del archivo "archivo.txt"
            FileReader fr = new FileReader("archivo.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("###");
            System.out.println("El texto del archivo es:");
            String linea = br.readLine();
            
            // Imprime cada línea del archivo
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            
            fr.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("############ StringTokenizer #############");
        
        // Divide una cadena de texto usando un delimitador
        String alumnoParseado = "Eric Fernando,Soto,Bolaños,321184593,18,3";
        System.out.println(alumnoParseado);
        StringTokenizer tokenizador = new StringTokenizer(alumnoParseado, ",");
        
        // Imprime cada token
        while (tokenizador.hasMoreTokens()) {
            System.out.println(tokenizador.nextToken());
        }
        
        System.out.println("############ Ejercicio de Alumnos #############");
        
        // Creación de objetos Alumno y muestra de sus datos
        Alumno alumno1 = new Alumno("Angel Gabriel", "Mijangos", "Gonzalez", 321331890, 18, 3);
        System.out.println(alumno1);
        
        Alumno alumno2 = new Alumno("Diana", "Teran", "Muñoz", 329723573, 18, 4);
        System.out.println(alumno2);
        
        Alumno alumno3 = new Alumno("Zaith Acalli", "Jara", "Muñoz", 324541712, 18, 5);
        System.out.println(alumno3);
        
        Alumno alumno4 = new Alumno("Bruno Daniel", "Perez", "Vargas", 316732559, 21, 5);
        System.out.println(alumno4);
        
        Alumno alumno5 = new Alumno("Miguel Angel", "Cabrera", "Salazar", 315312490, 21, 7);
        System.out.println(alumno5);
        
        // Creación de una lista de objetos Alumno
        ArrayList<Alumno> lista = new ArrayList<>();
        lista.add(alumno1);
        lista.add(alumno2);
        lista.add(alumno3);
        lista.add(alumno4);
        lista.add(alumno5);
        
        System.out.println("###### Imprimir Lista con foreach ######");
        
        // Imprime la lista de alumnos usando un bucle foreach
        for (Alumno alumno : lista) {
            System.out.println(alumno);
        }
        
        System.out.println("####### Escribiendo en .txt ########");
        
        try {
            // Escritura de la lista de alumnos en un archivo CSV
            FileWriter fw = new FileWriter("alumnos.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            
            // Escribe cada alumno en una línea del archivo
            for (Alumno alumno : lista) {
                salida.println(alumno);
            }
            
            salida.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}