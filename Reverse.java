package day6;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Sagar";
int len=name.length();
System.out.println("Length of string:"+len);
String rev="";
for(int i=len-1;i>=0;i--) {
	rev +=name.charAt(i);
}
System.out.println("Reverse string is:"+rev);
	}

}
