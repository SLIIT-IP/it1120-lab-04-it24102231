import java.util.Scanner;
public class IT24102231Lab4Q3{
	public static void main(String[] args){
		Scanner m=new Scanner(System.in);
		System.out.print("Enter a number:- ");
		int num=m.nextInt();
		System.out.println("num is:-" +" "+((num>0) ? "positive" : (num<0) ? "negative" : "zero"));
}
}