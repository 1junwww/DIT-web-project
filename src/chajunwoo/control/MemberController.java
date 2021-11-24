package chajunwoo.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chajunwoo.command.MCommand;
import chajunwoo.command.MDeleteCommand;
import chajunwoo.command.MListCommand;
import chajunwoo.command.MUpdateCommand;
import chajunwoo.command.MViewCommand;


@WebServlet("*.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri = request.getRequestURI();
		System.out.println("uri: "+ uri);
		String com = uri.substring(uri.lastIndexOf("/")+1, uri.lastIndexOf(".do"));
		
		if(com != null && com.trim().equals("list")) {
			MCommand command = new MListCommand();
			command.execute(request, response);
			viewPage = "mList.jsp";
		}else if(com != null && com.trim().equals("view")) {
			command = new MViewCommand();
			command.execute(request, response);
			viewPage = "mView.jsp";
		}else if(com != null && com.trim().equals("update")) {
			command = new MUpdateCommand();
			command.execute(request, response);
			viewPage = "list.do";
		}else if(com != null && com.trim().equals("delete")) {
			command = new MDeleteCommand();	
			command.execute(request, response);
			viewPage = "list.do";
		}
				
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
