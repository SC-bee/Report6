package jp.ac.uryukyu.ie.e195743;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * 2番目に引いたカードがcard配列に反映されていることを確認。
 */
class PrayerTest {

    @Test
    void blackJack() {
        Prayer prayer = new Prayer();
        prayer.BlackJack();
        int x = prayer.card[1];
        assertNotNull(x);
    }
}