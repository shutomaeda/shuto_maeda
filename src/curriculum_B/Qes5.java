package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1;i < 10;i++) {
			for(int j = 1;j < 21;j++) {
				String num1 = String.format("%03d",i);
				String num2 = String.format("%03d",j);
				String x = String.format("%03d",i*j);
				System.out.print(num2+" * "+num1+" = "+x);
				if(j != 20){
					System.out.print(" || ");
				}
			}
			System.out.println();
		}

	}

}
