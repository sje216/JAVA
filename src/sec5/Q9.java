package sec5;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		//��ȭ�� �¼�����(�¼� ���� : 7��)
		int[] seat = {0,0,0,0,0,0,0};
		Scanner scan = new Scanner(System.in);
		int count = 0;
		boolean tf=true;
		while(tf) {
			System.out.println("=�׸���ȭ��=");
			System.out.println("1.�¼� ����");
			System.out.println("2.����");
			int sel=scan.nextInt();
			if(sel==1) {
				System.out.println("[0~6] �¼��� �������ּ���.");
				int num=scan.nextInt();
				if(num<7) {
					if(seat[num]==1) {
						System.out.println("�ش� �¼��� �̹� ����Ǿ����ϴ�.");
					}
					else if (seat[num]==0) {
						seat[num]=1;
						count++;
					}
				}
				if(num>=7) {
					System.out.println("�ش� �¼��� �������� �ʽ��ϴ�.");
				}
				System.out.println("�¼� ��Ȳ: ");
				for(int i =0; i<seat.length;i++) {
					System.out.print(seat[i]);
				}
				System.out.println("");
			}
			if(sel==2) {
				System.out.println("���α׷��� �����մϴ�.");
				tf = false;
			}
		}
		System.out.println("�����: "+ count*12000);
	}

}
