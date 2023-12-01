import java.util.Scanner;

class Persona {
    String nombre;

    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getNombre() {
        return nombre;
    }
}

class Alumno extends Persona {
    String matricula;

    public void setMatricula(String mat) {
        matricula = mat;
    }

    public String getMatricula() {
        return matricula;
    }
}

class Profesor extends Persona {
    int numEmpleado;

    public void setNumEmpleado(int numemp) {
        numEmpleado = numemp;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }
}

class Materia {
    String clave;
    String nombre;

    public void setClave(String claveMateria) {
        clave = claveMateria;
    }

    public String getClave() {
        return clave;
    }

    public void setNombre(String nombreMateria) {
        nombre = nombreMateria;
    }

    public String getNombre() {
        return nombre;
    }
}

class Grupo {
    String Id_grupo;
    Materia materia;
    Profesor profe;
    Alumno alus[];

    public void setIdGrupo(String id) {
        Id_grupo = id;
    }

    public String getIdGrupo() {
        return Id_grupo;
    }

    public void setMateria(Profesor profesor) {
        profe = profesor;
    }

    public Profesor getMateria() {
        return profe;
    }

    public void setProfesor(Profesor profesor) {
        profe = profesor;
    }

    public Profesor getProfesor() {
        return profe;
    }

    public void setAlumnos(Alumno[] alumnos) {
        alus = alumnos;
    }

    public Alumno[] getAlumnos() {
        return alus;
    }
}

public class Practica7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de grupos: ");
        int cantidadGrupos = sc.nextInt();
        sc.nextLine();

        Grupo[] grupos = new Grupo[cantidadGrupos];

        for (int i = 0; i < cantidadGrupos; i++) {
            System.out.println("Ingrese los datos del grupo " + (i + 1) + ": ");
            grupos[i] = new Grupo();

            System.out.println("ID de Grupo: ");
            grupos[i].setIdGrupo(sc.next());
            sc.nextLine();

            System.out.println("Materia: ");
            Materia materia = new Materia();
            materia.setNombre(sc.nextLine());


            System.out.println("Datos del profesor del grupo " + (i + 1) + ": ");
            Profesor profesor = new Profesor();

            System.out.println("Nombre del Profesor: ");
            profesor.setNombre(sc.nextLine());

            System.out.println("Número de Empleado del Profesor: ");
            profesor.setNumEmpleado(sc.nextInt());

            grupos[i].setProfesor(profesor);

            System.out.println("Ingrese la cantidad de alumnos en el grupo " + (i + 1) + ": ");
            int cantidadAlumnos = sc.nextInt();
            sc.nextLine();

            Alumno[] alumnos = new Alumno[cantidadAlumnos];

            for (int j = 0; j < cantidadAlumnos; j++) {
                System.out.println("\nIngrese los datos del alumno " + (j + 1) + ": ");
                alumnos[j] = new Alumno();

                System.out.println("Nombre: ");
                alumnos[j].setNombre(sc.nextLine());

                System.out.println("Matrícula: ");
                alumnos[j].setMatricula(sc.nextLine());

            }

            grupos[i].setAlumnos(alumnos);
        }

        sc.close();

        for (int i = 0; i < cantidadGrupos; i++) {
            System.out.println("Datos del grupo " + (i + 1) + ": ");
            System.out.println("ID de Grupo: " + grupos[i].getIdGrupo());
            System.out.println("Materia: " + grupos[i].getMateria().getNombre());
            

            Profesor profesor = grupos[i].getProfesor();
            System.out.println("Profesor del Grupo: " + profesor.getNombre());
            System.out.println("Número de Alumnos en el Grupo: " + grupos[i].getAlumnos().length);
        }
    }
}
