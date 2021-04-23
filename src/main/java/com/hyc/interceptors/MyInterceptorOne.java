package com.hyc.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptorOne implements HandlerInterceptor {
    private boolean checkOutReqURI(String requestURI) {
        return requestURI.contains("login") || requestURI.contains("home") || requestURI.contains("account") || requestURI.contains("rechargeRecord") || requestURI.contains("allDiscover");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
//        String requestURI = request.getRequestURI();
//        if (checkOutReqURI(requestURI)) {
//            return true;
//        }
//        if (request.getSession().getAttribute("user") != null) {
//            System.out.println("got it");
//            System.out.println(request.getSession().getAttribute("user"));
//            return true;
//        }
////        request.getRequestDispatcher("/login").forward(request,response);
//        System.out.println(requestURI);
//        if (request.getMethod().equals("OPTIONS")){
//            response.setHeader("Access-Control-Allow-Origin","*");
//            response.setHeader("Access-Control-Allow-Methods", "*");
//            response.setHeader("Access-Control-Allow-Headers", "*");
//            response.setStatus(200);
//            return true;
//        }
//        response.setHeader("Access-Control-Allow-Origin","*");
//        response.setHeader("Access-Control-Allow-Methods", "*");
//        response.setHeader("Access-Control-Allow-Headers", "*");
//        System.out.println("重定向");
////        response.setHeader();
//        response.sendRedirect("/login");
//        return false;
    }
}
