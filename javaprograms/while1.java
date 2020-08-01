class while1{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int x = 0;

		while(n>9)
		{
			
			x = x + n%10;
			n = n/10;

			x = x*10;
			
		}
		System.out.println(x+n);
	}
}