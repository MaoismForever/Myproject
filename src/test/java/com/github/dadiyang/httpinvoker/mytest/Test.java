package com.github.dadiyang.httpinvoker.mytest;
import com.alibaba.fastjson.JSON;
import com.github.dadiyang.httpinvoker.HttpApiInvoker;
import com.github.dadiyang.httpinvoker.HttpApiProxyFactory;
import com.github.dadiyang.httpinvoker.annotation.HttpApi;
import com.github.dadiyang.httpinvoker.annotation.HttpReq;
import com.github.dadiyang.httpinvoker.annotation.Param;
import com.github.dadiyang.httpinvoker.interfaces.CityService;
import com.github.dadiyang.httpinvoker.propertyresolver.PropertiesBasePropertyResolver;
import com.github.dadiyang.httpinvoker.requestor.DefaultHttpRequestor;
import com.github.dadiyang.httpinvoker.requestor.HttpRequest;
import com.github.dadiyang.httpinvoker.util.ParamUtils;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.Options;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.sun.deploy.net.HttpUtils;
import org.apache.http.impl.conn.Wire;
import org.junit.Rule;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.CacheResponse;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.github.dadiyang.httpinvoker.util.ParamUtils.isCollection;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

public class Test {
    public static final int PORT = 18888;

    @Rule
    public static WireMockRule wireMockRule = new WireMockRule(options().port(18888));
    @HttpReq(value = "${abc.def:123}")
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, IOException {
//
//        Pattern VARIABLE_PATTERN = Pattern.compile("\\$\\{([^/]+?)}");
//        String s = "${asdf}";
//        Matcher m = VARIABLE_PATTERN.matcher(s);
//        m.find();
//        System.out.println(m.group(1));
//        Class<HttpApiInvoker> clazz = HttpApiInvoker.class;
//        Method m = clazz.getDeclaredMethod("prepareUrl", HttpReq.class);
//        m.setAccessible(true);
//
//        System.getProperties().setProperty("abc.def", "hello");
//;        String s = (String) m.invoke(new HttpApiInvoker(new PropertiesBasePropertyResolver(System.getProperties())),
//                Test.class.getDeclaredMethod("main", String[].class).getAnnotation(HttpReq.class));
//        System.out.println(s);

        System.out.println(Test.class.getMethod("main", String[].class).getGenericParameterTypes()[0]);

    }

}
