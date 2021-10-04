package duc.dev;

import java.util.Scanner;

public class List {
	private Node First, Last;
	public List() {
		First = Last = null;
	}
	
	// Chen dau list
	public void chenDau(String hoten, byte tuoi, double dtb) {
		Node nut = new Node(hoten, tuoi, dtb);
		if (First != null) {
			nut.next = First;
			nut.pre = null;
			First.pre = nut;
			First = nut;
		}else {
			nut.next = nut.pre = null;
			First = Last = nut;
		}
	}
	
	public void input(List list) {
		//Nhap ds sv tu ban phim
		Scanner sc = new Scanner(System.in);
		int test = 1;
		while (test == 1) {
			System.out.println("Nhap ten SV: ");
			String hoten = sc.next();
			System.out.println("Nhap tuoi: ");
			byte tuoi = sc.nextByte();
			System.out.println("Nhap DTB: ");
			double dtb = sc.nextDouble();
			list.chenDau(hoten, tuoi, dtb);
			System.out.println("Lua chon nhap 1 de tiep tuc nhap, nhap 0 de ket thuc viec nhap:");
			test = sc.nextInt();
		}
	}
	
	// In mang
		public void printList() {
			Node p = First;	
			System.out.println("List Student la: ");
			while (p != null) {
				p.printNode();
				p = p.next;
			}
		}
		
		//Dem xem co bao nhieu ban co diem trung binh tren 5
		public int dem() {
			Node p = First;
			int dem = 0;
			while (p != null) {
				if (p.dtb > 5) {
					dem ++;
				}
				p = p.next;
			}
			return dem;
		}
		
		public void print() {
			Node p = First;
			System.out.println("\nCac sinh vien co tuoi tren 25 va DTB > 8 là: ");
			while (p != null) {
				if ((p.tuoi > 25) && (p.dtb > 8)) {
					p.printNode();
				}
				p = p.next;
			}
		}
}
