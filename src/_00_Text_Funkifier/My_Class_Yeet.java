package _00_Text_Funkifier;

public class My_Class_Yeet extends SpecialString {

	public My_Class_Yeet(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		String output="";
		for (int i = 0; i < s.length(); i++) {
			output+=s.toUpperCase().charAt(i);
		}
		return output;
	}

}
