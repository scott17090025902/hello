package alpha.scott.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by gst on 2016/3/28.
 */
@Controller
@RequestMapping("/hello")
public class Test {

    @Autowired
    private Person person;

    @ResponseBody
    @RequestMapping(value = "/bbb",method = RequestMethod.GET)
    public String test() {
       if(person!=null ){
           if(person.getSpk() != null){
               person.getSpk().speak();
               return "Hello World";
           }
           return "Hello";
       }
        return "God";
    }
}
