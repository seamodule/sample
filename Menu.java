class Menu{
	private java.util.Scanner scan = new java.util.Scanner(System.in);

	public void displayMenu(){
		System.out.println("„„„‚æ‚¤‚±‚»ƒƒƒ");
		System.out.println("”­’…‰w‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢II");
		System.out.print("o”­‰w>>");
		String depart = scan.nextLine();
		System.out.print("“’…‰w>>");
		String arrival = scan.nextLine();
		System.out.println(depart + " - " + arrival + " ŠÔ‚ÌæŠ·ˆÄ“à‚ğ‚µ‚Ü‚·I");
	}
}