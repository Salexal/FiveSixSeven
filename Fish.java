public class Fish extends Zoo{
	private String color;
	public Fish(String name, String eat, String cry,String color) {
		super(name, eat, cry);
		this.color = color;
	}
	public void print() {
		super.print();
		System.out.println(" "+color);
	}
}