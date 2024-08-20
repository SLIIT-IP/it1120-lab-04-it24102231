import java.util.Scanner;
public class IT24102231Lab4Q2{
	public static void main(String[] args){
		Scanner m=new Scanner(System.in);
		System.out.print("Please enter exam marks:- ");
		float exam_marks=m.nextInt();

		Scanner n=new Scanner(System.in);
		System.out.print("Please enter lab submission marks:- ");
		float lab_sub_marks=n.nextInt();

		Scanner a=new Scanner(System.in);
		System.out.print("Please enter the percentage given for the exam:- ");
		float pre_exam_marks=a.nextInt();

		Scanner b=new Scanner(System.in);
		System.out.print("Please enter the percentage given for the lab submission:- ");
		float per_labsub_marks=b.nextInt();

		float full_exam_mark=0;
		float full_lab_mark=0;
		float final_mark=0;
		if (exam_marks>=0 && lab_sub_marks<=100){
			if((pre_exam_marks + per_labsub_marks)==100){
				full_exam_mark=exam_marks*(pre_exam_marks/100);
				full_lab_mark=lab_sub_marks*(per_labsub_marks/100);
				final_mark=full_exam_mark+full_lab_mark;

				System.out.println("Final exam mark is:-" +" "+final_mark); }
		}
	}
}


