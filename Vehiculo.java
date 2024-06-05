//Clase padre Vehiculo
public class Vehiculo{
    private String marca;
    private String modelo;
    private int ano_fabricacion;

    public Vehiculo(String marca, String modelo, int ano_fabricacion){
        this.marca = marca;
        this.modelo = modelo;
        this.ano_fabricacion = ano_fabricacion;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAno_Fabricacion(){
        return ano_fabricacion;
    }
    public String obtener_informacion(){
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año de Fabricacion: " + ano_fabricacion;
    }

}

//SubClase Coche
public class Coche extends Vehiculo {
    private int num_puertas;
    private String tipo_combustible;

    public Coche(String marca, String modelo, int ano_fabricacion, int num_puertas, String tipo_combustible){
        super(marca, modelo, ano_fabricacion);
        this.num_puertas = num_puertas;
        this.tipo_combustible = tipo_combustible;
    }
    @Override
    public String obtener_informacion(){
        return 
        super.obtener_informacion() + ", Numero de Puertas: " + num_puertas + ", Tipo de combustible: "
        + tipo_combustible;
    }
}

//SubClase Motocicleta
public class Motocicleta extends Vehiculo {
    private int cilindrada;
    private String tipo;

    public Motocicleta(String marca, String modelo, int ano_fabricacion, int cilindrada, String tipo){
        super(marca, modelo, ano_fabricacion);
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }
    @Override
    public String obtener_informacion(){
        return 
        super.obtener_informacion() + ", Cilindrada: " + cilindrada + "cc, Tipo: "+ tipo;
    }
}

//SubClase Camion
public class Camion extends Vehiculo {
    private double capacidad_carga;
    private String tipo_carroceria;

    public Camion(String marca, String modelo, int ano_fabricacion, double capacidad_carga,
     String tipo_carroceria){
        super(marca, modelo, ano_fabricacion);
        this.capacidad_carga = capacidad_carga;
        this.tipo_carroceria = tipo_carroceria;
    }
    @Override
    public String obtener_informacion(){
        return 
        super.obtener_informacion() + ", Capacidead de carga: " + capacidad_carga +
         "toneladas, Tipo de carroceria: "+ tipo_carroceria;
    }
}

//Clase de prueba
public class Prueba {
    public static void main(String[] args){
        //Creacion de Vehiculos 
        Vehiculo coche = new Coche("Toyota", "Corolla", 2019, 4, "Gasolina");
        Vehiculo moto = new Motocicleta("Honda", "CBR", 2020, 600, "Deportiva");
        Vehiculo camion = new Camion("Hyundai", "Genesis", 2018, 20.5, "Remolque");
        //Mostrar Informacion
        System.out.println("Informacion del Coche: "+ coche.obtener_informacion());
        System.out.println("Informacion de la Motocicleta: "+ moto.obtener_informacion());
        System.out.println("Informacion del Camion: " + camion.obtener_informacion());
    }
}

