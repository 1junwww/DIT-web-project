package chajunwoo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MListCommand implements MCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		MemberDAO dao = new MemberDAO();
		
		ArrayList<MemberDTO> dtos = dao.list();
		
		request.setAttribute("dtos", dtos);
	
	}

}
