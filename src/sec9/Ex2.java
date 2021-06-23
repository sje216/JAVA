package sec9;

public class Ex2 {

	public static void main(String[] args) {
		// 자식 객체 이용
		Child02 child = new Child02("유재석", "1234-5678",1);
		System.out.println("name: "+child.name);
		System.out.println("ssn: "+child.ssn);
		System.out.println("studentNo: "+child.studentNo);

	}

}
