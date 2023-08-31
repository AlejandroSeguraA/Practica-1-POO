import java.util.Scanner;

class Persona{
	String nombre;
	String correo;
	String telefono;

	public void setNombre(String nom){
		nombre = nom;
	}

	public String getNombre(){
		return nombre;
	}

	public void setCorreo(String cor){
		correo = cor;
	}

	public String getCorreo(){
		return correo;
	}

	public void setTelfn(String tel){
		telefono = tel;
	}

	public String getTelfn(){
		return telefono;
	}
}


class Alumno extends Persona{
    String matricula;
    double promedio;

    public void setMatricula(String matr){
        matricula = matr;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setPromedio(double prom){
        promedio = prom;
    }

    public double getPromedio(){
        return promedio;
    }
}

class Profesor extends Persona{
    int numEmp;
    double sueldo;

    public void setNumEmp(int numE){
        numEmp = numE;
    }

    public int getNumEmp(){
        return numEmp;
    }

    public void setSueldo(double suel){
        sueldo = suel;
    }

    public double getSueldo(){
        return sueldo;
    }
}


public class Practica3POO{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        Alumno al1 = new Alumno();
        Alumno al2 = new Alumno();
        Alumno al3 = new Alumno();
        Alumno al4 = new Alumno();

        Profesor prof1 = new Profesor();

        al1.setNombre("Miguel");
        al1.setCorreo("miguelmigui@uabc.edu.mx");
        al1.setTelfn("6645554356");
        al1.setMatricula("1282654");
        al1.setPromedio(99.1);

        al2.setNombre("Jairo");
        al2.setCorreo("Jairoelmairo@uabc.edu.mx");
        al2.setTelfn("6633335577");
        al2.setMatricula("1280778");
        al2.setPromedio(86.2);

		System.out.println("Ingrese el nombre del tercer alumno: ");
		al3.setNombre(scan.nextLine());
		System.out.println("Ingrese el correo del tercer alumno: ");
		al3.setCorreo(scan.nextLine());
		System.out.println("Ingrese el telefono del tercer alumno: ");
		al3.setTelfn(scan.nextLine());
        System.out.println("Ingrese la matricula del tercer alumno: ");
        al3.setMatricula(scan.nextLine());
		System.out.println("Ingrese el promedio del tercer alumno: ");
		al3.setPromedio(Double.parseDouble(scan.nextLine()));

		System.out.println("Ingrese el nombre del cuarto alumno: ");
		al4.setNombre(scan.nextLine());
		System.out.println("Ingrese la matricula del cuarto alumno: ");
		al4.setMatricula(scan.nextLine());
		System.out.println("Ingrese el correo del cuarto alumno: ");
		al4.setCorreo(scan.nextLine());
		System.out.println("Ingrese el telefono del cuarto alumno: ");
		al4.setTelfn(scan.nextLine());
		System.out.println("Ingrese el promedio del cuarto alumno: ");
		al4.setPromedio(Double.parseDouble(scan.nextLine()));

        prof1.setNombre("Jesus");
        prof1.setCorreo("jesuselsus@uabc.edu.mx");
        prof1.setTelfn("6645228695");
        prof1.setNumEmp(15);
        prof1.setSueldo(6479.50);

        System.out.println("Nombre primer Alumno: "+al1.getNombre());
        System.out.println("Correo primer Alumno: "+al1.getCorreo());
        System.out.println("Telefono primer Alumno: "+al1.getTelfn());
        System.out.println("Matricula primer Alumno: "+al1.getMatricula());
        System.out.println("Promedio primer Alumno: "+al1.getPromedio());
        System.out.println("");

        System.out.println("Nombre segundo Alumno: "+al2.getNombre());
        System.out.println("Correo segundo Alumno: "+al2.getCorreo());
        System.out.println("Telefono segundo Alumno: "+al2.getTelfn());
        System.out.println("Matricula segundo Alumno: "+al2.getMatricula());
        System.out.println("Promedio segundo Alumno: "+al2.getPromedio());
        System.out.println("");

        System.out.println("Nombre tercer Alumno: "+al3.getNombre());
        System.out.println("Correo tercer Alumno: "+al3.getCorreo());
        System.out.println("Telefono tercer Alumno: "+al3.getTelfn());
        System.out.println("Matricula tercer Alumno: "+al3.getMatricula());
        System.out.println("Promedio tercer Alumno: "+al3.getPromedio());
        System.out.println("");

        System.out.println("Nombre cuarto Alumno: "+al4.getNombre());
        System.out.println("Correo cuarto Alumno: "+al4.getCorreo());
        System.out.println("Telefono cuarto Alumno: "+al4.getTelfn());
        System.out.println("Matricula cuarto Alumno: "+al4.getMatricula());
        System.out.println("Promedio cuarto Alumno: "+al4.getPromedio());
        System.out.println("");


        System.out.println("Nombre Profesor: "+prof1.getNombre());
        System.out.println("Numero de Empleado: "+prof1.getNumEmp());
        System.out.println("Correo Profesor: "+prof1.getCorreo());
        System.out.println("Telefono Profesor: "+prof1.getTelfn());
        System.out.println("Sueldo: "+prof1.getSueldo());
    }
}
