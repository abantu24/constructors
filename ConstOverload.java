package constructor;

public class ConstOverload {
	
	ConstOverload(){
		this(100);
		System.out.println("Default Constructor");
		
	}
	
	ConstOverload(int i){
		this(200,300);
		System.out.println("parametrized constructor");
	}

	ConstOverload(int i, int j){
		
		System.out.println(i+"\t"+j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstOverload A = new ConstOverload();
		ConstOverload B = new ConstOverload(100);
	}

}
