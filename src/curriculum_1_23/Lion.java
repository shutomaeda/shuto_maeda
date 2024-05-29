package curriculum_1_23;

public class Lion {
	
	//フィールド
	private String name;
	private double tall;
	private double speed;

	public Lion() {
		this.name = "ライオン";
		this.tall = 2.1;
		this.speed = 80;
	}
	//セッター
	public void setName(String name) {
		this.name = name;
	};
	public void setTall(double tall) {
		this.tall = tall;
	};
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	//ゲッター
	public String getName() {
		return this.name;
	};
	public double getTall() {
		return this.tall;
	};
	public double getSpeed() {
		return this.speed;
	};
}
