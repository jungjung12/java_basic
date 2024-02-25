package sec1;

public class OverloadEx1 {

	public static void main(String[] args) {
		Product pro = new Product();
		pro.print();
		pro.print("이동규");
		pro.print(1);
		pro.print("이동규", 2);
		pro.print(3, "이동규");
	}

}
