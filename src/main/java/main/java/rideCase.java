package main.java;

public class rideCase {
	
	public String ValidateRide(Ride_Logic ride)
	{
		
		if(!ride.source.isEmpty() && !ride.destination.isEmpty())
		{
			
		if(ride.getSource().equals(ride.getDestination()))
		{
			return "Invalid";
		}
		}
		else if(ride.source.isEmpty())
		{
			return "Invalid";
		}
		else if(ride.destination.isEmpty())
		{
			return "Invalid";
		}
		return "Successful";
	}

}
