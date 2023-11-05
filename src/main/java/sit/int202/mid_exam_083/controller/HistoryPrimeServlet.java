package sit.int202.mid_exam_083.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import sit.int202.mid_exam_083.models.HistoryNumber;
import sit.int202.mid_exam_083.models.NumberCheck;
import java.util.List;
import java.io.IOException;

@WebServlet(name = "HistoryPrimeServlet", value = "/083/history-prime")
public class HistoryPrimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        HistoryNumber historyNumber = (HistoryNumber) session.getAttribute("history");
        List<NumberCheck> numberCheckList = historyNumber.getCheckedNumber();
        for (var i : numberCheckList) {
            System.out.println(i.getNumber());
            System.out.println(i.isPrime());
        }
        req.setAttribute("number", numberCheckList);
        req.getRequestDispatcher("../displayHistory.jsp").forward(req, resp);
    }
}
