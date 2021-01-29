package question1;

public class Factorial extends Processor {
		
	int num;
	public Factorial(int num) {
		super(num);
		
	}

	@Override
	public void process() {
	//int num = 0;
		int fact =1;
		// TODO Auto-generated method stub
		for(int i=1;i<num;i++) {
		fact= fact * i;
		}
		System.out.println("Factorial : " +fact);
	}
}