package com.poly.morphism;

public class mainclass {

	public static void main(String[] args) {
	    auto a=new auto();
	    bike b=new bike();
	    car c=new car();
	    stimulator.veh_ride(a);
	    stimulator.veh_ride(b);
	    stimulator.veh_ride(c);

	}

}
class ola{
	void ride(){
		System.out.println("Riding");
	}
}
class auto extends ola{
	void ride(){
		System.out.println("in bike");
	}
}
class bike extends ola{
	void ride(){
		System.out.println("in bike");
	}
}
class car extends ola{
	void ride(){
		System.out.println("in car");
	}
}
class stimulator {
	static void veh_ride(ola a){
		a.ride();
	}
}
