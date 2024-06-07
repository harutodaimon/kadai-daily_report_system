package test04;

public class Review03 {

	public static void main(String[] args) {

		BaseBallTeam bbt1 = new BaseBallTeam();
		bbt1.setName("読売ジャイアンツ");
		bbt1.setWin(67);
		bbt1.setLose(45);
		bbt1.setDraw(8);


		BaseBallTeam bbt2 = new BaseBallTeam();
		bbt2.setName("阪神タイガース");
		bbt2.setWin(60);
		bbt2.setLose(53);
		bbt2.setDraw(7);

		BaseBallTeam bbt3 = new BaseBallTeam();
		bbt3.setName("中日ドラゴンズ");
		bbt3.setWin(60);
		bbt3.setLose(55);
		bbt3.setDraw(5);

		BaseBallTeam bbt4 = new BaseBallTeam();
		bbt4.setName("横浜DeNAベイスターズ");
		bbt4.setWin(56);
		bbt4.setLose(58);
		bbt4.setDraw(6);

		BaseBallTeam bbt5 = new BaseBallTeam();
		bbt5.setName("広島東洋カープ");
		bbt5.setWin(52);
		bbt5.setLose(56);
		bbt5.setDraw(12);

		BaseBallTeam bbt6 = new BaseBallTeam();
		bbt6.setName("東京ヤクルトスワローズ");
		bbt6.setWin(41);
		bbt6.setLose(69);
		bbt6.setDraw(10);


		bbt1.report();
		bbt2.report();
		bbt3.report();
		bbt4.report();
		bbt5.report();
		bbt6.report();

	}
}
