package curriculum_B;
import java.util.Scanner;
public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1 ログイン時の入力チェックシステムを下記条件で作成してください
		// ・コンソールにユーザー名を入力できるようにしてください
		Scanner scanner = new Scanner(System.in);  
		String name = scanner.next(); 
		// ・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		if (name.length() > 10) {
			System.out.println("名前を10文字以内にしてください");
		}
		// ・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		if (name.length() < 0 || name == null) {
			System.out.println("名前を入力してください");
		}
		// ・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
		if (name.length() <= 10 && name == "^[A-Za-z0-9]+$") {
			System.out.println("ユーザー名" + name + "を登録しました");
		}

		// ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
		if (name != "^[A-Za-z0-9]+$") {
			System.out.println("半角英数字のみで名前を入力してください");
		}
		// じゃんけんのシステムを下記の条件で作成してください
		// ・「0はグー、1：チョキ、2：パー」とすること
		// ・じゃんけんに勝つまでループすること
		// ・一回ごとに自分の手と相手の手を下記の通り出力してください
	}

}
