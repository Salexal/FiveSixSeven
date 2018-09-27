public class Rabiit extends Zoo {
	private String act;

	public Rabiit(String name, String eat, String cry, String act) {
		super(name, eat, cry);
		this.act = act;
	}
	public void print() {
		super.print();
		System.out.println(" "+act);
	}
}