package UbuntuPackage;

public class TestCat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print("ok!");
		Cat cat = new Cat();
		cat.setWeight(1000);
		System.out.println("猫的重量是:"+cat.getWeight());
		cat.miao();
		
	}
}	
class Animal{
	private int weight;
	public void setWeight(int w){
		weight = w;
	}
	public int getWeight(){
		return weight;
	}
}



//No.1
//开始写代码。需求：定义一个类Cat，继承父类Animal，并定义一个miao的方法，打印出“miao~”
class Cat extends Animal{
	public void miao(){
		System.out.println("miao~");
	}
}

//end_code