package collectionProgram;

class Employee{
	String role;
	int eid;
	double ctc;
	Employee(String role, int eid, double ctc) {
		super();
		this.role = role;
		this.eid = eid;
		this.ctc = ctc;
	}
	 @Override
	public String toString() {
		return "Employee [role=" + role + ", eid=" + eid + ", ctc=" + ctc + "]";
	}
}
public class Mainclass3 {
 public static void main(String[] args) {
	Employee[] emp = new Employee[5];
	emp[0]= new  Employee("QA",3457,4.5);
	emp[1]= new  Employee("dev",4005,4.5);
	emp[2]= new  Employee("Mgr",2013,9.5);
	emp[3]= new  Employee("Dev",2972,7.4);
	emp[4]= new  Employee("Tl",3015,8.4);
	Employee e=emp[0];
	for(int i=0;i<emp.length;i++) {
		//System.out.println(emp[i]);
		if(emp[i].ctc>e.ctc) {
			e=emp[i];
		}
	}
   System.out.println("role:"+ e.role +" id:" + e.eid +  " d*ctc:" + e.ctc );
}
}
