package Ejercicio_4;

public class Main {
    public static void main(String[] args) throws BancoException {
          CuentaDeAhorros cuentaDeAhorros = new CuentaDeAhorros(2000,1213, "Luis Velez");
          CuentaCorriente cuentaCorriente = new CuentaCorriente(4000,5214, "Pedro Jimenez");

        cuentaCorriente.retirarDinero(100);
        System.out.println(cuentaCorriente.saldo);
        cuentaCorriente.retirarDinero(100);
        System.out.println(cuentaCorriente.saldo);
        cuentaCorriente.retirarDinero(100);
        System.out.println(cuentaCorriente.saldo);
        cuentaCorriente.retirarDinero(100);
        System.out.println(cuentaCorriente.saldo);
        cuentaCorriente.retirarDinero(100);
        System.out.println(cuentaCorriente.saldo);
        cuentaCorriente.retirarDinero(100);
        System.out.println(cuentaCorriente.saldo);
        cuentaCorriente.retirarDinero(100);
        System.out.println(cuentaCorriente.saldo);



    }
}
