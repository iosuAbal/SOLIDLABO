package pakete1;

public class Diamonds extends Figure {

	int x,y,r;
	public Diamonds(int x, int y, int r) {
		this.x=x;
		this.r=r;
		this.y=y;
	}
	
	public void draw() {
		System.out.println("Diamonds "+Integer.toString(x)+" "+Integer.toString(y)+" "+Integer.toString(r));
	}
	
	@Override
	public float getArea() {
		return (float) (r*x*y);
	}
}
