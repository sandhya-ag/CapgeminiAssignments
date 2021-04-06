package packageStrings;

//exercise 3

public class ReplaceConsonants {

	public static String replaceConsonants(String s) {
		StringBuffer sb = new StringBuffer();
		char[] ch = s.toCharArray();
		for (char c : ch) {
			if (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
				c = (char) (c + 1);
				sb.append(c);
			} else {
				sb.append(c);
			}

		}

		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replaceConsonants("JAVA"));

	}

}
