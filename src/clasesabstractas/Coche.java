
package clasesabstractas;


public class Coche extends Vehiculo{
    private int nPuertas;
    public Coche(){}
    public Coche(int numPu){
        this.nPuertas=numPu;
    }
    public double calcularImposto(int cilindrada,int potencia){
      double imposto=cilindrada/20+potencia*20;
      return imposto;
    }
     public double calcularImpostoB(){
        double imposto=this.getCilindrada()/20+this.getPotencia()*20;
        return imposto;
    }
    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    @Override
    public String toString() {
        return "Coche{" + "nPuertas=" + nPuertas + '}';
    }
    
}
