package curriculum_B;
import java.util.Scanner;
public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("生徒の人数を入力してください(2人以上):");
		Scanner scan = new Scanner(System.in);
		int student = scan.nextInt();
		int[] english = new int[student];
		int[] math = new int[student]; 
		int[] science = new int[student];
		int[] society = new int[student];
		//　点数入力
		for(int i = 0;i < student;i++) {
			System.out.print((i+1)+"人目の『英語』の点数を入力してください：");
			english[i] = scan.nextInt();
			System.out.print((i+1)+"人目の『数学』の点数を入力してください：");
			math[i] = scan.nextInt();
			System.out.print((i+1)+"人目の『理科』の点数を入力してください：");
			science[i] = scan.nextInt();
			System.out.print((i+1)+"人目の『社会』の点数を入力してください：");
			society[i] = scan.nextInt();
			System.out.println();
		}
		//　生徒ごとの平均点
		for(int i = 0;i < student;i++) {
			double avg = (english[i] + math[i] + science[i] + society[i])/4;
			String avg_stdnt = String.format("%.2f", avg);
			System.out.println((i+1)+"人目の平均点は"+avg_stdnt+"点です。");
		}
		System.out.println();
		//　科目ごとの平均点
		double english_avg = 0; 
		double math_avg = 0;
		double science_avg = 0;
		double society_avg = 0;
		for(int i=0;i < student;i++) {
			 english_avg += english[i];
		}
		for(int i=0;i < student;i++) {
			 math_avg += math[i];
		}
		for(int i=0;i < student;i++) {
			 science_avg += science[i];
		}
		for(int i=0;i < student;i++) {
			 society_avg += society[i];
		}
		String eng_avg = String.format("%.2f", english_avg/4);
		String mat_avg = String.format("%.2f", math_avg/4);
		String sci_avg = String.format("%.2f", science_avg/4);
		String soc_avg = String.format("%.2f", society_avg/4);
		System.out.println("英語の平均点は"+eng_avg+"点です。");
		System.out.println("英語の平均点は"+mat_avg+"点です。");
		System.out.println("英語の平均点は"+sci_avg+"点です。");
		System.out.println("英語の平均点は"+soc_avg+"点です。");
		
	}

}
