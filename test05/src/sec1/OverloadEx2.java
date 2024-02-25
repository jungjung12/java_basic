package sec1;

public class OverloadEx2 {

	public static void main(String[] args) {
			/*책 세권을 등록*/
			**출력 안되는 거 여쭤보기**
		Book1 b1 = new Book1()	;	{
			b1.setBno(01);
			b1.setBname("불꽃효녀");
			b1.setPrice(12450);
			b1.setAuthor("이가을");
			b1.setPub("진성");
		}
			
			Book1 b2 = new Book1()	;	{
				b1.setBno(02);
				b1.setBname("효녀심청");
				b1.setPrice(32000);
				b1.setAuthor("가을Lee");
				b1.setPub("진성lee씨");
			}
			
				Book1 b3 = new Book1()	;	{
					b1.setBno(03);
					b1.setBname("빨래방해하는법");
					b1.setPrice(25000);
					b1.setAuthor("냥선생");
					b1.setPub("진성이씨");
				}
					
					Book1 b4 = new Book1();	{
						b4.print();
						b4.print(b1.getBname(),b1.getPrice(),b1.getAuthor());
						b4.print(b2.getBname(),b2.getPrice(),b2.getAuthor());
						b4.print(b3.getBname(),b3.getPrice(),b3.getAuthor());
						}
					}
}
