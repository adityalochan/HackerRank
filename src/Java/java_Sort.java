package Java;

import java.util.*;

class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
 
}
class CompareCGPA implements Comparator<Student>{
	  @Override
	  public int compare(Student o1, Student o2) {
		  if(o1.getCgpa()==o2.getCgpa()){
			  int compareName = (o1.getFname().compareTo(o2.getFname()));
			  if(compareName == 0 ){
				  return (o1.getId() - o2.getId());
			  }
				  else
					  return compareName;
		  }else
			  return (int)- (o1.getCgpa() *1000 - o2.getCgpa()*1000);
	  }
	  		// TODO Auto-generated method stub
//		  if(o1.getCgpa() < o2.getCgpa()){
//	  		return (int) - (o1.getCgpa() - o2.getCgpa());
//	  	}
//		  if(o1.getCgpa() == o2.getCgpa()){
//			  return  (o1.getFname().compareTo(o2.getFname()));
//		  }
//		 return (o1.getId() - o2.getId());
//	  }
}
//class CompareFname implements Comparator<Student>{
//	  @Override
//	  public int compare(Student o1, Student o2) {
//	  		// TODO Auto-generated method stub	 
//	  		return  (o1.getFname().compareTo(o2.getFname()));
//	  	}
//}
//
//class CompareID implements Comparator<Student>{
//	  @Override
//	  public int compare(Student o1, Student o2) {
//	  		// TODO Auto-generated method 
//	  		return  (o1.getId() - o2.getId());
//	  	}
//}

//Complete the code
public class java_Sort 
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         testCases--;
      }
      	for(int i = 0;i< studentList.size();i++){
      		Collections.sort(studentList, new CompareCGPA());
//      		Collections.sort(studentList, new CompareFname());
//      		Collections.sort(studentList, new CompareID());
      	}
//      
//      Collections.sort(studentList,  Comparator.comparing(Student :: getCgpa).reversed().
//             thenComparing(Student :: getFname).thenComparing(Student :: getId));
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
// fuck me . fuck me . fuck me. I saw discussions since i couldnt solve this problem. 
}
}
