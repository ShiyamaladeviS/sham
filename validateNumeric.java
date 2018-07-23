import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	 String n=in.nextLine();
	 if(Character.isDigit(n.charAt(0))){
		 System.out.println("Yes");
	 }else{
	System.out.println("No");
	 }
 in.close();
 }
}
