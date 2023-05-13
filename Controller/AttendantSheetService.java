package studentAttendence.Controller;


import java.util.ArrayList;
import java.util.Date;

import studentAttendence.Interfaces.IAttendantSheetService;
import studentAttendence.Interfaces.IStudentService;
import studentAttendence.entity.AttendentSheet;
import studentAttendence.entity.Student;

public class AttendantSheetService implements IAttendantSheetService{
private ArrayList<AttendentSheet> listOfAttendance;
	
	public AttendantSheetService() {
		listOfAttendance = new ArrayList<AttendentSheet>();
	}
	
	@Override
	public void takeAttendance(IStudentService studentService, int teacherId, String subject,
			String standard) {
		ArrayList<Student> listOfStudent = studentService.showListOfStudent(standard);
		
		for(Student student : listOfStudent) {
			System.out.println("**************************");
			System.out.println("Roll No = "+ student.getRollNum());
			System.out.println("Name = "+ student.getFullName());
			
			String status = ScannerUtil.getString("Status...");
			
			AttendentSheet attendentSheet = new AttendentSheet();
			attendentSheet.setSrNo(listOfAttendance.size()+1);
			attendentSheet.setRollNo(student.getRollNum());
			attendentSheet.setStandard(standard);
			attendentSheet.setSubject(subject);
			attendentSheet.setStatus(status);
			attendentSheet.setTeacherId(teacherId);
			attendentSheet.setDate(new Date());
			
			listOfAttendance.add(attendentSheet);
		}
	}

	@Override
	public void showAttendance() {
		System.out.println(listOfAttendance);
	}
	
		

}
