package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UpdatePatDao;
import dto.PatientDto;
@WebServlet("/def")
public class UpdatePat extends HttpServlet{
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String a = req.getParameter("id");
	int id = Integer.parseInt(a);
	String b_group = req.getParameter("b_group");
	
	UpdatePatDao updatePatDao = new UpdatePatDao();
	updatePatDao.update(id, b_group);
}
}
