package Interface;

interface Vehicle{
	void start();
	void stop();
	String getfuelType();
}
class Car implements Vehicle{
	@Override
	public void start()
	{
		System.out.println("Car Started");	
	}
	@Override
	public void stop()
	{
		System.out.println("Car Stopped");
	}
	@Override
	public String getfuelType()
	{
		return "Petrol";
	}	
}
class ElectricBike implements Vehicle
{
	@Override
	public void start()
	{
		System.out.println("Bike  Started");	
	}
	@Override
	public void stop()
	{
		System.out.println("Bike Stopped");
	}
	@Override
	public String getfuelType()
	{
		return "Electricity";
	}	
	
}
public class Transport_Management {

	public static void main(String[] args) {
		Vehicle[] vehicles =new Vehicle[2];
		vehicles[0] = new Car();
		vehicles[1] = new ElectricBike();
		for(Vehicle v:vehicles)
		{
			v.start();
			System.out.println("Fuel Type:"+v.getfuelType());
			v.stop();
			System.out.println();
			
		}
		
		
	}

}
