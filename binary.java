import java.util.*;
public class guvi {
	public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int c,count=0;
     String a="";
      while(n!=0){
    	  c=n%10;
      n/=10;
      if(!((c==0)||(c==1))){
    	  a="no";
    	  count++;
      }
         }
      if(count==0){
    	  a="yes";
      }
    	  System.out.println(a);
	
      in.close();
	}
}
