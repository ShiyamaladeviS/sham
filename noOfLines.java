import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	 int count=0;
			 String str=in.nextLine();
			 String s[]=str.split("\\.");
			 for(int i=0;i<s.length;i++){
	 count++;
	 }
System.out.println(count);
 in.close();
 }
}
