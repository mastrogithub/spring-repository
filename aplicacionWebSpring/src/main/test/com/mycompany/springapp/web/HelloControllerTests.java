package com.mycompany.springapp.web;

import org.junit.Assert;
import org.springframework.web.servlet.ModelAndView;
import org.junit.Test;

public class HelloControllerTests{
    @Test
    public void testHandleRequestView() throws Exception{
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        Assert.assertEquals("hello.jsp", modelAndView.getViewName());
    }
}