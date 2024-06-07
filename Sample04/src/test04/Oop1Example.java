package test04;

public class Oop1Example {

    public static void main(String[] args) {

        // インスタンスを4件作成し、setterで初期値を格納する
        Car car1 = new Car();
        car1.setBrand("トヨカワ");
        car1.setModel("カロリー");
        car1.setYear(2018);
        car1.setPrice(200);

        Car car2 = new Car();
        car2.setBrand("邦産");
        car2.setModel("エクステンド");
        car2.setYear(2017);
        car2.setPrice(350);

        Car car3 = new Car();
        car3.setBrand("コンタ");
        car3.setModel("ピット");
        car3.setYear(2020);
        car3.setPrice(130);

        Car car4 = new Car();
        car4.setBrand("いぶき");
        car4.setModel("トラック");
        car4.setYear(2019);
        car4.setPrice(300);

        // それぞれの自動車を紹介する
        car1.introduce();
        car2.introduce();
        car3.introduce();
        car4.introduce();
    }

}

