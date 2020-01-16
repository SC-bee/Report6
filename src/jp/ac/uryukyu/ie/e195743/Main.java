package jp.ac.uryukyu.ie.e195743;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Prayer prayer = new Prayer();
        Dealer dealer = new Dealer();
        GameMaster master = new GameMaster();
        prayer.BlackJack();
        dealer.BlackJack();
        master.Juge(prayer,dealer);
    }
}
