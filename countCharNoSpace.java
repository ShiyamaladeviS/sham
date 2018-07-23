import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	 int count=0;
			 String str=in.nextLine();
			 for(int i=0;i<str.length();i++){
	 if(str.charAt(i)!=' '){
		 count++;
	 }
			 }
System.out.println(count);
 in.close();
 }
}
