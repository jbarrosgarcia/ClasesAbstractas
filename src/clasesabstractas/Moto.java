
package clasesabstractas;


public class Moto extends Vehiculo{
    
    public Moto() {
    }
    
    public double calcularImposto(int cilindrada,int potencia){
      double imposto=cilindrada/30+potencia*10;
      return imposto;
    }
    public double calcularImpostoB(){
        double imposto=this.getCilindrada()/30+this.getPotencia()*10;
        return imposto;
    }
   
}
