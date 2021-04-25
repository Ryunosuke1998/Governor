package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GovernorDAO;
import model.Governor;
//テスト
/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ホーム画面にフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String name = "";
		String q1 = request.getParameter("q1");
		String q2 = request.getParameter("q2");
		String q3 = request.getParameter("q3");
		String q4 = request.getParameter("q4");
		String q5 = request.getParameter("q5");

		Map<String, String> governorMap = new HashMap<String, String>();
		GovernorDAO dao = new GovernorDAO();
		//DBからデータ取得し配列に入れる
		ArrayList<Governor> governorList = new ArrayList<Governor>();
		governorList = dao.getAnswer();

		int i = 0;
		for (Governor g : governorList) {
			name = g.getName();

			if (q1.equals(g.getQ1())) {
				i++;
			}
			if (q2.equals(g.getQ2())) {

				i++;
			}
			if (q3.equals(g.getQ3())) {

				i++;
			}
			if (q4.equals(g.getQ4())) {

				i++;
			}
			if (q5.equals(g.getQ5())) {

				i++;
			}
			i=i*20;
			String si = Integer.valueOf(i).toString();
			governorMap.put(name, si);
			i = 0;
		}
		String message1 = "星野美恵子とのマッチング率："+governorMap.get("hoshino")+"%";
		String message2 = "服部誠太郎とのマッチング率："+governorMap.get("hoshino")+"%";
		request.setAttribute("message1",message1);
		request.setAttribute("message2", message2);
		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
		d.forward(request, response);
	}

}
