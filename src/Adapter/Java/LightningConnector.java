package Adapter.Java;

/**
 * Created by prefert on 2017/11/19.
 * iphone Lightning 接口
 */
public class LightningConnector implements LightningInterface {
    @Override
    public void audioWithLightning() {
        System.out.println("通过 Lightning 播放声音");
    }
}