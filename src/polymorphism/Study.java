package polymorphism;

public class Study extends Overriding {
	public void mother() {
		System.out.println("Mother have care");
		
	}
	public void love() {
		System.out.println("Mother havelove");
	}
	
	
	

	public static void main(String[] args) {
		Study j= new Study();
		j.money();
		j.property();
		
	}

}
