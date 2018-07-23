import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
			 int a=in.nextInt();
			 int b=in.nextInt();
			 a=a^b;
			 b=b^a;
			 a=a^b;
			 System.out.println(a+" "+b);
 in.close();
 }
}
