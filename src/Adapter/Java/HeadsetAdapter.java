package Adapter.Java;

/**
 * Created by prefert on 2017/11/19.
 * 耳机适配器 传统 => lightning
 */
public class HeadsetAdapter extends LightningConnector implements PhoneJackInterface {
    @Override
    public void audioTraditionally() {
        // 传统接口兼容 lightning
        super.audioWithLightning();
    }
}
