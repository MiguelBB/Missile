
public class Proyectil {
	protected int t0;
	protected static int t;
	protected Vector pos;
	protected Vector pos0;
	
	public Proyectil(int t0, int t, Vector pos, Vector pos0) {
		super();
		this.t0 = t0;
		this.t = t;
		this.pos = pos;
		this.pos0 = pos0;
	}

	public int getT0() {
		return t0;
	}

	public void setT0(int t0) {
		this.t0 = t0;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public Vector getPos() {
		return pos;
	}

	public void setPos(Vector pos) {
		this.pos = pos;
	}

	public Vector getPos0() {
		return pos0;
	}

	public void setPos0(Vector pos0) {
		this.pos0 = pos0;
	}
}
