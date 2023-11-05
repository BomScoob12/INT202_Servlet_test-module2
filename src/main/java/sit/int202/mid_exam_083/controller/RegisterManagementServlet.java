package sit.int202.mid_exam_083.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "RegisterManagementServlet", value = "/083/register")
public class RegisterManagementServlet extends HttpServlet {
    //65130500083
    //Sarawit Kraukham


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/register_form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("fullname");
        String email = req.getParameter("email");
        HttpSession session = req.getSession();
        session.setAttribute("name", name);
        session.setAttribute("email", email);
        resp.sendRedirect(req.getContextPath() + "/083/is-prime");
    }
}
