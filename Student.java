package constructor;

public class Student {
	
	int sno;
	String sname;
	String sadd;
	
	public Student(int sno,String sname,String sadd){
		
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
	}
	
	void display(){
		
		System.out.println(sno+"\t"+sname+"\t"+sadd);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student sd = new Student(100,"Anusha","Dallas");
		sd.display();
		
		Student sd1 = new Student(200,"Aadhya","Coppell");
		sd1.display();
	}

}
