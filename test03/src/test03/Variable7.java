package test03;

public class Variable7 {

	public static void main(String[] args) {
		String name = "이정희";
		int age = 27;
		String age2 = "27";
		int age3 = Integer.parseInt(age2)+8;
		float height = 150f;
		String height2 = "150";
		float height3 = Float.parseFloat(height2);
//		boolean pass = true;
		double weight = 52;
		String weight2 = "52";
		
		System.out.println("name : "+name.getClass().getName());
		System.out.println("age : "+age2.getClass().getName());
		System.out.println("height : "+height2.getClass().getName());
		System.out.println("weight : "+weight2.getClass().getName());
//		primitive type => Wrapper type = boxing *=래퍼(포장)
//		Wrapper type => primitive type = unboxingprimitive type
		
	}

}
