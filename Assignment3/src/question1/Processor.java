package question1;

public abstract  class Processor {

	protected int x,y;
//	private int num;

	public Processor(int x , int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public Processor(int x) {
		this.x = x;	
	}
	
	abstract public void process();
}
