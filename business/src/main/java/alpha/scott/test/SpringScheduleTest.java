package alpha.scott.test;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by gst on 2016/3/17.
 */
@Component
public class SpringScheduleTest {

    @Scheduled(cron="0/5 * *  * * ? ")  //每5秒执行一次
    public void execute() {
        System.out.println("定时执行了");
    }
}
