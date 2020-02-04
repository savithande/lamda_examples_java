package lamda.example.programs;

import encaplsulation.Run;

public class MainClass {
	public static void main(String[] args) {
		Runnable count = (int num1,int num2) ->  num1 + num2 ;
		
		Runnable mul = (int num1,int num2) -> num1 * num2;
		
		Runnable div = (int num1 ,int num2) -> num1 / num2;
		
		Runnable2 saySomething = (String msg) -> {
			System.out.println("hello "+msg);
		};
		saySomething.saySomething("savitha");
			
		Runnable2 msg = (String str) -> {
			System.out.println("how r u " + str);
		};
		msg.saySomething("Savitha");
	}
 
}
