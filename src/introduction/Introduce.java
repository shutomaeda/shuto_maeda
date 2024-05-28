package introduction;
import japan_info.Japan;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Introduce {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Date dateNow = new Date();
	    Japan j = new Japan();
		System.out.println("こんにちは！ここは"+j.country+"です！");
		System.out.println("この"+j.food+"はうまい");
		System.out.println(j.food+"は"+j.category+"です");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("今の現在日時は"+sdf.format(dateNow)+"です");
		
	}

}
