public class Abecardian {
	private static String alph = "abcdefghijklmnopqrstuvwxyz";
	public static void main(String[] args) {
		System.out.println(isAbecedarian("you"));
		System.out.println(isDoubloon("lolo"));
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
	public static boolean isDoubloon(String s){
		boolean shortAnswer = false;
		boolean answer = false;
		boolean finalAnswer = false;
		for (int i = 0; i<s.length(); i++) {
			answer = false;
			for (int j = 1; j < s.length()-1; j++) {
				char numba1 = s.charAt(i);
				char numba2 = s.charAt(j);
				if (numba1==numba2) {
					answer = true;
				}
			}
			if(!answer){
				finalAnswer = false;
			}
		}
		return answer;
	}
}