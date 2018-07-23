import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	 int h1=in.nextInt();
	 int m1=in.nextInt();
	 int h2=in.nextInt();
	 int m2=in.nextInt();
int hour=Math.abs(h1-h2);
int min=Math.abs(m1-m2);
System.out.println(hour+" "+min);
 in.close();
 }
}
