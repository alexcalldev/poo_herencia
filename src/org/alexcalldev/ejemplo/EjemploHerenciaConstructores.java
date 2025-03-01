package org.alexcalldev.ejemplo;

import org.alexcalldev.pooherencia.*;

public class EjemploHerenciaConstructores {
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
            System.out.println("Imprimiendo datos en comun del tipo Persona: ");
            System.out.println("nombre: " + persona.getNombre()
                    + ", apellido:  " + persona.getApellido()
                    + ", edad: " + persona.getEdad()
                    + ", email: " + persona.getEmail());

            if (persona instanceof Alumno) {
                System.out.println("Imprimiendo los datos del tipo Alumno");
                System.out.println("Institucion " + ((Alumno) persona).getInstitucion());
                System.out.println("Nota matematicas " + ((Alumno) persona).getNotaMatematica());
                System.out.println("Nota historia " + ((Alumno) persona).getNotaHistoria());
                System.out.println("Nota castellano " + ((Alumno) persona).getNotaCastellano());
                if (persona instanceof AlumnoInternacional) {
                    System.out.println("Imprimiendo los datos del tipo Alumno Internacional");
                    System.out.println("Nota idioma " + ((AlumnoInternacional) persona).getNotaIdiomas());
                    System.out.println("Pais " + ((AlumnoInternacional) persona).getPais());
                    }
                System.out.println("============== Sobre escritura de promedio ==============");
                System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
                System.out.println("============== Sobre escritura de promedio ==============");

                }
            if (persona instanceof Profesor) {
                System.out.println("Imprimiendo los datos del tipo Profesor");
                System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
            }
            System.out.println("============== Sobre escritura de saludo ==============");
            System.out.println(persona.saludar());
            System.out.println("=======================================");

            }
        }


