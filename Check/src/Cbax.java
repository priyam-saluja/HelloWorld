import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Cbax {

	
	public static void main(String... args) {
		String str ="cbax[{(1,2,3)},{(4,5,6)},{(7,8,9)}]";
		Pattern p =  Pattern.compile("cbax\\[\\{(.+?)\\}\\]");
		Matcher m = p.matcher(str);
		if(m.find()) {
			System.out.println("yes");
		}
		else
			System.out.println("no");
		 
		

	}
}
