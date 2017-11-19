package Adapter.Java;

/**
 * Created by prefert on 2017/11/19.
 * Iphone (省略一些不必要的接口)
 */
public class Iphone {
   private PhoneJackInterface phoneJack;

    public Iphone(PhoneJackInterface phoneJack) {
        this.phoneJack = phoneJack;
    }

    // Iphone 具备播放声音的功能
    public void play() {
        // 通过 3.5mm 接口耳机播放
        phoneJack.audioTraditionally();
    }
}
