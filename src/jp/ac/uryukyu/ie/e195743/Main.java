package jp.ac.uryukyu.ie.e195743;
import java.io.*;
/**
 *メインクラス
 */
public class Main {

    public static void main(String[] args) throws IOException {
        while (true) {
            Prayer prayer = new Prayer();
            Dealer dealer = new Dealer();
            GameMaster master = new GameMaster();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            prayer.BlackJack();
            dealer.BlackJack();
            master.Juge(prayer, dealer);
            System.out.println("再戦する場合はなにかキーを、再戦しない場合は n を押してください。");
            String str = br.readLine();
            if (str.equals("n")){
                break;
            }
        }
    }
}