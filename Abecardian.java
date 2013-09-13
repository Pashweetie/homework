public class Abecardian {
	private static String alph = "abcdefghijklmnopqrstuvwxyz";
	public static void main(String[] args) {
		System.out.println(isAbecedarian("you"));
	}
	public static boolean isAbecedarian(String s) {
		boolean answer = false;
		for ( int i=1; i<s.length(); i++) {
			if (s.charAt(i)== alph.charAt(i)) {
				answer = true;
			}
			if (s.charAt(i) > alph.charAt(i)) {
				answer = false;
				return false;
			}
			if (s.charAt(i) < alph.charAt(i)) {
				answer = true;
			}
			
		}
		if (answer) {
			return true;
		}
		return false; 
	}
}