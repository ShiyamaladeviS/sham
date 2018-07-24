import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int c,sum=0;
	while(a>0){
		c=a%10;
		a=a/10;
		sum=sum+c;
	}
	System.out.println(sum);
 }
}
