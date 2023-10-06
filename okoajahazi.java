package shalekami;
import java.util.Scanner;
public class okoajahazi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
int option=0;
int s1=2;
int s2=2;
int s3=2;
int s4=2;
int s5=2;
int s6=2;
int s7=2;
int s8=2;
do{

System.out.println("0:Sh20(30min,3hrs)");
System.out.println("1:Sh50 (50SMS,24hrs");
System.out.println("2:Okoa Easy Sh3s0(30Mins,7days)");
System.out.println("3:Okoa 100");
System.out.println("4:Okoa 50");
System.out.println("5;Okoa 20");
System.out.println("6:Okoa 10");
System.out.println("7:Okoa 5");
System.out.println("Select an Option:");
option=input.nextInt();
if (option>12||option<0) {
	System.out.println("invalid choice.");	
}
else {
switch(option) {
case 0:
	
    System.out.println("Existing unpaid Okoa:0");
	System.out.println("New Okoa request:20");
	System.out.println("TOTAL DEBT will be:20");
	System.out.println("1:Accept");
	System.out.println("2:Decline");
	System.out.println("0:Back"); 
	System.out.println("Select option:");
	s1=input.nextInt();
	if(s1==0) {
s1=0;
		continue;
			}
	
	else if(s1==2) { 
		System.out.println("Your request has been cancelled");
		break;
	}
	else if (s1==1) {
		System.out.println("You have succesfully subscibed to Okoa 20");
		break;
	}
	else {
		System.out.println("invalid choice");
		break;
	}
	
case 1:
	 System.out.println("Existing unpaid Okoa:0");
		System.out.println("New Okoa request:50");
		System.out.println("TOTAL DEBT will be:50");
		System.out.println("1:Accept");
		System.out.println("2:Decline");
		System.out.println("0:Back"); 
		System.out.println("Select option:");
		s2=input.nextInt();
	   
		if (s2==1) {
			System.out.println("You have succesfully subscibed to Okoa 50");
			break;
		}
		else if(s2==2) { 
			System.out.println("Your request has been cancelled");
			break;
		}
		else if(s2==0) {
			continue;
		}
		else {
			System.out.println("invalid choice");
			break;
		}

		
case 2:
	 System.out.println("Existing unpaid Okoa:0");
		System.out.println("New Okoa request:500");
		System.out.println("TOTAL DEBT will be:500");
		System.out.println("1:Accept");
		System.out.println("2:Decline");
		System.out.println("0:Back"); 
		System.out.println("Select option:");
		s3=input.nextInt();
		if (s3==1) {
			System.out.println("You have succesfully subscibed to Okoa 500");
			break;
		}
		else if(s3==2) { 
			System.out.println("Your request has been cancelled");
			break;
		}

      else if(s3==0) {
	         
	         continue;
        }
        else {
        	System.out.println("invalid choice");
	         break;
        }

case 3:
System.out.println("unpaid Okoa:0");
System.out.println("New Okoa:100");
System.out.println("TOTAL okoa due will be:100");
System.out.println("1:Accept");
System.out.println("2:Or GET EXTRA(CONVERT to 170 bob kredo for call and SMS valid midnight");
System.out.println("0:Back"); 
System.out.println("Select option:");
s4=input.nextInt();
if (s4==1) {
	System.out.println("You have succesfully subscibed to Okoa 100");
	break;
}
else if(s4==2) { 
	System.out.println("You have subscribed to 170 bob kredo for call and SMS valid midnight");
	break;
}

else if(s4==0) {
    
     continue;
}
else {
	System.out.println("invalid choice");
     break;
}
case 4:
	System.out.println("unpaid Okoa:0");
	System.out.println("New Okoa:50");
	System.out.println("TOTAL okoa due will be:50");
	System.out.println("1:Accept");
	System.out.println("2:Or GET EXTRA(CONVERT to 150 bob kredo for call and SMS valid midnight");
	System.out.println("0:Back"); 
	System.out.println("Select option:");
	s5=input.nextInt();
	if (s5==1) {
		System.out.println("You have succesfully subscibed to Okoa 50");
		break;
	}
	else if(s5==2) { 
		System.out.println("Your have subscibed to 150 bob kredo for call and SMS valid midnight");
		break;
	}

	else if(s5==0) {
	     
	     continue;
	}
	else {
		System.out.println("invalid choice");
	     break;
	}
case 5:
	System.out.println("unpaid Okoa:0");
	System.out.println("New Okoa:20");
	System.out.println("TOTAL okoa due will be:20");
	System.out.println("1:Accept");
	System.out.println("2:Or GET EXTRA(CONVERT to 50 bob kredo for call and SMS valid midnight");
	System.out.println("0:Back"); 
	System.out.println("Select option:");
	s6=input.nextInt();
	if (s6==1) {
		System.out.println("You have succesfully subscibed to Okoa 20");
		break;
	}
	else if(s6==2) { 
		System.out.println("Your have subscibed to 50 bob kredo for call and SMS valid midnight");
		break;
	}

	else if(s6==0) {
	     
	     continue;
	}
	else {
		System.out.println("invalid choice");
	     break;
	}
	
case 6:
	System.out.println("unpaid Okoa:0");
	System.out.println("New Okoa:10");
	System.out.println("TOTAL okoa due will be:10");
	System.out.println("1:Accept");
	System.out.println("2:Or GET EXTRA(CONVERT to 17 bob kredo for call and SMS valid midnight");
	System.out.println("0:Back"); 
	System.out.println("Select option:");
	s7=input.nextInt();
	if (s7==1) {
		System.out.println("You have succesfully subscibed to Okoa 10");
		break;
	}
	else if(s7==2) { 
		System.out.println("Your have subscibed to 17 bob kredo for call and SMS valid midnight");
		break;
	}

	else if(s7==0) {
	     
	     continue;
	}
	else {
		System.out.println("invalid choice");
	     break;
	}
	
case 7:
	System.out.println("Exusting unpaid Okoa:0");
	System.out.println("New Okoa request:5");
	System.out.println("TOTAL DEBT will be:5");
	System.out.println("1:Accept");
	System.out.println("2:Or GET EXTRA(CONVERT to 170 bob kredo for call and SMS valid midnight");
	System.out.println("0:Back"); 
	System.out.println("Select option:");
	s8=input.nextInt();
	if (s8==1) {
		System.out.println("You have succesfully subscibed to Okoa 100");
		break;
	}
	else if(s8==2) { 
		System.out.println("Your have subscibed to 170 bob kredo for call and SMS valid midnight");
		break;
	}

	else if(s8==0) {
	     
	     continue;
	}
	else {
		System.out.println("invalid choice");
	     break;
	}

	
	
	
}
}
 }while (s1==0||s2==0||s3==0||s4==0||s5==0||s6==0||s7==0||s8==0);
	}
}