package com.qiujie.admin.web;

import com.qiujie.admin.pojo.po.Beauties;
import com.qiujie.admin.pojo.vo.PageVO;
import com.qiujie.admin.service.BeautiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class BeautiesAction {

    @Autowired
    private BeautiesService beautiesService;

    @ResponseBody
    @RequestMapping(value = "/listBeauties",method = RequestMethod.POST)
    public PageVO listBeauties(@RequestBody Map map, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        PageVO pageVO = beautiesService.listBeauties(map);

        System.out.println(map);
        return pageVO;
//        return null;
    }


    @RequestMapping(value = "/removeBeauties",method = RequestMethod.POST)
    public void removeBeauties(HttpServletResponse response, @RequestBody Map map, Model model){
        response.setHeader("Access-Control-Allow-Origin", "*");
        String pid = (String) map.get("pid");
        int resultd = beautiesService.removeBeautiesByPid(pid);
//        System.out.println(map.get("pid"));
        model.addAttribute("resultd",resultd);


    }

    @RequestMapping(value = "/addBeauties",method = RequestMethod.POST)
    public void addBeauties(HttpServletResponse response, @RequestBody Map map){
//        response.setHeader("Access-Control-Allow-Origin", "*");
        int resulta = beautiesService.addBeauties(map);
    }

    @RequestMapping(value = "/updateBeauties",method = RequestMethod.POST)
    public void updateBeauties(HttpServletResponse response, @RequestBody Map map){
        response.setHeader("Access-Control-Allow-Origin", "*");
        System.out.println(map);
        int resultu = beautiesService.updateBeauties(map);
    }

}
