package collectionProgram;
class Student{
	String name;
	int yop;
	double cgpa;
	Student(String name, int yop,double cgpa){
		this.name=name;
		this.yop=yop;
		this.cgpa=cgpa;	
	}
	
	public String disp() {
		return "[name: "+name+" ,yop : "+yop+" cgpa:"+cgpa+"]";
	}
}
public class Mainclass2 {
public static void main(String[] args) {
	Student[] stu= new Student[5];//Non primitive array that store object
	stu[0]=new Student("abs",2021,8.9);
	stu[1]=new Student("aas",2022,6.5);
	stu[2]=new Student("ahhs",2024,6.9);
	stu[3]=new Student("bbbs",2023,7.9);
	stu[4]=new Student("bmbs",2022,8.7);
	for(int i=0;i<stu.length;i++) {
		System.out.println(stu[i].disp());
	}
}
}
