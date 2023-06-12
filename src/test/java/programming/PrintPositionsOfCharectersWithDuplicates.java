package programming;

public class PrintPositionsOfCharectersWithDuplicates {
//Print Positions Of Charecters With Duplicates
	
	public static void main(String[] args) {
		String str="Tester";
		str=str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			
			System.out.println(str.charAt(i)+" is present "+(i+1)+" position");
			
		}
	}
}
