public class Cat extends Zoo {
	private int age;
	private String act;
	public Cat(String name, String eat, String cry,int age) {
		super(name, eat, cry);
		this.age = age;
		this.act = act;
	}
	
	
	public void print() {
		super.print();
		System.out.println(" "+age+" "+act);

	}
}
