package StudentDao;

public interface StudentDao {
	void addStudent();
	void viewStudent();
	void viewSpecificStudent(int sno);
	void updateStudent(int sno);
	void DeleteStudent(int sno);

}
