package sit.int202.mid_exam_083.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import sit.int202.mid_exam_083.models.HistoryNumber;
import sit.int202.mid_exam_083.models.NumberCheck;

import java.io.IOException;

@WebServlet(name = "PrimeNumberServlet", value = "/083/is-prime")
public class PrimeNumberServlet extends HttpServlet {
    //65130500083
    //Sarawit Kraukham

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("../prime_number.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int number = Integer.parseInt(req.getParameter("number"));
        HttpSession session = req.getSession(false);
        HistoryNumber historyNumber = new HistoryNumber();
        NumberCheck numberCheck;
        if (number < 0) {
            req.setAttribute("errMsg", number + "is invalid input!!!");
            req.getRequestDispatcher("../prime_number.jsp").forward(req, resp);
            return;
        }
        if (number == 1 || number == 0) {
            req.setAttribute("result", false);
            numberCheck = new NumberCheck(number, false);
        } else {
            if(checkIsPrime(number)) {
                req.setAttribute("result", true);
                numberCheck = new NumberCheck(number, true);
            } else {
                req.setAttribute("result", false);
                numberCheck = new NumberCheck(number, false);
            }
        }
        historyNumber.addNumber(numberCheck);
        session.setAttribute("history", historyNumber);
        req.setAttribute("number", number);
        req.getRequestDispatcher("../prime_number.jsp").forward(req, resp);
    }

    private boolean checkIsPrime(int num) {
        // Check from 2 to n-1
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;

        return true;
    }
}

