package task;

public class thisConstructor {
	public class thisConstructor {

	    thisConstructor() {
	        this(101);
	        System.out.println("Default constructor");
	    }

	    thisConstructor(int id) {
	        System.out.println("ID: " + id);
	    }

	    public static void main(String[] args) {
	        thisConstructor s = new thisConstructor();
	    }
	}
}
