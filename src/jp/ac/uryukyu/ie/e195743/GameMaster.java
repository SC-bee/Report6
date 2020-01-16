package jp.ac.uryukyu.ie.e195743;
import java.util.Random;
import java.util.*;
import java.io.*;

public class GameMaster {

    public void Juge(Prayer prayer , Dealer dealer) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        for (int i = 2; prayer.score < 22; i++) {
            System.out.println("あなたの点数は" + prayer.score + "です。");
            System.out.println("ディーラーの１枚目のカードは" + dealer.card[0] + "です。");
            System.out.println("もう一枚引くなら「1」、引かないなら「2」と入力してください");
            System.out.println("1:ヒット 2:スタンド");

            String str = br.readLine();

            if (str.equals("1")) {
                prayer.card[i] = random.nextInt(13) + 1;
                if (prayer.card[i] >= 10) {
                    prayer.card[i] = 10;
                }
                if (prayer.card[i] == 1) {
                    prayer.card[i] = 11;
                }
                prayer.score += prayer.card[i];
                if (prayer.score >= 22) {
                    System.out.println("あなたの点数は" + prayer.score + "です。");
                    System.out.println("プレイヤーはバストしました");
                    break;
                }
            }
            if (str.equals("2")) {
                System.out.println("ディーラーの点数は" + dealer.score + "です。");
                break;
            }
            for (int j = 0; dealer.score < 17; j++) {
                dealer.card[j] = random.nextInt(13) + 1;
                if (dealer.card[j] >= 10) {
                    dealer.card[j] = 10;
                }
                if (dealer.card[j] == 1) {
                    dealer.card[j] = 11;
                }
                dealer.score += dealer.card[j];
                if (dealer.score >= 22) {
                    System.out.println("ディーラーはバストしました");
                    break;
                }
            }
            if (dealer.score >= 22) {
                break;
            }
        }
        if (dealer.score > 21 && prayer.score < 22) {
            System.out.println("プレイヤーの勝ち");
        } else if (dealer.score < 22 && prayer.score > 21) {
            System.out.println("ディーラーの勝ち");
        } else if (dealer.score > prayer.score) {
            System.out.println("ディーラーの勝ち");
        } else if (dealer.score < prayer.score) {
            System.out.println("プレイヤーの勝ち");
        } else if (dealer.score == prayer.score) {
            System.out.println("引き分け");
        } else if (dealer.score > 21 && prayer.score > 21) {
            System.out.println("ディーラーの勝ち");
        }
    }
}
