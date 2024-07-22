import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args) {
        LocalDateTime myobj = LocalDateTime.now();
        DateTimeFormatter fobj = DateTimeFormatter.ofPattern("dd-mm-yy hh:mm:ss");
        
        String formattedDate = myobj.format(fobj);
        System.out.println("Before formatting the date is " +myobj);
        System.out.println("After formatting,, the formatted date is " +formattedDate);
    }
}