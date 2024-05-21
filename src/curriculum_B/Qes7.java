package curriculum_B;
import java.util.Scanner;
public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("生徒の人数を入力してください(2人以上):");
		Scanner scan = new Scanner(System.in);
		int student = scan.nextInt();
		double[] english = new double[student];
		double[] math = new double[student]; 
		double[] science = new double[student];
		double[] society = new double[student];
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
		scan.close();
		//　生徒ごとの平均点
		for(int i = 0;i < student;i++) {
			double avg = (english[i] + math[i] + science[i] + society[i])/4;
			String avg_stdnt = String.format("%.2f", avg);
			System.out.println((i+1)+"人目の平均点は"+avg_stdnt+"点です。");
		}
		System.out.println();
		//　科目ごとの平均点
		double english_all = 0; 
		double math_all = 0;
		double science_all = 0;
		double society_all = 0;
		for(int i=0;i < student;i++) {
			 english_all += english[i];
			 math_all += math[i];
			 science_all += science[i];
			 society_all += society[i];
		}

		String eng_avg = String.format("%.2f", english_all/student);
		String mat_avg = String.format("%.2f", math_all/student);
		String sci_avg = String.format("%.2f", science_all/student);
		String soc_avg = String.format("%.2f", society_all/student);
		System.out.println("英語の平均点は"+eng_avg+"点です。");
		System.out.println("数学の平均点は"+mat_avg+"点です。");
		System.out.println("理科の平均点は"+sci_avg+"点です。");
		System.out.println("社会の平均点は"+soc_avg+"点です。");
		//全体の平均点
		double subject_all = english_all + math_all + science_all + society_all;
		String all_avg = String.format("%.2f",subject_all/(student*4));
		System.out.print("全体の平均点は"+all_avg+"点です。");
	}

}
