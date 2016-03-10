package Practice6.olgagavryliuk;

public interface LecturesDao {
	
	Lecture addLecture(Lecture lecture);
	Lecture getLecture(int id);
	void saveLecture(Lecture lecture);
	
}