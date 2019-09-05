//only right r left turn
import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public String moveRobot(int input1,int input2,String input3,String input4){
		// Read only region end
		// Write code here...
		 int xb = input1;
		int yb = input2;
		String init[] = input3.split("-");
		String movement = input4.replaceAll(" ","");
		movement = movement.toUpperCase();
		int xc = Integer.parseInt(init[0]);
		int yc = Integer.parseInt(init[1]);
		String dc = init[2];
		dc=dc.toUpperCase();
		int pi = xc;
		int pj = yc;
		for(int i=0;i<movement.length();i++)
		{
			String val = String.valueOf(movement.charAt(i));
			if(val.equalsIgnoreCase("R") && dc.equalsIgnoreCase("N"))
				dc="E";
			else if(val.equalsIgnoreCase("L") && dc.equalsIgnoreCase("N"))
				dc="W";
			else if(val.equalsIgnoreCase("R") && dc.equalsIgnoreCase("E"))
				dc="S";
			else if(val.equalsIgnoreCase("L") && dc.equalsIgnoreCase("E"))
				dc="N";
			else if(val.equalsIgnoreCase("R") && dc.equalsIgnoreCase("S"))
				dc="W";
			else if(val.equalsIgnoreCase("L") && dc.equalsIgnoreCase("S"))
				dc="E";
			else if(val.equalsIgnoreCase("R") && dc.equalsIgnoreCase("W"))
				dc="N";
			else if(val.equalsIgnoreCase("L") && dc.equalsIgnoreCase("W"))
				dc="S";
			 pi = xc;
	         pj = yc;
			if(val.equalsIgnoreCase("M") && dc.equalsIgnoreCase("N"))
				yc++;
			else if(val.equalsIgnoreCase("M") && dc.equalsIgnoreCase("S"))
				yc--;
			else if(val.equalsIgnoreCase("M") && dc.equalsIgnoreCase("E"))
				xc++;
			else if(val.equalsIgnoreCase("M") && dc.equalsIgnoreCase("W"))
				xc--;
		if(xc>xb || yc>yb||xc<0 ||yc<0 )
		{
			xc = pi;
			yc=pj;
			
		    String result = xc+"-"+yc+"-"+dc+"-ER";	
			return result;
		}
		}
		String result = xc+"-"+yc+"-"+dc;
		return result;
	}
}
