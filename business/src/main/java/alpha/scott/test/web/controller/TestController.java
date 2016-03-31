package alpha.scott.test.web.controller;

import alpha.scott.test.Person;
import alpha.scott.test.dao.T_NameDAO;
import alpha.scott.test.service.T_NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by gst on 2016/3/28.
 */
@Controller
@RequestMapping("/controller")
public class TestController {

    @Autowired
    private T_NameService t_nameService;

    @ResponseBody
    @RequestMapping(value = "/s",method = RequestMethod.GET)
    public String test() {
        t_nameService.select();
        return "God";
    }
}
