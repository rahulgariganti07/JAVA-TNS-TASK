package task;

public class thisForMethod {
	void displayName() {
        System.out.println("Called Method using this Keyword");
    }

    void show() {
        this.displayName();
    }

    public static void main(String[] args) {
        thisForMethod s = new thisForMethod();
        s.show();
    }

}
