package curriculum_B;
import java.util.Scanner;
import java.util.Random;
public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		String[] kadens = scanner.nextLine().split("、");
		int max_num = 11;
		
		for(String kaden:kadens) {
			int num = rand.nextInt(12);
			switch(kaden) {
			case "パソコン":
				System.out.println(kaden+"の残り台数は"+num+"台です");
				break;
			case "冷蔵庫":
				System.out.println(kaden+"の残り台数は"+num+"台です");
				break;
			case "扇風機":
				System.out.println(kaden+"の残り台数は"+num+"台です");
				break;
			case "洗濯機":
				System.out.println(kaden+"の残り台数は"+num+"台です");
				break;
			case "加湿器":
				System.out.println(kaden+"の残り台数は"+num+"台です");
				break;
			case "テレビ":
				System.out.println(kaden+"の残り台数は"+num+"台です");
				break;
			case "ディスプレイ":
				System.out.println(kaden+"の残り台数は"+(max_num-num)+"台です");
				break;
			default:
				System.out.println("『"+kaden+"』は指定の商品ではありません");
			}
		}
		
		
	}

}
