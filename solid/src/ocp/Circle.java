package ocp;

public class Circle extends Figure {

	int x,y,r;
	public Circle(int x, int y, int r) {
		this.x=x;
		this.r=r;
		this.y=y;
	}
	
	public void draw() {
		System.out.println("Circle "+Integer.toString(x)+" "+Integer.toString(y)+" "+Integer.toString(r));
	}
	@Override	
	public float getArea() {
		return (float) (3.14*r*r);
	}
}
