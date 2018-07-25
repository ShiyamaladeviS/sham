import java.util.*;
public class guvi {
	public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int m=in.nextInt();
     int a=Math.abs(m-n);
     if(a%2==0){
    	 System.out.println("even");
     }else{
    	 System.out.println("odd");
     }
     in.close();
	}
}
