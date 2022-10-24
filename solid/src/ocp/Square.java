package ocp;

public class Square extends Figure {
	int x,y,r,luzera;
	public Square(int x, int y, int luzera,int r) {
		this.x=x;
		this.r=r;
		this.y=y;
		this.luzera=luzera;
	}
	
	
	public void draw() {
		System.out.println("Square  "+Integer.toString(x)+" "+Integer.toString(y)+" "+" "+Integer.toString(r)+Integer.toString(luzera));
	}
	@Override
	public float getArea() {
		return x*y;
	}
}
