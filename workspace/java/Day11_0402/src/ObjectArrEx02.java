
public class ObjectArrEx02 {

	public static void main(String[] args) {

		String[] names = {"Kim", "Park", "Ye"};
		for (int i = 0; i < names.length; i++)
			System.out.println(names[i]);
		System.out.println("========================");
		for (String i : names)
			System.out.println(i);
		System.out.println("========================");
		
		String temp = names[2];
		System.out.printf("tmp=%s\n", temp);
		names[0] = "Yang";
		
		for (String name : names)
			System.out.println(name);
	}

}
