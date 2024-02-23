package org.kh.object1;

public class MemberEx1 {

	public static void main(String[] args) {
		Member lee = new Member();
		/* lee.id = "h2o12";
		lee.pw = "l1234";
		lee.email = "h2o12@nnn.com";
		lee.birth = 12/21;
		lee.tel = "010-0000-0000";
		System.out.println(lee.toString());	*/
		lee.setId("h2o");
		lee.setPw("1234");
		lee.setEmail("h2o@nnnn.nnn");
		lee.setBirth(1221);
		lee.setTel("010-000-0000");
		System.out.println("id :"+lee.getId());
		System.out.println("pw :"+lee.getPw());
		System.out.println("email :"+lee.getEmail());
		System.out.println("birth :"+lee.getBirth());
		System.out.println("tel :"+lee.getTel());
	}	

}
