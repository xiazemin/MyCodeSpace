
public class TestSuper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher("zhangsan","th");
		teacher.displayName();	
		teacher.test();	
	}

}

class Person{
	public int height;
	private String name;
	public Person(String n){
		name = n;
	}
		
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public void displayName(){
		System.out.println(name);
	}
}
class Teacher extends Person{
	private String school;
	//No.1
	//开始写代码。需求：定义一个带2个参数的构造器：name和school，并使用它们分别初始化父类的name和这个类中的school属性
	public Teacher(String n, String scl){
		super(n); //调用父类构造器;
		school = scl;
	}
	//end_code
	public void displayName(){
		System.out.println(getName()+"老师");
	}
	public void test(){
		super.height = 100;
		super.displayName();
		System.out.println(super.height);
	}
}