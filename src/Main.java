
public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println("Resultado funcion suma: " + suma(3,4,5));
        System.out.println("El coche tiene " + miCoche.puertas + " puerta/s");
    }
    public static int suma( int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int puertas = 0;

    public void AgregarPuerta() {
        this.puertas++;
    }
}