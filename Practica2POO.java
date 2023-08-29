import java.util.Scanner;

class Alumno{
	String nombre;
    int matricula;
    String correo;
    String telefono;
    double promedio;

	public void setNombre(String nom){
		nombre = nom;
	}

	public String getNombre(){
		return nombre;
	}

	public void setMatricula(int mat){
		matricula = mat;
	}

	public int getMatricula(){
		return matricula;
	}

	public void setCorreo(String cor){
		correo = cor;
	}

	public String getCorreo(){
		return correo;
	}

	public void setTelefono(String tel){
		telefono = tel;
	}

	public String getTelefono(){
		return telefono;
	}

	public void setPromedio(double prom){
		promedio = prom;
	}

	public double getPromedio(){
		return promedio;
	}
}
public class Practica2POO{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		Alumno al[] = new Alumno[2];
		
		al[0] = new Alumno();
		al[0].setNombre("Arturo");
		al[0].setMatricula(1283887);
		al[0].setCorreo("arturoanturoturro@uabc.edu.mx");
		al[0].setTelefono("6638769879");
		al[0].setPromedio(98.9);

		al[1] = new Alumno();
		System.out.println("Ingrese el nombre del alumno: ");
		al[1].setNombre(scan.nextLine());
		System.out.println("Ingrese la matricula del alumno: ");
		al[1].setMatricula(Integer.parseInt(scan.nextLine()));
		System.out.println("Ingrese el correo del alumno: ");
		al[1].setCorreo(scan.nextLine());
		System.out.println("Ingrese el telefono del alumno: ");
		al[1].setTelefono(scan.nextLine());
		System.out.println("Ingrese el promedio del alumno: ");
		al[1].setPromedio(Double.parseDouble(scan.nextLine()));

		System.out.println("Alumno 1");
		System.out.println("Nombre: "+al[0].getNombre());
		System.out.println("Matricula: "+al[0].getMatricula());
		System.out.println("Correo: "+al[0].getCorreo());
		System.out.println("Telefono: "+al[0].getTelefono());
		System.out.println("Promedio: "+al[0].getPromedio());
		System.out.println("");

		System.out.println("Alumno 2");
		System.out.println("Nombre: "+al[1].getNombre());
		System.out.println("Matricula: "+al[1].getMatricula());
		System.out.println("Correo: "+al[1].getCorreo());
		System.out.println("Telefono: "+al[1].getTelefono());
		System.out.println("Promedio: "+al[1].getPromedio());
	}
}
