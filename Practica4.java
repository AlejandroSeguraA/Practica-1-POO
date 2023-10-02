// PRACTICA 4
// ALEJANDRO SEGURA AGUILAR

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
    int promedio, grupo;

    public void setMatricula(String matr){
        matricula = matr;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setCalif(int prom){
        promedio = prom;
    }

    public int getCalif(){
        return promedio;
    }

    public void setGrupo(int grup){
        grupo = grup;
    }

    public int getGrupo(){
        return grupo;
    }
}

class Empleado extends Persona{
    int numEmp;
    int sueldo;
    String seguro;

    public void setNumEmp(int numE){
        numEmp = numE;
    }

    public int getNumEmp(){
        return numEmp;
    }

    public void setSueldo(int suel){
        sueldo = suel;
    }
    
    public int getSueldo(){
        return sueldo;
    }

    public void setSeguro(String seg){
        seguro = seg;
    }

    public String getSeguro(){
        return seguro;
    }
}

class Familia extends Persona{
    String direccion, estCivil, rolFamiliar;

    public void setDireccion(String dir){
        direccion = dir;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setEstadoC(String estC){
        estCivil = estC;
    }

    public String getEstadoC(){
        return estCivil;
    }

    public void setRol(String rol){
        rolFamiliar = rol;
    }

    public String getRol(){
        return rolFamiliar;
    }


}

public class Practica4{
    public static void main(String args[]){

        Alumno al1 = new Alumno();
        Empleado emp1 = new Empleado();
        Familia fam1 = new Familia();

        al1.setNombre("Miguel");
        al1.setCorreo("miguelmigui@uabc.edu.mx");
        al1.setTelfn("6645554356");
        al1.setMatricula("1282654");
        al1.setCalif(96);

        emp1.setNombre("Jesus");
        emp1.setCorreo("jesuselsus@uabc.edu.mx");
        emp1.setTelfn("6645228695");
        emp1.setNumEmp(15);
        emp1.setSueldo(2600);
        emp1.setSeguro("6553154");

        fam1.setNombre("Rene");
        fam1.setCorreo("Reneelnene@yahoo.com");
        fam1.setTelfn("6646226484");
        fam1.setDireccion("Calle bienebiene 563");
        fam1.setEstadoC("Casado");
        fam1.setRol("Padre");

        System.out.println("ALUMNO");
        System.out.println("Nombre Alumno: "+al1.getNombre());
        System.out.println("Correo Alumno: "+al1.getCorreo());
        System.out.println("Telefono Alumno: "+al1.getTelfn());
        System.out.println("Matricula Alumno: "+al1.getMatricula());
        System.out.println("Promedio Alumno: "+al1.getCalif());
        
        System.out.println("EMPLEADO");
        System.out.println("Nombre Empleado: "+emp1.getNombre());
        System.out.println("Correo Empleado: "+emp1.getCorreo());
        System.out.println("Telefono Empleado: "+emp1.getTelfn());
        System.out.println("Numero de Empleado: "+emp1.getNumEmp());
        System.out.println("Sueldo Empleado: "+emp1.getSueldo());
        System.out.println("Numero de Seguro Empleado: "+emp1.getSeguro());

        System.out.println("FAMILIA");
        System.out.println("Nombre Familiar: "+fam1.getNombre());
        System.out.println("Correo Familiar: "+fam1.getCorreo());
        System.out.println("Telefono Familiar: "+fam1.getTelfn());
        System.out.println("Direccion Familiar: "+fam1.getDireccion());
        System.out.println("Estado Civil Familiar: "+fam1.getEstadoC());
        System.out.println("Rol Familiar: "+fam1.getRol());
    }
}