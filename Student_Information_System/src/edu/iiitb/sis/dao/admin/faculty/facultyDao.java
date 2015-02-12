package edu.iiitb.sis.dao.admin.faculty;

import java.sql.Connection;



import java.sql.PreparedStatement;

import edu.iiitb.sis.dbUtil.ConnectionPool;
import edu.iiitb.sis.model.Faculty;

public class facultyDao {

	private String message;
	public String addFaculty(Faculty facultyModelObj) {
		// TODO Auto-generated method stub
		
		Connection con=ConnectionPool.getConnection();
		PreparedStatement pstmt=null;
		String queryToAddFaculty="insert into faculty (faculty_name,faculty_qualification,faculty_phoneno,faculty_mailid,faculty_id) values(?,?,?,?,?)";
		try {
			
			
			//System.out.println("hereee");
			
			pstmt=con.prepareStatement(queryToAddFaculty);
			pstmt.setString(1, facultyModelObj.getFacultyName());
			pstmt.setString(2, facultyModelObj.getQualifications());
			pstmt.setString(3, facultyModelObj.getPhoneNumber());
			pstmt.setString(4, facultyModelObj.getEmail());
			pstmt.setString(5, facultyModelObj.getFacultyUserName());
			int result=pstmt.executeUpdate();
			if(result>0)
				message="success";
			else	
			message= "failure";
			
			
		} catch (Exception e) {
			
			// TODO: handle exception
			System.out.println(e.getLocalizedMessage());
		e.printStackTrace();
	
		}
		return message;
	}

	
	
	
	
}
