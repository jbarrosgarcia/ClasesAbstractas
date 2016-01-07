

package clasesabstractas;

public class Camion extends Vehiculo {
    private int nRuedas;
    
    public double calcularImposto(int cilindrada,int potencia){
      double imposto=cilindrada/30+potencia*20+nRuedas*20;
      return imposto;
    }
     public double calcularImpostoB(){
        double imposto=this.getCilindrada()/30+this.getPotencia()*20+this.nRuedas*20;
        return imposto;
    }
    public int getnRuedas() {
        return nRuedas;
    }

    public void setnRuedas(int nRuedas) {
        this.nRuedas = nRuedas;
    }

    public Camion(int nRuedas) {
        this.nRuedas = nRuedas;
    }

    public Camion() {
    }
    
    
}
