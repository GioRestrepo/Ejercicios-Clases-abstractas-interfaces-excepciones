package Ejercicio_4;

public class Main {
    public static void main(String[] args) throws BancoException {
          CuentaDeAhorros cuentaDeAhorros = new CuentaDeAhorros(2000,1213, "Luis Velez");
          CuentaCorriente cuentaCorriente = new CuentaCorriente(4000,5214, "Pedro Jimenez");

        System.out.println("Cuenta de ahorros");

        System.out.println(cuentaDeAhorros.saldo);
        cuentaDeAhorros.consignarDinero(2000);
        System.out.println(cuentaDeAhorros.saldo);

        cuentaDeAhorros.consignarDinero(2000);
        System.out.println(cuentaDeAhorros.saldo);

        cuentaDeAhorros.consignarDinero(2000);
        System.out.println(cuentaDeAhorros.saldo);

        cuentaDeAhorros.consignarDinero(2000);
        System.out.println(cuentaDeAhorros.saldo);

        cuentaDeAhorros.retirarDinero(2000);
        System.out.println(cuentaDeAhorros.saldo);

        cuentaDeAhorros.retirarDinero(2000);
        System.out.println(cuentaDeAhorros.saldo);

        cuentaDeAhorros.retirarDinero(2000);
        System.out.println(cuentaDeAhorros.saldo);

        cuentaDeAhorros.retirarDinero(2000);
        System.out.println(cuentaDeAhorros.saldo);

        cuentaDeAhorros.retirarDinero(2000);
        System.out.println(cuentaDeAhorros.saldo);

        System.out.println("Cuenta corriente");

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
