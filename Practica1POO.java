
import java.util.Scanner;

public class Practica1POO{
	public static void main(String args[]){

		Alumno al1 = new Alumno();

		al1.setNombre("Pedro");
		al1.setMatricula("1284776");
		al1.setTelefono("6637784658");
		al1.setCorreo("pedroelpadre@uabc.edu.mx");
		al1.setPromedio(69.42);

		System.out.println("Datos del Alumno");
		System.out.println("Nombre: "+ al1.getNombre());
		System.out.println("Matricula: "+al1.getMatricula());
		System.out.println("Telefono: "+al1.getTelefono());
		System.out.println("Correo: "+al1.getCorreo());
		System.out.println("Promedio: "+al1.getPromedio());
		
		}
}



class Alumno{
	String nombre;
	String matricula;
	String telefono;
	String correo;
	float promedio;


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

	public void setTelefono(String tel){
		telefono = tel;
	}

	public String getTelefono(){
		return telefono;
	}

	public void setCorreo(String corr){
		correo = corr;
	}

	public String getCorreo(){
		return correo;
	}

	public void setPromedio(float prom){
		promedio = prom;
	}

	public float getPromedio(){
		return promedio;
	}

}