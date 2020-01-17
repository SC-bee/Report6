package jp.ac.uryukyu.ie.e195743;
import java.util.Random;
public class Dealer {
    int score = 0;
    Random random = new Random();
    int[] card =new int[30];

    public void BlackJack(){
        for (int i=0;i<2;i++) {
            card[i] = random.nextInt(13) + 1;
            if (card[i] >= 10) {
                card[i] = 10;
            }
            if (card[i] == 1) {
                card[i] = 11;
            }
            score += card[i];
            if (score >= 22) {
                for (int l = 0; l <= card.length; l++) {
                    if (card[l] == 11) {
                        card[l] = 1;
                        score -= 10;
                    }
                }
            }
        }
    }
}

