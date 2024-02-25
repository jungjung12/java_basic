package sec2;

public class BoardEx1 {

	public static void main(String[] args) {
		Board b1 = new Board();			//매개 변수 없는 상태로 객체 생성
		b1.setBno(1);
		b1.setTitle("공부 방해하는 법");
		b1.setUname("이가을");
		
		Board b2 = new Board(101);		//(bno)매개 변수가 있는 방식으로 b2 객체 생성
		b2.setTitle(",");
		b2.setUname(",,");
		
		Board b3 = new Board(102, "nn");//(bno, title)을 매개변수로 입력받아 b3 객체 생성
		b3.setUname("walkman");
		
		Board b4 = new Board(103, "dd", "sss");//(bno, title, uname)을 매개변수로 입력받아 b4 객체 생성
		
		Notice n1 = new Notice(101, "방해꾼", "33", "이가을", "1234", 0);
		System.out.println(n1.toString());
		}
	}


