package basic.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dinh nghia list
		List list = new List();
		
		//Khoi tao danh sach nhap tu ban phim
		list.Input(list);
		
		//In mang vua nhap
		System.out.println("Danh sach ma ban vua nhap la:");
		list.printAll();
		
		//In gia tri cac phan tu le
		list.printOddNumber();
		
		//Tinh trung binh cong
		System.out.println("\nTrung binh cong cua day la: " + list.Average());
		
		//Kiem tra co phan tu x nhap tu ban phim hay khong
		if (list.checkX()) {
			System.out.println("Ton tai gia tri x!");
		}else {
			System.out.println("Khong ton tai gia tri x!");
		}
		
		//Dem xem co bao nhieu so chia het cho x, nhung k chia het cho y
		System.out.println("So phan tu chia het cho x, nhung k chia het cho y la: " + list.Quantity());
		
		//Kiem tra list va sx tang dan
		list.sortList();
	}

}
