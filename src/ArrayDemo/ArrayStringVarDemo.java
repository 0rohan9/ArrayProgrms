package ArrayDemo;

public class ArrayStringVarDemo {
	public static void  show(String ... arr) {
		System.out.println("no of argument="+arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
				show("Hare","Krishna","Hare","Ram");
				
	}

}
