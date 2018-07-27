import java.util.*;
public class guvi {
	public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
int n=in.nextInt();
int m=in.nextInt();
int a=n*m;
int h=(int)Math.sqrt(a);
if((h*h)==a){
	System.out.println("yes");
 }
 else{
	 System.out.println("no");
 }
      in.close();
	}
}
