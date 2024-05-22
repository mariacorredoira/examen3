package examen3refactorizado;
/**
 * @author María Corredoira Martínez 22/05/2024
 */

/**
 * Este es el nombre de la clase
 * @see  CCuenta
 */
public class CCuenta {
    // Propiedades de la Clase Cuenta
    private double dSaldo;
    private String nombre;

    public static void main(String[] args, float cantidad) {

        operativa_cuenta();
    }

	private static void operativa_cuenta() {
		CCuenta cuenta1 = new CCuenta();

        System.out.println("Saldo Incial: " + cuenta1.getdSaldo() + " euros");

        cuenta1.ingresar(-100);
        System.out.println("Saldo Incial: " + cuenta1.getdSaldo() + " euros");
        cuenta1.ingresar(100);
        System.out.println("Saldo tras ingreso: " + cuenta1.getdSaldo() + " euros");
        cuenta1.ingresar(2000);
        System.out.println("Saldo tras ingreso: " + cuenta1.getdSaldo() + " euros");

        cuenta1.ingresar(3000);
        System.out.println("Saldo tras ingreso: " + cuenta1.getdSaldo() + " euros");
        cuenta1.retirar(50);
        System.out.println("Saldo tras retirada: " + cuenta1.getdSaldo() + " euros");
	}
/**
 * 
 * @param cantidad esta es la cantidad que se permite ingresar en el método ingresar
 * @return iCodErr
 */
    /* Modificado para el primer commit */
    public int ingresar(double cantidad) {
        int iCodErr;

        if (!(cantidad >= 0 || cantidad <= 3000)) {
            System.out.println("No se puede ingresar una cantidad negativa ni superior a 3000€ (sin ser notificada con formulario)");
            iCodErr = 1;
        } else if (cantidad == 3002) {
            System.out.println(
                    "Le recordamos que estamos obligados a notificar a Hacienda dicho ingreso (superior o igual a 3002€)");
            setdSaldo(getdSaldo() + cantidad);
            iCodErr = 0;
        } else {
            setdSaldo(getdSaldo() + cantidad);
            iCodErr = 2;
        }

        return iCodErr;
    }

    /*
     * Metodo para retirar cantidades en la cuenta. Modifica el saldo.
     */
    /**
     * 
     * @param cantidad esta es la cantidad que se va a retirar
     */
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede retirar una cantidad negativa");
        } else if (getdSaldo() < cantidad) {
            System.out.println("No  hay suficiente saldo");
        } else {
            setdSaldo(getdSaldo() - cantidad);
            System.out.println("Le quedan " + getdSaldo() + " en cuenta");
        }
    }

    /**
     * valor devuelto del método saldo
     * @return Saldo
     */
	public double getdSaldo() {
		return dSaldo;
	}
/**
 * metodo dSaldo
 * @param dSaldo 
 */
	public void setdSaldo(double dSaldo) {
		this.dSaldo = dSaldo;
	}
/**
 * valor devuelto para el nombre
 * @return nombre
 */
	public String getNombre() {
		return nombre;
	}
/**
 * metodo para nombre 
 * @param nombre
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
