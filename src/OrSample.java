
public class OrSample {

    public static void main(String[] args) {
        int scoreSansu = 80;
        int scoreKokugo = 30;

        if (scoreSansu >= 60 && scoreKokugo >= 60) {
            System.out.println("合格してます!");
        } else if(scoreSansu >= 60 || scoreKokugo >= 60) {
            System.out.println("算数か国語どちらかが補講対象です");
        } else {
            System.out.println("赤点です．．．補講を行います");
        }
    }

}
