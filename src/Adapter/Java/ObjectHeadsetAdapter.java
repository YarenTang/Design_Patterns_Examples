package Adapter.Java;

/**
 * Created by prefert on 2017/11/19.
 * 对象适配器 传统 => lightning
 */
public class ObjectHeadsetAdapter implements PhoneJackInterface { // 基于传统耳机接口

   LightningConnector lightning; // 兼容新接口

    /**
     * 传入 lightning 接口
     * @param lightning
     */
    public ObjectHeadsetAdapter(LightningConnector lightning) {
        this.lightning = lightning;
    }

    /**
     * 对传统接口兼容
     */
    @Override
    public void audioTraditionally() {
        this.lightning.audioWithLightning();
    }
}
