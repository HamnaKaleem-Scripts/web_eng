import java.util.*;
class car {
	private String model;  
	private String make ;
	private int  year ;
	private double price;
	//constructor
	
	public car (){
		model= "abc" ;
		make="def";
		year=0;
		price=0.0;
		
	}
	public car(String model_1,String _1,int year_1,double price){
		model=model;
		make=make;
		year=year;
		price=price;
	}
	//getter/setter
	public String getmodel(){
		return model;
	}
	public String getmake(){
		return make;
	}
	public int getyear(){
		return year;
	}
	public double getprice(){
		return price;
	}
	
	public void setyear (int years ){
		year=years;
	}
	public void setmodel (double  prices){
		price=prices;
	}
	public void setmake (String makes){
		make=makes;
	}

	
	//methods
	public void inputData(){
		System.out.println("please ener the car details ");
		Scanner in =new Scanner(System.in );
		System .out.print ("model : ");
		model=in.nextLine();
		System .out.print ("make : ");
		make=in.nextLine();
		System .out.print("year : ");
		year=in.nextInt();
		System .out.print ("price : ");
		price=in.nextDouble();
	}
	public void showData(){
		
		System.out.println("model="+model );
		System.out.println("make = " +make);
		System.out.println("year = " +year );
		System.out.println("price = " + price );
		
	}
}
public class driver{
	public static void main (String[] args){
		double max_price=0.0;
		car obj1 = new car();
		car obj2 = new car();
		car obj3 = new car();
		car obj4 = new car();
		car obj5 = new car();
		ArrayList info= new ArrayList();
		
		info.add(obj1);
		info.add(obj2);
		info.add(obj3);
		info.add(obj4);
		info.add(obj5);
		for (int i =0;i<info.size();i++){
			car obj =  (car)info.get(i);
			obj.inputData();
			
		}
		for (int i =0;i<info .size();i++){
			car obj =  (car)info.get(i);
			System.out.println("info for car " + i "is given below ");
			obj.showData();
			
		}
		for (int i =0;i<info.size();i++){
			car obj =  (car)info.get(i);
			if (obj.getprice()>max_price){
				max_price=obj.getprice();
			}
		}
		for (int i =0;i<info.size();i++){
			car obj =  (car)info.get(i);
			if (obj.getprice()==max_price){
				System.out.println("the highest price car is : " );
				obj.showData();
			}
		}
		
		
		
	}
	
}