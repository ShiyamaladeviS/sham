import java.util.*;
import java.util.Arrays;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
			 int a[]=new int[10];
			for(int i=0;i<a.length;i++){
				a[i]=in.nextInt();
				}
		int max=0;
			for(int i=0;i<a.length;i++){
				if(max<a[i])
				max=a[i];
			}
			System.out.println(max);
 in.close();
 }
}
