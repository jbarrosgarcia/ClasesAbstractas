
package clasesabstractas;


public abstract class Vehiculo {
    private int cilindrada;
    private int potencia;

    public Vehiculo() {
    }

    public Vehiculo(int cilindrada, int potencia) {
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }
    
    public int getCilindrada() {
        return cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public String arrancar(){
        String arrancar="Arranco el vehiuculo";
        return arrancar;
    }
    public abstract double calcularImposto(int cilindrada,int potencia);
    public abstract double calcularImpostoB();
}
