package Adapter.Java;

/**
 * Created by prefert on 2017/11/19.
 */
public class Test {
    public static void main(String[] args) {
        // iphone 7 以前通过通用的耳机接口播放
        PhoneJackInterface phoneJack = new PhoneJackConnector();
        Iphone iphone6 = new Iphone(phoneJack);
        iphone6.play();

        // iphone 7 及以后通过 lightning 接口播放
          // 类适配器
        HeadsetAdapter headsetAdapter = new HeadsetAdapter();
        Iphone iphone7 = new Iphone(headsetAdapter);
        iphone7.play();
          // 对象适配器
        ObjectHeadsetAdapter objectHeadsetAdapter = new ObjectHeadsetAdapter(new LightningConnector());
        Iphone iphoneX = new Iphone(objectHeadsetAdapter);
        iphoneX.play();
    }
}
