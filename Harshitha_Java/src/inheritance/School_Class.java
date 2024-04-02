package inheritance;
//Assignment-35
//Method Overriding
class College_Class{
	void bookstowrite()//same name and signature
	{
		System.out.println("writing to study");
	}
}
public class School_Class extends College_Class{
	void bookstowrite()//same name and signature
	{
		System.out.println("writing to top the class");
		super.bookstowrite();//super keyword can be any line
	}
	
	public static void main(String[] args) {
		School_Class s1=new School_Class();
		s1.bookstowrite();//calling child class
		//s1.bookstowrite();;
		}

}