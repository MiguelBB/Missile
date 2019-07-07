
abstract class Misil extends Proyectil {
	public static int velocidad;
	Misil (int t0, int t, Vector pos, Vector pos0){
		super(t0, t, pos0, pos0);
	}
	/**
	 * 
	 * @return la velocidad del misil
	 */
	public Vector velocidad() {
		double Vx = (pos.getX() - pos0.getX())/ (this.t - this.t0);
		double Vy = (pos.getY() - pos0.getY())/ (this.t - this.t0);
		
		Vector velocidad = new Vector (Vx, Vy);
		return velocidad;
		
	}
}
