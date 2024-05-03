package cuentas;

public class CCuenta {

//Esta clase define cómo funciona una cuenta de un banco
	
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    public double estado()
    {
        return getSaldo();
    }
    
    /*Una vez definidos los atributos y la cuenta, vamos a ver las acciones
     *"ingresar" nos permite introducir cantidades en la cuenta, devuelve la suma de la cantidad al saldo
     La limitaciones son que no se puede ingresar cantidades negativas, porque ya no sería un ingreso*/

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /*"retirar" nos permite restar cantidades al saldo, devuelve la resta de la cantidad al saldo
     Por este motivo, las limitaciones son la cantidad no puede ser ni negativa ni superior al saldo, ya que el saldo no puede quedar en negativo*/

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    //El resto consiste en los getters y los setters de los atributos

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInteres() {
		return tipoInteres;
	}

	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}