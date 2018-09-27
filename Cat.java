public class Cat extends Zoo {
	private int age;
	public Cat(String name, String eat, String cry,int age) {
		super(name, eat, cry);
		this.age = age;
	}
	
	
	public void print() {
		super.print();
		System.out.println(" "+age);
	}
}
