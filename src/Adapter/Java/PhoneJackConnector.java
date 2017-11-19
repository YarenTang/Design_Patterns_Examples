package Adapter.Java;

/**
 * Created by prefert on 2017/11/19.
 * 传统耳机接口
 */
public class PhoneJackConnector implements PhoneJackInterface{
    @Override
    public void audioTraditionally() {
        System.out.println("通过 PhoneJack 播放声音");
    }
}
