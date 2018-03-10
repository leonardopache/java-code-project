package pache.all.samples;
/**
 * 
 */

/**
 * @author lpache
 *
 */
public class ConverterTime12to24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(timeConversion("07:05:45PM"));
	}
	
	static String timeConversion(String s) {
        String[] strHour;
        if(s.endsWith("PM"))
            strHour = s.split("PM");
        else
            strHour = s.split("AM");
        
        String[] hour = strHour[0].split(":");
        if(s.endsWith("PM")){
            int h = Integer.parseInt(hour[0]);
            h += 12;
            return String.format("%d:%s:%s", h,hour[1],hour[2]);
        }else {
            if(Integer.parseInt(hour[0]) == 12)
                hour[0] = "00";
            
            return String.format("%s:%s:%s", hour[0],hour[1],hour[2]); 
        }
        
    }

}
