package basic.dev;

import java.util.Scanner;

public class List {
	Scanner sc = new Scanner(System.in);
	private Node First, Last;
	public List() {
		First = Last = null;
	}
	/** Chen gia tri vao dau DS
	 * @param x
	 */
	public void chenDau(int x) {
		Node nut = new Node(x);
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
	
	public void Input(List list) {
		int index = 1;
		while (index == 1) {
			System.out.println("Nhap vao gia tri muon chen: ");
			int x = sc.nextInt();
			list.chenDau(x);
			System.out.println("Bam phim 1 de tiep tuc viec nhap, 0 de dung viec nhap!");
			index = sc.nextInt();
		}
	}
	// In toan bo danh sach
	public void printAll() {
		Node p = First;
		while (p != null) {
			p.printNumber();
			p = p.next;
		}
	}
	// In cac phan tu le trong ds
	public void printOddNumber() {
		Node p = First;
		System.out.println("\nDanh sach cac phan tu le trong danh sach la:");
		while (p != null) {
			if (p.value %2 == 1) {
				p.printNumber();
			}
			p = p.next;
		}
	}
	// Tinh trung binh cong tat ca cac gia tri trong ds
	public double Average() {
		double average;
		int sum, key = 0;
		average = sum = 0;
		Node p = First;
		while (p != null) {
			sum += p.value;
			key++;
			p = p.next;
		}
		average = sum/key;
		return average;
	}
	// Kiem tra co phan tu x nhap tu ban phim hay k?
	public boolean checkX() {
		System.out.println("Nhap gia tri muon kiem tra: ");
		int x = sc.nextInt();
		Node p = First;
		while (p != null) {
			if (p.value == x) {
				return true;
			}
			p = p.next;
		}
		return false;
	}
	// So phan tu chia het cho x, nhung k chia het cho y
	public int Quantity() {
		int count = 0;
		System.out.println("Nhap lan luot hai so x,y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		Node p = First;
		while (p != null) {
			if ((p.value % x == 0)&&(p.value % y != 0)) {
				count ++;
			}
			p = p.next;
		}
		return count;
	}
	// Kiem tra ds co tang dan k? neu chua thi sx lai
	public void sortList(){
		Node p = First;
		boolean check = true;
		if (p == null) {
			check = false;
		}
		while (p.next != null) {
			if (p.value > p.next.value) {
				check = false;
			}
			p = p.next;
		}
		if (check == true) {
			System.out.println("Mang tang dan, k can sx:");
			printAll();
		} else {
			System.out.println("Mang sau khi sap xep la:");
			p = First;
			Node q;
			int temp;
			while (p!= null) {
				q = p.next;
				while (q != null) {
					if (p.value > q.value) {
						temp = p.value;
						p.value = q.value;
						q.value = temp;
					}
					q = q.next;
				}
				p = p.next;
			}
			printAll();
		}
	}
}
