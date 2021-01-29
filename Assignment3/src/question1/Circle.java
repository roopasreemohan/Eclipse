package question1;

public class Circle extends Processor {
	
	double area;
	
	public Circle(int r) {
		super(r);
		
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		area = 3.14 * x* x;
		System.out.println("Area : " +area);
		
	}
}
