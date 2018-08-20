package org.piaohao.fast.jfinal.demo;

import com.jfinal.config.*;
import com.jfinal.kit.PathKit;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.redis.RedisPlugin;
import com.jfinal.template.Engine;
import com.jfinal.template.source.ClassPathSourceFactory;
import org.piaohao.fast.jfinal.LogRequestInterceptor;

public class DemoConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants constants) {
        constants.setDevMode(false);
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
//        RedisPlugin rp = new RedisPlugin("main", "119.27.160.180", 6379, "19911026");
//        plugins.add(rp);
    }

    @Override
    public void configInterceptor(Interceptors interceptors) {
        interceptors.add(new LogRequestInterceptor());
    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
