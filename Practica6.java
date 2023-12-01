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

    public String getNombre(){
        return nombre;
    }
}

class Grupo {
    String Id_grupo;
    Materia materia = new Materia();
    Profesor profe = new Profesor();
    Alumno alus[] = new Alumno[10];

    public void setIdGrupo(String id) {
        Id_grupo = id;
    }

    public String getIdGrupo() {
        return Id_grupo;
    }
}

public class Practica6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Grupo grupo = new Grupo();
        grupo.setIdGrupo("542");
        grupo.materia.setNombre("POO");
        grupo.profe.setNombre("J.Reyes Juarez Ramirez");
        grupo.profe.setNumEmpleado(1956);
        grupo.materia.setClave("36526");
        for(int i=0;i<10;i++){
            grupo.alus[j] = new Alumno();
        }
        grupo.alus[0].setNombre("Luis Adrián Brambila Molina");
        grupo.alus[1].setNombre("David Arath Cruz Ibarra");
        grupo.alus[2].setNombre("Laura Fernanda Gómez Perdomo");
        grupo.alus[3].setNombre("Christopher Omar González Nungaray");
        grupo.alus[4].setNombre("Christian Yael Granados Mendoza");
        grupo.alus[5].setNombre("Erick Jovan Lerma García");
        grupo.alus[6].setNombre("Sandi Guilma Roblero Escalante");
        grupo.alus[7].setNombre("Alexis Eduardo Seaman López");
        grupo.alus[8].setNombre("Alejandro Segura Aguilar");
        grupo.alus[9].setNombre("Valentina Segura Solís");

        System.out.println("Grupo "+ grupo.getIdGrupo());
        System.out.println("Materia: "+grupo.materia.getNombre());
        System.out.println("Nombre Profesor: "+grupo.profe.getNombre());
        System.out.println("Numero de Empleado de Profesor: "+grupo.profe.getNumEmpleado());
        System.out.println("Lista de Alumnos:");
        
        for(int j = 0; j<10;j++){
            System.out.println(""+grupo.alus[i].getNombre());
        }
    }
}
