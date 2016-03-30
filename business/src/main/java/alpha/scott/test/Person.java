package alpha.scott.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by gst on 2016/3/29.
 */
@Component
public class Person {
    @Autowired
    private SpeakHigh spk;

    public void setSpk(SpeakHigh spk) {
        this.spk = spk;
    }

    public SpeakHigh getSpk() {
        return this.spk;
    }

    public void fun(){
        spk.speak();
    }
}
