package by.htp.ex.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final CommandProvider provider = new CommandProvider();
       
	//String link = request.get
	
    public FrontController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	
	public void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String commandName = request.getParameter("command");

		Command command = provider.getCommand(commandName);
		command.execute(request, response);
	}
	
}
