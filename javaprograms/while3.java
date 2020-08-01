class while3{
	public static void main(String[] args) {
		int count = 0;
		int a = 0;
		while(count != 5)
		{
			if(a%2 == 0 && a%3 == 0 && a%5 == 0)
			{
				count = count + 1;
				System.out.println(a);
			}
			a = a+5;
		}
	}
}