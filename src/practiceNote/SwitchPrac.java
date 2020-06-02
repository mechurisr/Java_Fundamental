package practiceNote;

public class SwitchPrac {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = null;
		switch(month) {
		case 12 :
		case 1 :
		case 2 : season = "Winter"; break;
		case 3 :
		case 4 :
		case 5 : season = "Spring"; break;
		case 6 :
		case 7 :
		case 8 : season = "Summer"; break;
		case 9 :
		case 10 :
		case 11 : season = "Autumn"; break;
		default : season = "Try Again";
		}
		System.out.println(month + "월은 " + season + "입니다.");
		
	}

}
