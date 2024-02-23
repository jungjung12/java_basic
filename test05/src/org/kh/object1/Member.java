package org.kh.object1;
/* public(공용. 모든 패키지, 클래스) > protected(동일 패키지 내, 상속, 연관;같은 클래스인 경우) > default(동일 패키지 내에서만)
> private(현재 클래스 내에서만/정보은닉, 캡슐화)	*/ 
public class Member {
		
		private String id;
		private String pw;
		private String email;
		private int birth;
		private String tel;
		
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPw() {
			return pw;
		}

		public void setPw(String pw) {
			this.pw = pw;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getBirth() {
			return birth;
		}

		public void setBirth(int birth) {
			this.birth = birth;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		@Override	//**메소드에는 private을 걸지 않음
		public String toString() {
			return "Member [id=" + id + ", pw=" + pw + ", email=" + email + ", birth=" + birth + ", tel=" + tel + "]";
		} 

	}


