class if5{
	public static void main(String[] args) {
		char ch = '3';

		if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
			System.out.println("Alphabhet");
		}
		else if (ch >= 48 && ch <= 57) {
			System.out.println("Digit");
		}
		else{
			System.out.println("Special Character");
		}
	}
}