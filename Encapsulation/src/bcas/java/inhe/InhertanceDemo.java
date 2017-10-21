package bcas.java.inhe;

public class InhertanceDemo {
	
	public static void main(String[] args) {
		 School sch = new School();
		 System.out.println(sch.getSchoolName());
		 System.out.println(sch.getAddress());
		 System.out.println(sch.getYear());
		 sch.printDeatails();
	}
        ClassRoomA cA= new ClassRoomA();
        cA.printDetails()

        System.out.println(cA.getNumoffStudents());
 i       System.out.println(cA.getTeacherName());
}
}
