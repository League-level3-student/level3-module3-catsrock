package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String upperOutput = "";
		String lowerOutput="";
		for (int i = 0; i < s.length(); i +=2) {
			upperOutput += s.toUpperCase().charAt(i);
			lowerOutput+=s.charAt(i);
		}
		return upperOutput+lowerOutput;
	}

}
