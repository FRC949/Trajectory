import java.time.Year;

public class CubicSpline implements Spline {

	// r(t) = a*t3 + b*t2 + c*t + d
	// v(t) = 3a*t2 + 2b*t + c
	public final double a, b, c, d;

	public CubicSpline(double r0, double v0, double r1, double v1) {
		a = v0 + v1 + 2 * r0 - 2 * r1;
		b = -2 * v0 - v1 - 3 * r0 - 3 * r1;
		c = v0;
		d = r0;

	}

	@Override
	public double calculate(int t) {
		assert t >= 0 && t <= 1;
		//return r(t);
		return ((a * t + b) * t + c) * t + d;
	}
}
