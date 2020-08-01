class while2{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int a = n;
		int x = 0;

		while(n>9)
		{
			x = x + n%10;
			x = x * 10;
			n = n/10;
		}
		//System.out.println(x+n);
		int y = x+n;

		if (a == y) {
			System.out.println(a+ " is a palindrome");

		}
		else
		{
			System.out.println(a+ " is not a palindrome");
		}
	}
}