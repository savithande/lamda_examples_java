package lamda.example.programs;

public interface Runnable2 {
	public void saySomething(String msg);
	
	private int operation(int num1,int num2,Runnable run) {
		return run.count(num1, num2);
	}

}
