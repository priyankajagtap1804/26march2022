package static_nonstaic_vadiff;

public abstract class emp_class {

	public static void main(String[] args) {
		emp2 sc1=new emp2();
		sc1.empid=101;
		sc1.empname="radha gore";
		//sc1.empceo="mahadev jagtap";
		emp2.empceo="mahadev jagtap";
		emp2 sc2=new emp2();
		sc2.empid=102;
		sc2.empname="rakesh sharama";
		//sc2.empceo="mahadev jagtap";
		emp2.empceo="mahadev jgtap";
		emp2 sc3=new emp2();
		sc3.empid=103;
		sc3.empname="hansika rathod";
		//sc3.empceo="sanjay chawan";
		emp2.empceo="sanjay chawan";
		sc1.print();
		sc2.print();
		sc3.print();
	}
	
}
