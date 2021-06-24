package com.vehicles;

public class Driver {

	public static void main(String[] args) {
		
		//object 1 for Petrol Bike
		System.out.println("Petrol Bike Object Created");
		Bikes b1=new Petrol(240,"MH03 5712","Bajaj Pulsar",2,"Geared");//upcasting
		Petrol p=(Petrol)b1;//DownCasting to access FuelType var of sub-class
		b1.setchasisNo("HGSGJDJWGSNJSJ47781");//Data Hiding & Design Flexibility Achieved 
		b1.start();//MCS
		b1.stop();//MCS
		System.out.println("Fuel Type:"+p.fuelType);//sub-class Var access by Downcasting
		System.out.println("Chasis Number (confidential):"+b1.getchasisNo());//Readable & Writeable
		b1.details();
		System.out.println("========================================");
		//object 2 for Electric Bike
		System.out.println("Electric Bike Object Created");
		Bikes b2=new Electric(25,"MH01 7552","Hero Electric Dash",2,"Gearless");//upcasting
		Electric e=(Electric)b2;//DownCasting to access FuelType var of sub-class
		e.setchasisNo("JDHBDKKD4588445912147");//Data Hiding & Design Flexibility( Achieved 
		e.start();
		e.stop();
		System.out.println("Fuel Type:"+e.fuelType);//
		System.out.println("Chasis Number (confidential):"+e.getchasisNo());//Readable & Writeable
		e.details();
		System.out.println("========================================");
		
		//TwoWheeler Sub class BiCycle Object Created
		System.out.println("BiCycle Object Created");
		BiCycle bi=new BiCycle(80,"NA","HERO Lectro",1,"Electric");
		bi.details();
		
		//ThreeWheelers Subclass Rikshaw Object Created
		System.out.println("Rikshaw Object Created");
		Rikshaw rik=new Rikshaw(120,"MH04 8411","Baja Auto Rikshaw",3,"Geared");
		rik.setchasisNo("YEYJDKISDO5558899363");//Data Hiding & Design Flexibility Achieved 
		rik.start();
		rik.stop();
		System.out.println("Fuel Type:"+rik.fuelType);
		System.out.println("Chasis Number (confidential):"+rik.getchasisNo());//Readable & Writeable
		rik.details();
		System.out.println("=================================");
		
		//Cars sub class Electric object created for electric car
		//pass the following actual args respectively..
		//..(int maxSpeed,String vno,String modelName,int seats,String type,int engineP,
		//int maxRange,boolean selfDriving)
		System.out.println("Electric Car Object Created");
		Cars e1=new ElectricCar(240,"MH01 2586","Tesla Model S",2,"Gearless",1500,1200,true);
		ElectricCar eCar =(ElectricCar)e1;//DownCasting to access sDetails method of sub-class
		eCar.setchasisNo("TYFGJGGBHJMKJHB252254500");//Data Hiding & Design Flexibility Achieved 
		eCar.start();
		eCar.stop();
		System.out.println("Chasis Number (confidential):"+eCar.getchasisNo());//Readable & Writeable
		eCar.details();
		eCar.sDetails();
		System.out.println("=================================");
		
		//Cars sub class Petrol object created for Petrol Car
		//pass the following actual args respectively to the constructor..
		//..(int maxSpeed,String vno,String modelName,int seats,String type,int engineP,double mileage).
		System.out.println("Petrol Car Object Created");
		Cars p1=new PetrolCar(305,"MH01 4752","Lamborghini Urus",5,"Gearless",3996,8.6);
		PetrolCar pCar =(PetrolCar)p1;//DownCasting to access FuelType var of sub-class
		pCar.setchasisNo("HHDHDUJUSDUJDJK57744551");//Data Hiding & Design Flexibility Achieved 
		pCar.start();
		pCar.stop();
		System.out.println("Chasis Number (confidential):"+pCar.getchasisNo());//Readable & Writeable
		pCar.details();
		pCar.sDetails();
		System.out.println("=================================");
		
		//Cars sub class Diesel object created for Diesel Car
		//pass the following actual args respectively to the constructor..
		//..(int maxSpeed,String vno,String modelName,int seats,String type,int engineP,double mileage).
		System.out.println("Diesel Car Object Created");
		Cars d1=new DieselCar(220,"MH01 4737","Mahindra Thar",4,"Geared",2000,10);
		DieselCar dCar =(DieselCar)d1;//DownCasting to access FuelType var of sub-class
		dCar.setchasisNo("IYDBDGHHCHNXCNHCJ7457115");//Data Hiding & Design Flexibility Achieved 
		dCar.start();
		dCar.stop();
		System.out.println("Chasis Number (confidential):"+dCar.getchasisNo());//Readable & Writeable
		dCar.details();
		dCar.sDetails();
		System.out.println("=================================");
		
		//Heavy Vehicles sub class Bus object created for Bus
		//pass the following actual args respectively to the constructor..
		//..(int maxSpeed,String vno,String modelName,int seats,String Deck).
		System.out.println("Bus Object Created");
		Bus bus=new Bus(150,"MH02 1752","Force",20,"Single");
		bus.setchasisNo("IYDBDGHHCHNXCNHCJ7457115");//Data Hiding & Design Flexibility Achieved 
		bus.start();
		bus.stop();
		System.out.println("Chasis Number (confidential):"+bus.getchasisNo());//Readable & Writeable
		bus.details();
		System.out.println("=================================");
		
		//Heavy Vehicles sub class Truck object created for Bus
		//pass the following actual args respectively to the constructor..
		//..(int maxSpeed,String vno,String modelName,int engineP,int noTyre,int maxLoad).
		System.out.println("Truck Object Created");
		Truck t=new Truck(150,"MH02 1562","Bharat Benz",241,10,28000);
		t.setchasisNo("IYDBDGHHCHNXCNHCJ7457115");//Data Hiding & Design Flexibility Achieved 
		t.start();
		t.stop();
		System.out.println("Chasis Number (confidential):"+t.getchasisNo());//Readable & Writeable
		t.details();
		System.out.println("=================================");
		
	}
}
class Vehicles {	//Supermost Class 
	int maxSpeed;//Variable declared inside supermost class which will inherited by every subclass
	String vno;
	String modelName;
	Vehicles()
	{
		//Default Constructor Explicitly Declared to avoid CTE.
	}
	Vehicles(int maxSpeed,String vno,String modelName)
	{
		//Initialization of Variables with Actual args
		this.maxSpeed=maxSpeed;
		this.vno=vno;
		this.modelName=modelName;
	}
	
	public void start() //start method
	{
		System.out.println(modelName+" Engine Started");
	}
	public void stop() //stop method
	{
		System.out.println(modelName+" Engine Off");
	}
}

class TwoWheelers extends Vehicles
{ 
	TwoWheelers()
	{
		//Default Constructor Explicitly Declared to avoid CTE.
	}
	int seats;
	TwoWheelers(int maxSpeed,String vno,String modelName,int seats)
	{
		super(maxSpeed,vno,modelName);//super calling the variables inside super most class
		this.seats=seats;
	}
	
}

class Bikes extends TwoWheelers //Bike Class is Extending TwoWheelers Super class
{
	private String chasisNo="NA";// Data Hiding Achieved
	Bikes()
	{
		//Default Constructor Explicitly Declared to avoid CTE.
	}
	public String getchasisNo() //Getter Method (Readable)
	{
		return chasisNo;
	}
	public void setchasisNo(String chasisNo) //Setter Method (Writable)
	{
		this.chasisNo=chasisNo;
	}
	
	String type;
	Bikes(int maxSpeed,String vno,String modelName,int seats,String type)
	{
		super(maxSpeed,vno,modelName,seats);//super calling statement 
		this.type=type;
	}
	void details() //Details Method
	{
	System.out.println("Model Name:"+modelName);
	System.out.println("Vehicle Registration Number:"+vno);
	System.out.println("Max Speed: "+maxSpeed+"Kmph");
	System.out.println("No of Seats:"+seats);
	System.out.println("Type Geared or Gearless:"+type);
	}
	
}
class BiCycle extends TwoWheelers
{
	BiCycle()
	{
		//Default Constructor Explicitly Declared to avoid CTE.
	}
	String type;
	BiCycle(int maxSpeed,String vno,String modelName,int seats,String type)
	{
		super(maxSpeed,vno,modelName,seats);//super calling statement
		this.type=type;
	}
	void details() //Details Method
	{
	System.out.println("Model Name:"+modelName);
	System.out.println("Vehicle Registration Number:"+vno);
	System.out.println("Max Speed is "+maxSpeed+" Kmph");
	System.out.println("No of Seats:"+seats);
	System.out.println("Type Electric or Manual:"+type);
	}
}
class Petrol extends Bikes //Petrol Extending Bike Class 
{
	Petrol()
	{
		//Default Constructor Explicitly Declared to avoid CTE.
	}
	String fuelType="Petrol";
	Petrol(int maxSpeed,String vno,String modelName,int seats,String type)
	{
		super(maxSpeed,vno,modelName,seats,type);
		
	}
}
class Electric extends Bikes //Electric Extends Bikes
{
	Electric()
	{
		//Default Constructor Explicitly Declared to avoid CTE.
	}
	String fuelType="Electric";
	Electric(int maxSpeed,String vno,String modelName,int seats,String type)
	{
		super(maxSpeed,vno,modelName,seats,type);//Super Calling Statement
		
	}
}
class ThreeWheelers extends Vehicles
{
	ThreeWheelers()
	{
		//Default Constructor Explicitly Declared to avoid CTE.
	}
	int seats;
	ThreeWheelers(int maxSpeed,String vno,String modelName,int seats)
	{
		super(maxSpeed,vno,modelName);//super calling the variables inside super most class
		this.seats=seats;
	}
}
class Rikshaw extends ThreeWheelers
{
	private String chasisNo="NA";// Data Hiding Achieved
	public String getchasisNo() //Getter Method (Readable)
	{
		return chasisNo;
	}
	public void setchasisNo(String chasisNo) //Setter Method (Writable)
	{
		this.chasisNo=chasisNo;
	}
	Rikshaw()
	{
		//Default Constructor Explicitly Declared to avoid CTE.
	}
	String type;
	String fuelType="CNG";
	Rikshaw(int maxSpeed,String vno,String modelName,int seats,String type)
	{
		super(maxSpeed,vno,modelName,seats);//super calling statement
		this.type=type;
	}
	void details() //Details Method
	{
	System.out.println("Model Name:"+modelName);
	System.out.println("Vehicle Registration Number:"+vno);
	System.out.println("Max Speed: "+maxSpeed+" Kmph");
	System.out.println("No of Seats:"+seats);
	System.out.println("Type Geared or Automatic:"+type);
	}
}
class FourWheelers extends Vehicles
{
	FourWheelers()
	{
		//Default Constructor Explicitly Declared to avoid CTE.
	}
	int seats;
	FourWheelers(int maxSpeed,String vno,String modelName,int seats)
	{
		super(maxSpeed,vno,modelName);//super calling the variables inside super most class
		this.seats=seats;
	}
	
}
class Cars extends FourWheelers //Bike Class is Extending TwoWheelers Super class
{
	private String chasisNo="NA";// Data Hiding Achieved
	Cars()
	{
		//Default Constructor Explicitly Declared to avoid CTE.
	}
	public String getchasisNo() //Getter Method (Readable)
	{
		return chasisNo;
	}
	public void setchasisNo(String chasisNo) //Setter Method (Writable)
	{
		this.chasisNo=chasisNo;
	}
	
	String fType;
	Cars(int maxSpeed,String vno,String modelName,int seats,String fType)
	{
		super(maxSpeed,vno,modelName,seats);//super calling statement 
		this.fType=fType;
	}
	void details() //Details Method
	{
	System.out.println("Model Name:"+modelName);
	System.out.println("Vehicle Registration Number:"+vno);
	System.out.println("Max Speed: "+maxSpeed+"Kmph");
	System.out.println("No of Seats:"+seats);
	System.out.println("Type Geared or Gearless:"+fType);
	}
	
}
class PetrolCar extends Cars //Petrol Extending Cars Class 
{
	PetrolCar()
	{
		//Default Constructor Explicitly Declared to avoid CTE.
	}
	String fuelType="Petrol";
	String transmission="Automatic";
	double mileage;
	int engineP;
	PetrolCar(int maxSpeed,String vno,String modelName,int seats,String type,int engineP,double mileage)
	{
		super(maxSpeed,vno,modelName,seats,type);
		this.mileage=mileage;
		this.engineP=engineP;
	}
	void sDetails() //Method to print specific details
	{
		System.out.println("Fuel Type:"+fuelType);
		System.out.println("Transmission:"+transmission);
		System.out.println("Mileage:"+mileage+"Kmpl");
		System.out.println("Engine Power:"+engineP+"cc");
	}
	
}
class DieselCar extends Cars //DieselCar Extending Cars Class 
{
	DieselCar()
	{
		//Default Constructor Explicitly Declared to avoid CTE.
	}
	String fuelType="Diesel";
	String transmission="Manual";
	double mileage;
	int engineP;
	DieselCar(int maxSpeed,String vno,String modelName,int seats,String type,int engineP,double mileage)
	{
		super(maxSpeed,vno,modelName,seats,type);
		this.mileage=mileage;
		this.engineP=engineP;
		
	}
	void sDetails() 
	{
		System.out.println("Fuel Type:"+fuelType);
		System.out.println("Transmission:"+transmission);
		System.out.println("Mileage:"+mileage+"Kmpl");
		System.out.println("Engine Power:"+engineP+"cc");
	}
}
class ElectricCar extends Cars //ElectricCar Extending Cars Class 
{
	ElectricCar()
	{
		//Default Constructor Explicitly Declared to avoid CTE.
	}
	String bType="Lithium Polymer";
	String transmission="Automatic";
	int engineP;
	boolean selfDriving;
	int maxRange;
	ElectricCar(int maxSpeed,String vno,String modelName,int seats,String type,int engineP,int maxRange,boolean selfDriving)
	{
		super(maxSpeed,vno,modelName,seats,type);
		this.maxRange=maxRange;
		this.engineP=engineP;
		this.selfDriving=selfDriving;
		
	}
	void sDetails()// Specific Details Method
	{
		System.out.println("Battery Type:"+bType);
		System.out.println("Max Range:"+maxRange+"Km");
		System.out.println("Engine Power:"+engineP+"cc");
		if(selfDriving==true)
		{
			System.out.println(modelName+" supports Autonomous/Self Driving Mode");
		}
		else 
		{
			System.out.println(modelName+" is not a Autonomous/Self Driving Car");
			
		}
		
	}
	
}
class HeavyVehicles extends Vehicles
{
	HeavyVehicles()
	{
		//Default Constructor Explicitly Declared to avoid CTE.
	}
	int seats;
	HeavyVehicles(int maxSpeed,String vno,String modelName)
	{
		super(maxSpeed,vno,modelName);//declared for Truck object having no seats parameter
	}
		
	
	HeavyVehicles(int maxSpeed,String vno,String modelName,int seats)
	{
		super(maxSpeed,vno,modelName);
		this.seats=seats;
	}
}
class Bus extends HeavyVehicles
{
	private String chasisNo="NA";// Data Hiding Achieved
	Bus()
	{
		//Default Constructor Explicitly Declared to avoid CTE.
	}
	public String getchasisNo() //Getter Method (Readable)
	{
		return chasisNo;
	}
	public void setchasisNo(String chasisNo) //Setter Method (Writable)
	{
		this.chasisNo=chasisNo;
	}
	String deck;
	Bus(int maxSpeed,String vno,String modelName,int seats,String deck)
	{
		super(maxSpeed,vno,modelName,seats);//super calling statement
		this.deck=deck;
	}
	void details() //Details Method
	{
	System.out.println("Model Name:"+modelName);
	System.out.println("Vehicle Registration Number:"+vno);
	System.out.println("Max Speed: "+maxSpeed+" Kmph");
	System.out.println("No of Seats:"+seats);
	System.out.println("Deck Double or Single:"+deck);
	}
}
class Truck extends HeavyVehicles
{
	private String chasisNo="NA";// Data Hiding Achieved
	Truck()
	{
		//Default Constructor Explicitly Declared to avoid CTE.
	}
	public String getchasisNo() //Getter Method (Readable)
	{
		return chasisNo;
	}
	public void setchasisNo(String chasisNo) //Setter Method (Writable)
	{
		this.chasisNo=chasisNo;
	}
	int engineP;
	int noTyre;
	int maxLoad;
	Truck(int maxSpeed,String vno,String modelName,int engineP,int noTyre,int maxLoad)
	{
		super(maxSpeed,vno,modelName);//super calling statement calling 3-arg super constructor
		this.maxLoad=maxLoad;
		this.noTyre=noTyre;
		this.engineP=engineP;
		
	}
	void details() //Details Method
	{
	System.out.println("Model Name:"+modelName);
	System.out.println("Vehicle Registration Number:"+vno);
	System.out.println("Max Speed: "+maxSpeed+" Kmph");
	System.out.println("Number of Tyres:"+noTyre);
	System.out.println("Engine Power:"+engineP+"HP");
	System.out.println("Max Loading Capacity: "+maxLoad+" Kg");
	}
}


