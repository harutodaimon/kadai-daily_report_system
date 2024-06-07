package test04;

public class Car {
    // フィールド
    private String brand;
    private String model;
    private int year;
    private int price;

    // 引数なしのコンストラクタ
    public Car() {}

    // getterおよびsetter
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    // 販売している自動車を紹介するメソッド
    public void introduce() {
        System.out.println(
            this.getBrand() + "の" + this.getYear() + "年製" +
            this.getModel() + "を、" +
            this.getPrice() + "万円で販売中です。"
        );
    }
}


