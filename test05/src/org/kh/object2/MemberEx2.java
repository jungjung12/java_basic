package org.kh.object2;

import org.kh.object1.Member;

public class MemberEx2 {

	public static void main(String[] args) {
		Member lee1 = new Member();
		lee1.setId("h2o1");
		lee1.setPw("1234");
		lee1.setEmail("h3o@nnnn.nnn");
		lee1.setBirth(1121);
		lee1.setTel("010-000-0001");
		System.out.println("id :"+lee1.getId());
		System.out.println("pw :"+lee1.getPw());
		System.out.println("email :"+lee1.getEmail());
		System.out.println("birth :"+lee1.getBirth());
		System.out.println("tel :"+lee1.getTel());
	}

}
