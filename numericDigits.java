import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int s=in.nextInt();
	int count=0;
  while(s>0){
	  s=s/10;
	  count++;
  }
  System.out.println( count);
 in.close();
 }
}
