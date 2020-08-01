class if6{
	public static void main(String[] args) {
		String gender = args[0];
		int age = Integer.parseInt(args[1]);

		System.out.println(gender);
		System.out.println(age);


		if (gender == "Female" && age >=1 && age <= 58){
			System.out.println("8.2%");
		}
		
		}
}