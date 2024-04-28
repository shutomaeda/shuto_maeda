package curriculum_A;
import java.text.DecimalFormat;
public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1 下記9個をローカル変数として宣言のみしてください
		// ・バイト型・短整数型・整数型・長整数型
		byte byt;
		short shrt;
		int num;
		long lng;
		// ・単精度浮動小数点数型・倍精度浮動小数点数型
		float flt;
		double dbl;
		// ・文字型・文字列型
		char chr;
		String str;
		// ・ブーリアン型
		boolean bln;
		
		//2 それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		byt = 0;
		shrt = 0;
		num = 0;
		lng = 0;
		flt = 0.0f;
		dbl = 0.0;
		chr = 'A';
		str =  "abc";
		bln = false;
		
		
		//3 初期化をしたそれぞれの変数に値を代入してください
		byt = 10;
		shrt = 100;
		num = 1000;
		lng = 10000;
		flt = 9.5f;
		dbl = 10.5;
		chr = 'a';
		str =  "ハロー";
		bln = true;

		//4 下記の通りにコンソール出力されるようにしてください
		// 上記で作成した変数を必ず使用すること
		// 11110
		System.out.println(byt + shrt + num + lng);
		// 20
		System.out.println(2 * byt);
		// aハローtrue
		System.out.println(chr + str + bln);
		// 11130
		System.out.println(byt + shrt + num + lng + flt + dbl);
		// 10000000000
		System.out.println(byt*shrt*num*lng);
		// 0.105
		System.out.println(dbl/shrt);
		// -90
		System.out.println(byt - shrt);
		
		//5 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		// 「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		// 　String num="20";
		// 　int num1=23;
		// 　System.out.println("ハローJAVA"+(num+num1));
		int num1 = 20;
		int num2 = 23;
		System.out.println("ハローJAVA"+(num1+num2));
		
		//6 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		// ローカル変数に代入し○○に入れてください
		// 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		// 「初めまして○○です」
		// 「年齢は○○歳です」
		// 「身長は○○cmです」
		// 「体重は○○kgです」
		// 「好きな食べ物は○○です」
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String food = "寿司";
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		
		//7 自己紹介に加えてBMIが出力されるようにしてください
		// ただし計算は数値を直書きせず、全て変数を使ってすること
		double bmi = weight/((height/100)*(height/100));
		DecimalFormat df = new DecimalFormat("0.00"); 
	    String BMI = df.format(bmi);
		System.out.println("BMIは"+BMI+"です");
		
		//8 6で宣言した変数に再代入し下記の通りコンソールに出力してください
		// 初めまして鈴木一郎です
		// 年齢は24歳です
		// 身長168.5cmです
		// 体重は64.2kgです
		// 好きな食べ物はオムライスです
		// BMIは22.6です
		name = "鈴木一郎";
	    age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		bmi = weight/((height/100)*(height/100));
		BMI = df.format(bmi);
		System.out.println("BMIは"+BMI+"です");
		
		//9 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		// 初めまして鈴木一郎です
		// 年齢は48歳です
		// 身長337.0cmです
		// 体重は128.4kgです
		// 好きな食べ物はオムライスです
		// BMIは11.31です
	    age = age*2;
	    height = height*2;
		// int height_i = (int)height;
		weight = weight*2;
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		bmi = weight/((height/100)*(height/100));
	    BMI = df.format(bmi);
		System.out.println("BMIは"+BMI+"です");
		
		//10 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		age = 24;
		System.out.println(age >= 25);
		
		//11 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		height = 168.5;
		weight = 64.2;
		String Age = String.valueOf(age);
		String Height = String.valueOf(height);
		String Weight = String.valueOf(weight);
		System.out.println(Age+Height+Weight);
		
		//12 11で変換した【年齢・身長】を整数型に変換して出力してください
		int age2 = Integer.parseInt(Age);
		int height2 = (int)height;
		System.out.println(age2);
		System.out.println(height2);
		
		//13 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		// ただしif文は使わないでください
		System.out.println(age2 >= 25 || height2 >= 160);
	}

}
