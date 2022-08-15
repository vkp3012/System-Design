package CodeForDecorator;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		cir.draw();
		
		Shape cir = new Cricle();
		ShapeDecorator cirWithBorder = new BorderShapeDecorator(cir);
//		cirWithBorder.draw();
		
//		ColorShapeDecorator cirWithBorderAndColor = new ColorShapeDecorator(cirWithBorder);
//		cirWithBorderAndColor.draw();
		
		ShapeDecorator cirWithDoubleBorder = new BorderShapeDecorator(cirWithBorder);
		cirWithDoubleBorder.draw();
	}

}
