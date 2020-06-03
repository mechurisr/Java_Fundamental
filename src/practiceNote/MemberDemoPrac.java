package practiceNote;

public class MemberDemoPrac {
	public static void main(String[] args) {
		MemberDaoPrac mdao = new MemberDaoPrac();
		int num = 1;
		String name = "택진형1";
		String addr = "한국1";
		MemberDtoPrac m = new MemberDtoPrac(num, name, addr);
		
		int resultCount = mdao.insert(new MemberDtoPrac(num, name, addr));
		if(resultCount==1) {
			System.out.println("정상적인 회원 가입이 되었습니다.");
		}else {
			System.out.println("오류..");
		}
}
}