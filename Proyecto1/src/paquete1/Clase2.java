/**
 * 
 */
package paquete1;

/**
 * @author alejandro
 *
 */
public class Clase2 extends Clase1 {

	/**
	 * 
	 */
	private Integer numero3;
	public Integer getNumero3() {
		return numero3;
	}

	public void setNumero3(Integer numero3) {
		this.numero3 = numero3;
	}

	public Clase2() {
		// TODO Auto-generated constructor stub
		this.numero2 =1;
		this.numero3=0;
	}

	/**
	 * @param a
	 */
	public Clase2(Integer a) {
		super(a);
		
		this.numero3=a;
		// TODO Auto-generated constructor stub
	}

}
