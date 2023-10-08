import java.util.Scanner;

class Alumno{
	String nombre;
    String matricula;
    String correo;
    String telefono;
    int promedio;

	public void setNombre(String nom){
		nombre = nom;
	}

	public String getNombre(){
		return nombre;
	}

	public void setMatricula(String mat){
		matricula = mat;
	}

	public String getMatricula(){
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

	public void setPromedio(int prom){
		promedio = prom;
	}

	public int getPromedio(){
		return promedio;
	}
}
public class Practica2POO{
	public static void main(String args[]){
		String prueba;
		int cant;
		Scanner scan = new Scanner(System.in);

		System.out.print("Ingrese la cantidad de alumnos que quiera ingresar: ");
		
		cant = scan.nextInt();

		Alumno al[] = new Alumno[cant];

		for(int i=0; i<cant; i++){
			int num = i+1;
			al[i] = new Alumno();
			System.out.print("Ingrese el nombre del alumno: ");
			prueba = scan.nextLine();
			al[i].setNombre(scan.nextLine());
			System.out.print("Ingrese la matricula del alumno: ");
			al[i].setMatricula(scan.nextLine());
			System.out.print("Ingrese el correo del alumno: ");
			al[i].setCorreo(scan.nextLine());
			System.out.print("Ingrese el telefono del alumno: ");
			al[i].setTelefono(scan.nextLine());
			System.out.print("Ingrese el promedio del alumno: ");
			al[i].setPromedio(scan.nextInt());
			System.out.println("");

			System.out.println("Alumno numero "+num);
			System.out.println("Nombre: "+al[i].getNombre());
			System.out.println("Matricula: "+al[i].getMatricula());
			System.out.println("Correo: "+al[i].getCorreo());
			System.out.println("Telefono: "+al[i].getTelefono());
			System.out.println("Promedio: "+al[i].getPromedio());
			System.out.println("");
		}	

	}
}