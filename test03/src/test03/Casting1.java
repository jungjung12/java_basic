package test03;
//
public class Casting1 {
	//작은 크기의 저장소에 있는 데이터 값을 큰 크기의 저장소로 옮기면서 값이 변하는 것을 Auto Casting(묵시적 변환) 이라 한다
	public static void main(String[] args) {
		byte b = 20;		//1byte 
		short s = b;		//2byte : byte > short
		int i = s;			//4byte : short > int
		long l = i;			//8byte : int > long
		//Force Casting (명시적 변환) : 큰 크기의 저장소에 있는 데이터 값을 별도의 타입 연산자를 활용하여 작은 크기의 저장소로 옯기는 것
		int i2 = (int) 1;
		short s2 = (short) i;
		byte b2 = (byte) s;
						
	}

}
