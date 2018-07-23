import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	 int n=in.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++){
		 a[i]=in.nextInt();
	 }
	 for(int i=0;i<n;i++){
	System.out.println(a[i] +" "+i);
	 }
 in.close();
 }
}
