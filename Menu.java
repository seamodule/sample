class Menu{
	private java.util.Scanner scan = new java.util.Scanner(System.in);

	public void displayMenu(){
		System.out.println("�������悤����������");
		System.out.println("�����w����͂��Ă��������I�I");
		System.out.print("�o���w>>");
		String depart = scan.nextLine();
		System.out.print("�����w>>");
		String arrival = scan.nextLine();
		System.out.println(depart + " - " + arrival + " �Ԃ̏抷�ē������܂��I");
	}
}