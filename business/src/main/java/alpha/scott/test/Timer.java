package alpha.scott.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by gst on 2016/3/29.
 */
@Component
public class Timer {
    private Logger logger = LoggerFactory.getLogger(Timer.class);
    //@PostConstruct
    public void init() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000L * 10 * 1);
                        logger.info("初始化注解生效了");
                    } catch (InterruptedException e) {
                        logger.error("", e);
                    }
                }
            }
        }).start();
    }
}
