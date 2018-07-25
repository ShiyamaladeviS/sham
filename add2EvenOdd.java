import java.util.*;
public class guvi {
	public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
     int a=in.nextInt();
     int b=in.nextInt();
     int sum=a+b;
     if(sum%2==0||sum==0){
    	 System.out.println("even");
     }else
     {
    	 System.out.println("odd");
     }
     in.close();
	}
}
