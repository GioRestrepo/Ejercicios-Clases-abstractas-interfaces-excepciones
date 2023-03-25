package Ejercicio_4;

public class CuentaDeAhorros extends CuentaBancaria{


    public CuentaDeAhorros(float saldo, int numeroDeCuenta, String propietariio) {
        super(saldo, numeroDeCuenta, propietariio);
    }

    @Override
    public void consignarDinero(float dinero) {
        if (dinero > 0) {
            if(dinero > 0 && numeroDeConsignaciones<2){
                //float dineroprop = this.saldo;
                this.saldo += (dinero + (dinero*0.05));
                this.numeroDeConsignaciones++;
            }else{
            this.saldo += dinero;
            this.numeroDeConsignaciones++;
            }
        }


    }

    @Override
    public void retirarDinero(float dinero) throws BancoException {
        
          if (dinero <= this.saldo && numeroDeRetiros >3) {
            this.saldo -= dinero - (dinero*0.03);
            this.numeroDeRetiros++;
          } else if (dinero <= this.saldo) {
              this.saldo -= dinero;
              this.numeroDeRetiros++;
          }else{
              throw new BancoException("Saldo insuficiente");
          }

    }


}
