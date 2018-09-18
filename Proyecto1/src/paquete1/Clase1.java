/**
 * 
 */
package paquete1;

/**
 * @author alejandro
 *
 */
public class Clase1 {

	/**
	 * 
	 */
	private Integer numero;
	protected Integer numero2;
	
	public Integer getNumero2() {
		return numero2;
	}
	public void setNumero2(Integer numero2) {
		this.numero2 = numero2;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
		this.numero2=3;
	}
	public Clase1() {
		// TODO Auto-generated constructor stub
		numero = 0;
	}
	public Clase1(Integer a) {
		// TODO Auto-generated constructor parametrizado
		numero = a;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clase1 c = new Clase1(8);
		Clase1 d = new Clase2();
		
		System.out.println("esto es por consola " + d.getNumero2() );
		System.out.println("esto es un mensaje por consola" + c.getNumero());
		
		
	}

}
