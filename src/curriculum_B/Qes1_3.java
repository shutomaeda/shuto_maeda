package curriculum_B;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;
public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1 ログイン時の入力チェックシステムを下記条件で作成してください
		// ・コンソールにユーザー名を入力できるようにしてください
		Scanner scanner = new Scanner(System.in);  
		String name = scanner.next(); 
		String regex_AlphaNum = "^[A-Za-z0-9]+$";
		Pattern p = Pattern.compile(regex_AlphaNum);
		Matcher m = p.matcher(name);
		boolean result = m.matches(); 
		// ・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		if (name.length() > 10) {
			System.out.println("名前を10文字以内にしてください");
		}
		// ・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		if (name.length() < 0 || name == null) {
			System.out.println("名前を入力してください");
		}
		// ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
		if (result == false) {
			System.out.println("半角英数字のみで名前を入力してください");
		}
		// ・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
		if (name.length() <= 10 && result == true) {
			System.out.println("ユーザー名" + name + "を登録しました");
			// じゃんけんのシステムを下記の条件で作成してください
						// ・「0はグー、1：チョキ、2：パー」とすること
						// ・じゃんけんに勝つまでループすること
						// ・一回ごとに自分の手と相手の手を下記の通り出力してください
						// ユーザー名「name」を登録しました
						// nameの手は「パー」
						// 相手の手は「グー」
						// ・条件分岐の設定
						// ・自分がじゃんけんに勝った場合、下記が出力されるようにしてください
						// やるやん。
						// 次は俺にリベンジさせて
						// ・自分がじゃんけんでグーに負けた場合、下記が出力されるようにしてください
						// 俺の勝ち！
						// 負けは次につながるチャンスです！
						// ネバーギブアップ！
						// ・自分がじゃんけんでチョキに負けた場合、下記が出力されるようにしてください
						// 俺の勝ち！
						// たかがじゃんけん、そう思ってないですか？
						// それやったら次も、俺が勝ちますよ
						// ・自分がじゃんけんでパーに負けた場合、下記が出力されるようにしてください
						// 俺の勝ち！
						// なんで負けたか、明日まで考えといてください。
						// そしたら何かが見えてくるはずです
						// ・あいこの場合、下記が出力されるようにしてください
						// DRAW あいこ もう一回しましょう！
						// じゃんけんを行った回数を表示してください
						// 勝つまでにかかった合計回数は1回です
						// ユーザー名が正常の場合じゃんけんのシステムが起動するようにしてください
			int cnt = 0;
			int win = 0;
			while(win == 0) {
			    Random rand = new Random();
			    String[] janken = {"グー","チョキ","パー"};
			    int me = rand.nextInt(3);
			    int you = rand.nextInt(3);
			    String myHand = janken[me];
			    String yourHand = janken[you];
			    
			    System.out.println(name + "の手は" + myHand);
			    System.out.println("相手の手は" + yourHand);
			    //自分がグー
			    if(me == 0 && you == 1) {
			    	System.out.println("次は俺にリベンジさせて");
			    	win += 1;
			    }else if (me == 0 && you == 2) {
			    	System.out.println("俺の勝ち！");
			    	System.out.println("なんで負けたか、明日まで考えといてください。");
			    	System.out.println("そしたら何かが見えてくるはずです");
			    	cnt ++;
			    }
			    //自分がチョキ
			    if(me == 1 && you == 2) {
			    	System.out.println("次は俺にリベンジさせて");
			    	win +=1;
			    }else if(me == 1 && you == 0) {
			    	System.out.println("俺の勝ち！");
			    	System.out.println("負けは次につながるチャンスです！");
			    	System.out.println("ネバーギブアップ！");
			    }
			    //自分がパー
			    if(me == 2 && you == 0) {
			    	System.out.println("次は俺にリベンジさせて");
			    	win += 1;
			    }else if(me == 2 && you == 1) {
			    	System.out.println("俺の勝ち！");
			    	System.out.println("たかがじゃんけん、そう思ってないですか？");
			    	System.out.println("それやったら次も、俺が勝ちますよ");
			    }
			    //あいこ
			    if(myHand == yourHand) {
			    	System.out.println("DRAW あいこ もう一回しましょう！");
			    }
			    cnt++;
		    }
			System.out.println("勝つまでにかかった合計回数は"+cnt+"です");
		}
	}
}


