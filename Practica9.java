abstract class Figura{
	protected double x;
	protected double y;
	
	public Figura(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
}

//Interface
interface Dibujable{
	public void dibujar();
	public void pintar(String color);
}

//Interface
interface Rotable{
	public void rotar(int grados);
	public void invertir();
}

interface Aumentable{
	public void aumentar(int aum);
}

//Multiple Inheritance
class Circulo extends Figura implements Dibujable, Rotable, Aumentable{
	private double radio;

	public Circulo(double x, double y, double radio){
		super(x,y);
		this.radio = radio;
	}
	
	public double calcularArea(){
		return Math.PI*radio*radio;
	}

	public double calcularPerimetro(){
		return Math.PI*2*radio;
	}

	public void dibujar(){
		System.out.println("Imaginame DIBUJADO: soy UN CIRCULO");
	}

	public void pintar(String color){
		System.out.println("Imaginame PINTADO COLOR " + color + ": soy UN CIRCULO");
	}
	
	public void rotar(int grados){
		System.out.println("Imaginame ROTADO " + grados +" GRADOS: soy UN CIRCULO");
	}

	public void invertir(){
		System.out.println("Imaginame INVERTIDO: soy UN CIRCULO");
	}
	
	public void aumentar(int aum){
		System.out.println("Imaginame AUMENTADO " + aum +" VECES: soy UN CIRCULO");
	}
}
//Fin clase Circulo

//Multiple Inheritance
class Cuadrado extends Figura implements Dibujable, Rotable{
	private double lado;
	public Cuadrado(double x, double y, double lado){
		super(x,y);
		this.lado = lado;
	}
	
	public double calcularArea(){
		return lado*lado;
	}

	public double calcularPerimetro(){
		return 4*lado;
	}
	
	public void dibujar(){
		System.out.println("Imaginame DIBUJADO: soy UN CUADRADO");
	}

	public void pintar(String color){
		System.out.println("Imaginame PINTADO COLOR " + color + ": soy UN CUADRADO");
	}
	
	public void rotar(int grados){
		System.out.println("Imaginame ROTADO " + grados +" GRADOS: soy UN CUADRADO");
	}

	public void invertir(){
		System.out.println("Imaginame INVERTIDO: soy UN CUADRADO");
	}

	public void aumentar(int aum){
		System.out.println("Imaginame AUMENTADO " + aum +" VECES: soy UN CUADRADO");
	}
} //Fin clase Cuadrado

//Multiple Inheritance
class Triangulo extends Figura implements Dibujable, Rotable{
	private double base;
	private double altura;
	private double lado2;
	private double lado3;

	public Triangulo(double x, double y, double base, double altura, double lado2, double lado3){
		super(x,y);
		this.base = base;
		this.altura = altura;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	public double calcularArea(){
		return (base*altura)/2;
	}

	public double calcularPerimetro(){
		return base+lado2+lado3;
	}
	
	public void dibujar(){
		System.out.println("Imaginame DIBUJADO: soy UN TRIANGULO");
	}
	
	public void pintar(String color){
		System.out.println("Imaginame PINTADO COLOR " + color + ": soy UN TRIANGULO");
	}

	public void rotar(int grados){
		System.out.println("Imaginame ROTADO " + grados +" GRADOS: soy UN TRIANGULO");
	}

	public void invertir(){
		System.out.println("Imaginame INVERTIDO: soy UN TRIANGULO");
	}

	public void aumentar(int aum){
		System.out.println("Imaginame AUMENTADO " + aum +" VECES: soy UN TRIANGULO");
	}

}//Fin clase Triangulo

public class Practica9{

	public static void main(String args[]){
		Circulo cir = new Circulo(200.0, 235.0, 23.5);
		Cuadrado cua = new Cuadrado(200.0, 235.0, 23.5);
		Triangulo tri = new Triangulo(200.0, 235.0, 23.5, 16.5,23.5,23.5);
		System.out.println("Area del Circulo: "+ cir.calcularArea());
		System.out.println("Perimetro del Circulo: "+cir.calcularPerimetro());
		cir.dibujar();
		cir.pintar("ROJO");
		cir.rotar(20);
		cir.invertir();
		cir.aumentar(2);
		System.out.println();
		System.out.println("Area del Cuadrado: "+ cua.calcularArea());
		System.out.println("Perimetro del Cuadrado: "+cua.calcularPerimetro());
		cua.dibujar();
		cua.pintar("AZUL");
		cua.rotar(20);
		cua.invertir();
		cua.aumentar(4);
		System.out.println();
		System.out.println("Area del Triangulo: "+ tri.calcularArea());
		System.out.println("Perimetro del Triangulo: "+tri.calcularPerimetro());
		tri.dibujar();
		tri.pintar("VERDE");
		tri.rotar(20);
		tri.invertir();
		tri.aumentar(3);
	}
}
		
