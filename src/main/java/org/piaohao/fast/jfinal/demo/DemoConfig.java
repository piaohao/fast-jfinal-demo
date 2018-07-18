package org.piaohao.fast.jfinal.demo;

import com.jfinal.config.*;
import com.jfinal.kit.PathKit;
import com.jfinal.kit.PropKit;
import com.jfinal.template.Engine;
import com.jfinal.template.source.ClassPathSourceFactory;

public class DemoConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants constants) {
        constants.setDevMode(true);
        PathKit.setWebRootPath("WEB-INF/view");
        PropKit.use("app.properties");
    }

    @Override
    public void configRoute(Routes routes) {
        routes.add("/", DemoController.class, "");
    }

    @Override
    public void configEngine(Engine engine) {
        engine.setSourceFactory(new ClassPathSourceFactory());
    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
