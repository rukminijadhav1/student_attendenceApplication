package studentAttendence.Interfaces;

import java.util.ArrayList;

import studentAttendence.entity.Student;

public interface IStudentService {
	public void addNewStudent(final String name, final String mobile, final String standard);
	public ArrayList<Student> showListOfStudent(String standard);

}
