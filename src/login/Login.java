package login;

public class Login {

	private String registerId;
	private String registerPw;
	private String loginId;
	private String loginPw;

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	public void setLoginPw(String loginPw) {
		this.loginPw = loginPw;
	}
	
	//registerId, Pw는 나현씨가 만드신 가입 클래스를 상속받아서 사용 할 예정입니다.
	public void loginFunc() {
		if(loginId.equals(registerId) && loginPw.equals(registerPw)) {
			System.out.println("로그인에 성공하였습니다.");
		} else {
			System.out.println("로그인에 실패하였습니다.");
		}
	}
	
	
}
