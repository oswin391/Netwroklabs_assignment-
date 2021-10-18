
public class Employeedis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpClass emp = new EmpClass();
		Adress add = new Adress();
	for(int i =1;i<=2;i++)
	{
	
		emp.takeinput();
		//emp.show();
		add.takeinput1();
		//add.show1();
		//double com=emp.print(5.0);
		//System.out.println(emp.salary+com);
	}
	emp.show();
	double com=emp.print(5.0);
	System.out.println(emp.salary+com);
	add.show1();
	
	}
	
	
}
