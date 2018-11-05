/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hw3.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hw3.util.UserOper;
import com.hw3.model.UserBeans;

/**
 *
 * @author Zhixiang
 */
public class logInServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
         
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("utf-8");
        String type = request.getParameter("type");
        
        //check user state
        if("login".equals(type)) { //login
            String name = request.getParameter("username");
            String pwd = request.getParameter("password");
            if (name == null||"".equals(name.trim())||pwd == null||"".equals(pwd.trim())){
                System.out.println("username or password cannot be empty!");
                request.setAttribute("errinfo","username or password cannot be empty!");
                request.getRequestDispatcher("Login.jsp").forward(request, response);
                return;
            }            
            
            UserBeans user = new UserBeans();
            user.setName(name);
            user.setPwd(pwd);
            
            UserOper userOper = new UserOper();
            boolean isVaild = userOper.valid(user);
            if(isVaild){
                request.getSession().setAttribute("username", name);
                request.getRequestDispatcher("success.jsp").forward(request, response);
                return;
            }else{
                request.setAttribute("errinfo","username and password cannot match");
                request.getRequestDispatcher("Login.jsp").forward(request, response);
                return;
            }
    }else if ("logout".equals(type)){  // logout
        request.getSession().removeAttribute("username");
        request.getRequestDispatcher("Login.jsp").forward(request, response);
        return;
    }else if("register".equals(type)){  //register
        String name = request.getParameter("username");
        String pwd1 = request.getParameter("password1");
        String pwd2 = request.getParameter("password2");
        String email = request.getParameter("email");
        String tel = request.getParameter("tel");
        
        
        if (!pwd1.equals(pwd2)){
            request.setAttribute("errinfo","two password doesnot match!");
            request.getRequestDispatcher("register.jsp").forward(request, response);
            return;
        }
        
        UserBeans user = new UserBeans();
        user.setName(name);
        user.setPwd(pwd1);
        user.setEmail(email);
        user.setTel(tel);
        
        UserOper userOper = new UserOper();
        boolean isExist = userOper.isExist(user);
        if(!isExist){
                userOper.add(user);
                response.sendRedirect("Login.jsp");
                return;
            }else{
                request.setAttribute("errinfo","username "+user.getName()+" already exist!");
                request.getRequestDispatcher("register.jsp").forward(request, response);
                return;
        }
    }
    
  }  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
