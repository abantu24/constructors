package constructor;

public class Employee {
	
	int emo;
	String ename;
	String emadd;
	
	public Employee(int emo,String ename,String emadd){
		this.emo = emo;
		this.ename =ename;
		this.emadd = emadd;
	}
	
	public Employee(Employee e1){
		
		emo = e1.emo;
		ename = e1.ename;
		emadd = e1.emadd;
			
	}
	
	public Employee(){
		
		
	}
 void display(){
	 
	 System.out.println(emo+"\t"+ename+"\t"+emadd);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	/*	Employee emp = new Employee();
		Employee emp1 = new Employee(100,"Anusha","Dallas");
		emp.display();
		emp1.display();*/
		
		Employee emp = new Employee(100,"Anusha","Dallas");
		Employee emp1 = new Employee();
		
		emp1.emo = emp.emo;
		emp1.ename = emp.ename;
		emp1.emadd = emp.emadd;
		
		emp.display();
		emp1.display();
	}

}
