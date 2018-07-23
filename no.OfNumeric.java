import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
			 String str=in.nextLine();
			 int l=str.length();
			str=str.replaceAll("[0-9]", "");
			int count=l-str.length();
System.out.println(count);
 in.close();
 }
}
