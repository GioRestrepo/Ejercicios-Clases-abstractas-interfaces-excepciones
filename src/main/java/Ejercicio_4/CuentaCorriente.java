package Ejercicio_4;

public class CuentaCorriente extends CuentaBancaria{


    public CuentaCorriente(float saldo, int numeroDeCuenta, String propietariio) {
        super(saldo, numeroDeCuenta, propietariio);
    }

    @Override
    public void consignarDinero(float dinero) {
        if (dinero > 0) {
            this.saldo += dinero;
            this.numeroDeConsignaciones++;
        }
    }

    @Override
    public void retirarDinero(float dinero) throws BancoException{
        if (dinero <= this.saldo && numeroDeRetiros <6) {
            this.saldo -= dinero;
            this.numeroDeRetiros++;
        } else{
            throw new BancoException("EL máximo de retiros es Cinco");
        }
    }


}
