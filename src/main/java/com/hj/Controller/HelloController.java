package com.hj.Controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Author: hj
 * Date: 2019-05-05 18:25
 * Description: <描述>
 */
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws Exception {
        String name = req.getParameter("name");
        ModelAndView modelAndView = new ModelAndView();
        //向前端传数据
        modelAndView.addObject("msg", "helllo" + name);
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
