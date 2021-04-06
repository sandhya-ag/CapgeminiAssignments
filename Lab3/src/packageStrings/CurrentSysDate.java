package packageStrings;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//exercise 9

public class CurrentSysDate {
	static void
    findDifference(String start_date,
                   String end_date)
    {
  
       
        SimpleDateFormat sdf
            = new SimpleDateFormat(
                "dd-MM-yyyy HH:mm:ss");
  
        
        try {
  
           
            Date d1 = sdf.parse(start_date);
            Date d2 = sdf.parse(end_date);
  
            
            long difference_In_Time
                = d2.getTime() - d1.getTime();
  
          
            long difference_In_Seconds
                = (difference_In_Time
                   / 1000)
                  % 60;
  
            long difference_In_Minutes
                = (difference_In_Time
                   / (1000 * 60))
                  % 60;
  
            long difference_In_Hours
                = (difference_In_Time
                   / (1000 * 60 * 60))
                  % 24;
  
            long difference_In_Years
                = (difference_In_Time
                   / (1000l * 60 * 60 * 24 * 365));
  
            long difference_In_Days
                = (difference_In_Time
                   / (1000 * 60 * 60 * 24))
                  % 365;
  
          
  
            System.out.print(
                "Difference "
                + "between two dates is: ");
  
            System.out.println(
                difference_In_Years
                + " years, "
                + difference_In_Days
                + " days, "
                + difference_In_Hours
                + " hours, "
                + difference_In_Minutes
                + " minutes, "
                + difference_In_Seconds
                + " seconds");
        }
  
        
        catch (ParseException e) {
            e.printStackTrace();
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String start_date
            = "21-07-2009 02:30:07";
  
      
        String end_date
            = "19-08-2016 08:30:04";
  
        findDifference(start_date, end_date);
	}

}
