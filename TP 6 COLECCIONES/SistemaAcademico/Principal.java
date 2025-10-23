/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaAcademico;

public class Principal {

    public static void main(String[] args) {
        Profesor martin = new Profesor("1", "Martin Basemaestro", "Analisis de "
                    + "Datos", null);
        Profesor carlos = new Profesor("2", "Carlos Codigaster", "Lenguajes de "
                    + "Programacion", null);
        Profesor maria = new Profesor("3", "Maria Idiomatris", "Idiomas", null);
        
        Curso base1 = new Curso("B001", "Bases de Datos I");
        Curso base2 = new Curso("B002", "Bases de Datos II");
        Curso pro1 = new Curso("P001", "Programacion I");
        Curso pro2 = new Curso("P002", "Programacion II");
        Curso pro3 = new Curso("P003", "Programacion III");
        Curso in1 = new Curso("I001", "Ingles I");
        Curso in2 = new Curso("I002", "Ingles II");
        
        Universidad utnSN = new Universidad("Universidad Tecnologica Nacional "
                    + "Reg. San Nicolas");
        utnSN.agregarProfesor(carlos);
        utnSN.agregarProfesor(martin);
        utnSN.agregarProfesor(maria);
        utnSN.agregarCurso(base1);
        utnSN.agregarCurso(base2);
        utnSN.agregarCurso(pro1);
        utnSN.agregarCurso(pro2);
        utnSN.agregarCurso(pro3);
        utnSN.agregarCurso(in1);
        utnSN.agregarCurso(in2);
        
        utnSN.asignarProfesorACurso("B001", "1");
        utnSN.asignarProfesorACurso("P001", "2");
        utnSN.asignarProfesorACurso("P002", "2");
        utnSN.asignarProfesorACurso("I001", "3");
        utnSN.asignarProfesorACurso("I002", "3");
        System.out.println("LISTADO DE CURSOS DE LA UTN");
        utnSN.listarCursos();
        System.out.println("\nLISTADO DE PROFESORES");
        utnSN.listarProfesores();
        System.out.println("\nCAMBIO DE ASIGNACION DE UN CURSO A OTRO PROFESOR");
        utnSN.desAsignarProfesorACurso("I002", "3");
        utnSN.asignarProfesorACurso("I002", "1");
        System.out.println("\nLISTADO DE CURSOS DESPUES DEL CAMBIO DE ASIGNACION");
        utnSN.listarCursos();
        System.out.println("""
                           
                           LISTADO DE PROFESORES DESPUES DEL CAMBIO DE ASIGNACION""");
        utnSN.listarProfesores();
        System.out.println("""
                           
                           ELIMINAMOS UN CURSO Y LISTAMOS LOS PROFESORES Y LOS CURSOS""");
        utnSN.eliminarCurso("P002");
        utnSN.listarProfesores();
        System.out.println("");
        utnSN.listarCursos();
        System.out.println("""
                           
                           ELIMINAMOS UN PROFESOR Y LISTAMOS LOS CURSOS Y LOS PROFESORES""");
        utnSN.eliminarProfesor("3");
        System.out.println("");
        utnSN.listarCursos();
        System.out.println("");
        utnSN.listarProfesores();
        System.out.println("""
                           
                           LISTAMOS LOS PROFESORES CON LA CANTIDAD DE CURSOS QUE DICTA CADA UNO""");
        utnSN.cantidadCursosPorProfesor();
    }
}
