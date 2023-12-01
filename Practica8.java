class Motor {
    private String tipo;
    private int cilindros;

    //Constructor con parametros
    public Motor(String tipo, int cilindros) {
        this.tipo = tipo;
        this.cilindros = cilindros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }
}

class Transmision {
    private String tipo;
    private int marchas;

    // Constructor con parámetros
    public Transmision(String tipo, int marchas) {
        this.tipo = tipo;
        this.marchas = marchas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }
}

class Neumatico {
    private String marca;
    private int presion;

    // Constructor con parámetros
    public Neumatico(String marca,int presion) {
        this.marca = marca;
        this.presion = presion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }
}

class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private Motor motor;
    private Transmision transmision;
    private Neumatico[] neumaticos;

     public Vehiculo(String marca, String modelo, int anio, Motor motor, Transmision transmision, Neumatico[] neumaticos) {
         this.marca = marca;
         this.modelo = modelo;
         this.anio = anio;
         this.motor = motor;
         this.transmision = transmision;
         this.neumaticos = neumaticos;
     }

     public String getMarca() {
         return marca;
     }

     public void setMarca(String marca) {
         this.marca = marca;
     }

     public String getModelo() {
         return modelo;
     }

     public void setModelo(String modelo) {
         this.modelo = modelo;
     }

     public int getAnio() {
         return anio;
     }

     public void setAnio(int anio) {
         this.anio = anio;
     }

     public Motor getMotor() {
         return motor;
     }

     public void setMotor(Motor motor) {
         this.motor = motor;
     }

     public Transmision getTransmision() {
         return transmision;
     }

     public void setTransmision(Transmision transmision) {
         this.transmision = transmision;
     }

      public Neumatico[] getNeumaticos() {
          return neumaticos;
      }

      public void setNeumaticos(Neumatico[] neumaticos) {
          this.neumaticos = neumaticos;
      }

      public void mostrarAtributos() {
          System.out.println("Carro: " + marca + " " + modelo + " " + anio);
          System.out.println("");
          System.out.println("Motor:");
          System.out.println("Tipo: " + motor.getTipo());
          System.out.println("Cantidad de cilindros: " + motor.getCilindros());
          System.out.println("");
          System.out.println("Transmisión:");
          System.out.println("Tipo: " + transmision.getTipo());
          System.out.println("Cantidad de cambios: " + transmision.getMarchas());
          System.out.println("");
          System.out.println("Neumáticos:");
          for (int i = 0; i < neumaticos.length; i++) {
              System.out.println("Neumático " + (i + 1) + ":");
              System.out.println("Marca: " + neumaticos[i].getMarca());
              System.out.println("Presión: " + neumaticos[i].getPresion());
              System.out.println("");
          }
      }
 }

 public class Practica8 {
     public static void main(String[] args) {
         Motor motorCoche = new Motor("Gasolina", 8);
         Transmision transmisionCoche = new Transmision("Estándar", 5);
         Neumatico[] neumaticosCoche = {
             new Neumatico("Michelin", 35), new Neumatico("Michelin", 35), new Neumatico("Michelin", 34),new Neumatico("Michelin", 36)};
 
         Vehiculo coche = new Vehiculo("Dodge", "Challenger",1985, motorCoche, transmisionCoche, neumaticosCoche);
 
         coche.mostrarAtributos();
     }
 }
