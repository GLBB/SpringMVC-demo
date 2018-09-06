package cn.gl.controller;

import cn.gl.pojo.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ItemController {

    @RequestMapping("/itemList.action")
    public ModelAndView queryItemList(){
        List<Item> list = new ArrayList<>();
        list.add(new Item(1, "1华为 荣耀8", 2399, new Date(), "质量好！1"));
        list.add(new Item(2, "2华为 荣耀8", 2399, new Date(), "质量好！2"));
        list.add(new Item(3, "3华为 荣耀8", 2399, new Date(), "质量好！3"));
        list.add(new Item(4, "4华为 荣耀8", 2399, new Date(), "质量好！4"));
        list.add(new Item(5, "5华为 荣耀8", 2399, new Date(), "质量好！5"));
        list.add(new Item(6, "6华为 荣耀8", 2399, new Date(), "质量好！6"));

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", list);

//        <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
//           <property name="prefix" value="/WEB-INF/jsp/"/>
//           <property name="suffix" value=".jsp"/>
//        </bean>
        modelAndView.setViewName("itemList");

        return modelAndView;
    }
}
