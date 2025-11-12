import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalField;

public class Main
{

    public static void main(String[] args)
    {
        FileLogger fileLogger = new FileLogger();
        fileLogger.log(System.currentTimeMillis(),"INFO","MAIN", "Main() Method Started" );

        fileLogger.log(System.currentTimeMillis(),"INFO","MAIN", "Main() Method Finished" );
    }
}
