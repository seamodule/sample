class Menu{
	private java.util.Scanner scan = new java.util.Scanner(System.in);

	public void displayMenu(){
		System.out.println("＞＞＞ようこそ＜＜＜");
		System.out.println("発着駅を入力してください！！");
		System.out.print("出発駅>>");
		String depart = scan.nextLine();
		System.out.print("到着駅>>");
		String arrival = scan.nextLine();
		System.out.println(depart + " - " + arrival + " 間の乗換案内をします！");
	}
}