package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/src")
public class Contorller extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
											throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request,
	 * 										HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
											throws ServletException, IOException {
		HttpSession session = request.getSession();
		String page = null;

		// 画面のボタンIDを取得する。
		request.setCharacterEncoding("UTF-8");
		String buttonID = request.getParameter("BUTTON_ID");

		// ボタンIDがnullの場合、デフォルト値を設定する。
		if (buttonID == null) {
			session.invalidate();
			buttonID = "M00";
		}


		// どのボタンが押されたかによって処理を振り分ける。
		switch(buttonID) {
			//ログイン画面へ戻るボタンが押された場合
			case "M00":
				session.invalidate();
				page = "/VendingMachine.jsp";
				break;
		}

		System.out.println(page);

		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}
}