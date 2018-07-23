import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	 int n=in.nextInt();
int hour=0;
int min=0;
if(n>=12){
hour=n/60;
min=(n%60);
}	
	 System.out.println(hour+" "+min);
 in.close();
 }
}
