import java.io.*;

public class FileLogger
{
    // CURRENT_DATE_TIME :: LOG_TYPE :: METHOD_NAME :: DESCRIPTION
    // %d :: %s :: %s :: %s :: %s \n
    static String FormatString = "%d :: %s :: %s :: %s \n";
    static PrintStream ps = null;

    static
    {
        try {
            ps = new PrintStream(new File("/Volumes/KINGSTON/FileLoggerApplication/data/LoggerInfo.ser"));
            System.setOut(ps);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void log(long dateTime, String LogType, String METHOD_NAME, String DESCRIPTION)
    {
        System.out.printf(FormatString, dateTime,LogType, METHOD_NAME, DESCRIPTION);
    }
}
