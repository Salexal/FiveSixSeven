public class Rabiit extends Zoo {
	private String act;
	private String nickname="兔叽";
	public Rabiit(String name, String eat, String cry, String act) {
		super(name, eat, cry);
		this.act = act;
	}
	public void print() {
		super.print();
		System.out.println(" "+act+" "+nickname);
	}
}