import java.util.*;
public class guvi {
	public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
 int n=in.nextInt();
 int l=in.nextInt();
 int r=in.nextInt();
 int i,count=0;
 for(i=l+1;i<=r;i++){
	 if(i==n){
		 count++;
		 break;
	 }
 }
 if(count==1){
	 System.out.println("yes");
 }else{
	 System.out.println("no");
 }
      in.close();
	}
}
