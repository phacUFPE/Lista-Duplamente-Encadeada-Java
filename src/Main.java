
public class Main {

	public static void main(String[] args) {
		DCList list = new DCList();
		
		list.Insert(1);
		list.Insert(5);
		list.Insert(3);
		list.Insert(11);
		list.Insert(7);
		
		list.Print();
		System.out.println(list.Remove(11));
		list.Print();
		System.out.println(list.Remove(5));
		list.Print();

	}

}
