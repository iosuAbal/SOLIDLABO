package ocp;

public class Proba {

	public static void main(String[] args) {

		Figure c=new Circle(1,2,3);
		Figure c2=new Circle(2,3,4);
		Figure sq=new Square (2,5,5,5);
		Figure d=new Diamonds (4,5,6);
		
		Sheet sheet=new Sheet();
		sheet.addFigure(c2);
		sheet.addFigure(d);
		sheet.addFigure(c);
		sheet.addFigure(sq);
		
		sheet.drawFigures();
		sheet.getAreas();
				

	}

}
