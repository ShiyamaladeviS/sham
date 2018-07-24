import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int count=0;
	while(a>0){
		a/=10;
		count++;
	}
System.out.println(count);

	in.close();
 }
}
