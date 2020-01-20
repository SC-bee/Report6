package jp.ac.uryukyu.ie.e195743;
import java.io.*;
/**
 *メインクラス
 */
public class Main {

    public static void main(String[] args) throws IOException {
        while (true) {
            Player player = new Player();
            Dealer dealer = new Dealer();
            GameMaster master = new GameMaster();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            player.BlackJack();
            dealer.BlackJack();
            master.Judgment(player, dealer);
            System.out.println("再戦する場合はなにかキーを、再戦しない場合は n を押してください。");
            String str = br.readLine();
            if (str.equals("n")){
                break;
            }
        }
    }
}