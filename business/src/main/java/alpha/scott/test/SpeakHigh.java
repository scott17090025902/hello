package alpha.scott.test;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by gst on 2016/3/29.
 */
@Component
public class SpeakHigh  {
    public void speak() {
        System.out.println("大声的说话");
    }
}
