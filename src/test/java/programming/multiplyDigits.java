package programming;

public class multiplyDigits {

	public static void main(String[] args) {
		String s="sddfet11ueyrer125jhfsj526";
		int temp=0;
		int temp1=1;
		String[] numbers = s.split("[^\\d]+");
		int[] in=new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			in[i]=Integer.parseInt(numbers[i]);

			temp=int[i]);
			temp1=temp1*temp;
			temp=0;
		}
		System.out.println(temp1);
	}
	
}
