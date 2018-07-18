package org.piaohao.fast.jfinal.demo;

import com.jfinal.core.Controller;
import com.jfinal.kit.PropKit;

public class DemoController extends Controller {

    public void index() {
        setAttr("project", "fast-jfinal");
        setAttr("name", PropKit.get("name"));
        render("index.html");
    }
}
