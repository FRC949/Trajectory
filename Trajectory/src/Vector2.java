
public class Vector2 {

	public final double x, y;

	public Vector2(double x, double y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	public double norm() {
		return Math.sqrt(x * x + y * y);
	}
}
