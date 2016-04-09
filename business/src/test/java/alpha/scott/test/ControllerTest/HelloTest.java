package alpha.scott.test.ControllerTest;

import alpha.scott.test.BaseTest;
import alpha.scott.test.service.T_NameService;
import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by gst on 2016/3/29.
 */
public class HelloTest extends BaseTest {

    @Autowired
    private T_NameService t_nameService;
    private Logger logger = LoggerFactory.getLogger(HelloTest.class);
    @Test
    public void test(){
        System.out.println("尼妹美");
        logger.info("尼玛");
        t_nameService.select();
    }
}
