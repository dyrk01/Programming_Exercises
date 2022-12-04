package java_challenge;

public class sleepIn {
	public static void main(String args[]) {
		
	}
	// Version 1
	public boolean sleepIn(boolean weekday, boolean vacation) {
		if(!weekday|| vacation) 
		{
		return true;
		}
		return false;
	}
	
//	//Version 2
//	public boolean sleepIn(boolean weekday, boolean vacation) {
//	return !weekday|| vacation;
//	}
}
