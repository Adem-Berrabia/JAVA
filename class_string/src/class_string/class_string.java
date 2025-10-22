package class_string;

public class class_string {
	public static void main(String args[]) {
		String ch1,ch2;
		ch1="programmetion";
		ch2=ch1;
		System.out.println("ch1:" + ch1);
		System.out.println("ch2:" + ch2);
		ch1+="en java";
		System.out.println("ch1:" + ch1);
		System.out.println("ch2:" + ch2);
		String s1="bonjour";
		String s2= new String("bonjour");
		System.out.println(s1.equals(s2));
		System.out.println(s1.indexOf('o',1));
		System.out.println(s1.indexOf('o',2));
		System.out.println(s1.indexOf('o',5));
		System.out.println(s1.indexOf('o',4));
	}

}
