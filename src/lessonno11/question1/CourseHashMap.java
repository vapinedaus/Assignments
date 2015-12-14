package lessonno11.question1;


import java.util.*;

class Course{
	private String c_name;
	private String[] faculty;
	
	Course(String c_name, String[] faculty)
	{
		this.c_name = c_name;
		this.faculty = faculty;
	}
	
	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String[] getFaculty() {
		return faculty;
	}

	public void setFaculty(String[] faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString()
	{
		return c_name + "-" + Arrays.toString(faculty);
	}
}

public class CourseHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Course> hashMap = new HashMap<String, Course>();
		
		hashMap.put("CS390", new Course("FPP", new String[] {"Vitor", "Anthony", "Michael"}));
		hashMap.put("CS401", new Course("MPP", new String[] {"Jane", "Cindy", "Amir"}));
		System.out.println("CS416 is existing?" + hashMap.containsKey("CS466"));
		System.out.println("CS401 is existing? " + hashMap.containsKey("CS401"));
		
		System.out.println("hashMap.keySet(): " + hashMap.keySet());
		System.out.println("hashMap.values(): " + hashMap.values());
		
		hashMap.forEach((cid, course) -> System.out.println(course));
		
		System.out.println("Hashmap size: " + hashMap.size());
		

	}

}