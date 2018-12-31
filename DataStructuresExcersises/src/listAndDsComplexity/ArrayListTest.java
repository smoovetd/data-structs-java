package listAndDsComplexity;

public class ArrayListTest {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println(list.count());
		System.out.println(list.toString());
		
		list.add(1);
		list.add(5);
		
		System.out.println(list.count());
		System.out.println(list.toString());

		list.add(7);

		System.out.println(list.count());
		System.out.println(list.toString());
		
		System.out.println(list.getElementAtIndex(1));

		try {
			System.out.println(list.getElementAtIndex(4));
		} catch(Exception ex) {
			System.out.println(ex.toString());
		}
		
		System.out.println(list.removeAt(1));
	
		System.out.println(list.count());
		System.out.println(list.toString());
		
		try {
			System.out.println(list.removeAt(2));
		} catch(Exception ex) {
			System.out.println(ex.toString());
		}

	}

}
