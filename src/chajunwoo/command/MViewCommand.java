package chajunwoo.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MViewCommand implements MCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8);"
		
		String id = request.getParameter("id");
		
		MemberDAO dao = new MemberDAO();
		
		MemberDTO dto = dao.view(id);
		
		request.setAttribute("dto", dto);
		

		

	}

}
