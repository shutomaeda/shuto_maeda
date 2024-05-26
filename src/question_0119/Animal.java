package question_0119;

import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Animal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		Date dateNow = new Date();
		int num = rand.nextInt(10);
		Dog d1 = new Dog();
		Dog d2 = new Dog(num);
	// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		System.out.println(d1.name);
	// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		System.out.println(d2.num);
	// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		System.out.println(sdf.format(dateNow));
	}

}
