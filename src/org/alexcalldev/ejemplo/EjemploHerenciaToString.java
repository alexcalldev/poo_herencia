package org.alexcalldev.ejemplo;

import org.alexcalldev.pooherencia.Alumno;
import org.alexcalldev.pooherencia.AlumnoInternacional;
import org.alexcalldev.pooherencia.Persona;
import org.alexcalldev.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {
        System.out.println("======== Creando la instancia de la clase Alumno ========");
        Alumno alumno = new Alumno("Alexander", "Calle", 24, "El Gran Maestro");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("alex@hotmail.com");

        System.out.println("======= Creando la instancia de la clase AlumnoInternacional ======= ");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("peter@hotmail.com");


        System.out.println("===== CREANDO LA INSTANCIA DE LA CLASE PROFESOR ======");
        Profesor profesor = new Profesor("Rosario", "Arteaga", "Matematicas");
        profesor.setEdad(23);
        profesor.setEmail("rosario@gmail.com");

        System.out.println("======= - =======");
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
        }
        public static void imprimir(Persona persona) {
            System.out.println("==========================================");
            System.out.println(persona);

            }
        }


