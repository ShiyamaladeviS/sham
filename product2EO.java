import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
int b=in.nextInt();
int mul=a*b;
	if(mul%2==0){
		System.out.println("even");
		}else{
			System.out.println("Odd");
		}
	in.close();
 }
}
