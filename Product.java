package constructor;

public class Product {

	int pid;
	String pname;
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Product prod = new Product();
		
		prod.setPid(100);
		prod.setPname("Television");
		
		System.out.println(prod.getPname()+"\t"+prod.getPid());
		
	}

	

}
