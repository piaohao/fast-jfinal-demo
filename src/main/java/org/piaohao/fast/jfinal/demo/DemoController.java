package org.piaohao.fast.jfinal.demo;

import com.jfinal.core.Controller;

public class DemoController extends Controller {

    public void index(){
        setAttr("project","fast-jfinal");
        render("index.html");
    }
}
