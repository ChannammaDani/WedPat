package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PatientDao;
import dto.PatientDto;
@WebServlet("/abc")
public class PatientServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String a = req.getParameter("id");
		int id = Integer.parseInt(a);
		String name = req.getParameter("name");
		String b_group = req.getParameter("b_group");
		String b = req.getParameter("phn_no");
		long phn_no = Long.parseLong(b);
		
		PatientDto patientDto = new PatientDto();
		patientDto.setId(id);
		patientDto.setName(name);
		patientDto.setB_group(b_group);
		patientDto.setPhn_no(phn_no);
		
		PatientDao patientDao = new PatientDao();
		patientDao.insert(patientDto);
	}
}
