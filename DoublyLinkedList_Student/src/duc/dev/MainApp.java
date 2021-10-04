package duc.dev;

public class MainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dinh nghia ds
		List list = new List();
		
		list.input(list);
		//In ds sinh vien
		list.printList();
		
		//Dem xem co bao nhieu sv có dtb > 5
		System.out.println("\nSo sinh vien co DTB > 5 la: " + list.dem());
		
		//In ra cac SV tuoi tren 25 va dtb > 8
		list.print();
	}
}
