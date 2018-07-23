import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
			 int a=in.nextInt();
			int t1=0;
			int t2=1;
			int sum=0;
			for(int i=0;i<a;i++){
				
				System.out.print(t2+" ");
				sum=t1+t2;
				t1=t2;
			t2=sum;
				}
 in.close();
 }
}
