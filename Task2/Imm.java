
//Immutable Class
public final class Imm {
	private final String name;
	private final int age;
	private Imm(int age,String name) {
		this.age=age;
		this.name=name;
	}
	public int age() {
		return age;
	}
	public String name() {
		return name;
	}
	public static void main(String[] args) {
		Imm m = new Imm(12, "milu");
		System.out.println(m.age);
		System.out.println(m.name);

	}
}
