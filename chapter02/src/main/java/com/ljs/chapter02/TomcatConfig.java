package com.ljs.chapter02;
//
//import org.apache.catalina.Context;
//import org.apache.catalina.connector.Connector;
//import org.apache.tomcat.util.descriptor.web.SecurityCollection;
//import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
//import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import sun.security.util.SecurityConstants;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/3/26 16:35
 **/

import org.springframework.context.annotation.Configuration;

/**
 * Author ljs
 * Description 将http请求转到https
 * Date 2019/3/26 16:35
 **/
@Configuration
public class TomcatConfig {

//    @Bean
//    TomcatServletWebServerFactory tomcatServletWebServerFactory(){
//        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory(){
//            @Override
//            protected  void postProcessContext(Context context){
//                SecurityConstraint constraint = new SecurityConstraint();
//                constraint.setUserConstraint("CONFIDENTIAL");
//                SecurityCollection collection = new SecurityCollection();
//                collection.addPattern("/*");
//                constraint.addCollection(collection);
//                context.addConstraint(constraint);
//            }
//
//        };
//
//        factory.addAdditionalTomcatConnectors(createTomcatConnector());
//        return factory;
//    }
//
//    private Connector createTomcatConnector(){
//        Connector connector = new Connector(("org.apache.coyote.http11.Http11NioProtocol"));
//        connector.setScheme("http");
//        connector.setPort(8080);
//        connector.setSecure(false);
//        connector.setRedirectPort(8081);
//        return connector;
//    }
}
