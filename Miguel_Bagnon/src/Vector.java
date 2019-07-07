
public class Vector {
	private double x;
	private double y;
	public int modulo;

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Vector(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * @version 1.0 
	 * @return devuelve el modulo de un vector
	 */
	public double modulo() {
		return Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));
		
	}
	
}
