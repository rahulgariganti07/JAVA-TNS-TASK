package task;



public class thisForVariable {
	String name;
	
	thisForVariable(String name){
		this.name = name;
	}
	void display() {
		System.out.println(this.name);
	}
	public static void main(String[]args) {
		thisForVariable sn =new thisForVariable("Rohith");
		sn.display();
	}

}

