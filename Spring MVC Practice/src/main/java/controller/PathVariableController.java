package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("pvc")
public class PathVariableController {
    
    @RequestMapping("/m1/{city}")
    @ResponseBody
    String m1(@PathVariable String city) {
        return city;
    }
    
    @RequestMapping("/m2/{prod}/{item}")
    @ResponseBody
    String m2(@PathVariable Map<String,String> requestMap) {
        return requestMap.get("prod") + " " + requestMap.get("item");
    }
}
