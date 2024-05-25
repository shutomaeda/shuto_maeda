package curriculum_New_question;
import java.util.Random;
public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void hello(String s,int i) {
		System.out.println(s+" "+i);
	};
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void keisan(int i,int j) {
		System.out.println(i*j);
	};
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void junban(int num[]) {
		for(int i:num) {
			System.out.println(i);
		};
	};
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void keisan(double i,double j) {
		System.out.println(i+j);
	};
		
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
    public static int[] kakunou(int i) {
    	Random rand = new Random();
		int[] num = new int[i];
		for(int a = 0;a < i;a++) {
			int x = rand.nextInt(101)+1;
			num[a] = x;
		}
		
		return num;
	};
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double heikin(int[] num) {
		double sum = 0;
		for(int i:num) {
			sum += i;
		}
		double avg = sum/num.length;
		System.out.println(avg);
		return avg;
	}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static void trueorfalse(double avg) {
		if (avg >= 50) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	public static void main(String[] args) {
		int[] array = {1,3,5,6,7};
    // 作成したメソッドをここで呼び出してください
		//Q1
		hello("Hello JavaSE",11);
		//Q2
		keisan(1,2);
		//Q3
		junban(array);
		//Q4
		keisan(0.2,0.9);
		//Q5
		int[] num = kakunou(4);
		//Q6
		double avg = heikin(num);
		//Q7
		trueorfalse(avg);
	}

}
