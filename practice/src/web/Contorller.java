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

		// ��ʂ̃{�^��ID���擾����B
		request.setCharacterEncoding("UTF-8");
		String buttonID = request.getParameter("BUTTON_ID");

		// �{�^��ID��null�̏ꍇ�A�f�t�H���g�l��ݒ肷��B
		if (buttonID == null) {
			session.invalidate();
			buttonID = "M00";
		}


		// �ǂ̃{�^���������ꂽ���ɂ���ď�����U�蕪����B
		switch(buttonID) {
			//���O�C����ʂ֖߂�{�^���������ꂽ�ꍇ
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