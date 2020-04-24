package lecture4;

public class Function3 {

	public static void main(String[] args) {
		String name="Raghav";
		name=getName(name);
		System.out.println(name);
	}
	public static String getName(String name) {
		System.out.println(name);
		name = "Aakash";
		System.out.println(name);

		return name;

	}

}
