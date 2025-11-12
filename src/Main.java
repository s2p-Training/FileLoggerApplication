import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalField;

public class Main
{

    static FileLogger fileLogger = new FileLogger();

    /// 1. Example For Static Variables
    public static String myStaticVariable = "This is some static data";
    int data = 100000;

    /// 2. Example On Stack In Debugger
    public static void foo1()
    {
        System.err.println("This might cause error");
    }

    public static void foo2()
    {
        foo1();
        System.out.println("Function call foo2");
    }


    public static void foo3()
    {
        foo2();
        System.out.println("Function call foo3");
    }

    /// 3. Example Of Stack In Debugger
    public static Integer method1(Integer x)
    {
        Integer square = x*x;
        System.out.println("Value of x^2 : " + square);
        return square;
    }

    public static Integer method2(Integer y)
    {
        Integer num = y;
        System.out.println("Value of Y : " + num);
        return num;
    }

    public static Integer method3(Integer z)
    {
        Integer cube = z * z * z;
        System.out.println("Value of z^3 : " + cube);
        return cube;
    }

    public static void displaySum(int x1, int y1, int z1)
    {
        Integer sum = method1(10)+ method2(2) + method3(2);
        System.out.println("sum : "+ sum);
        System.out.println(sum.byteValue());
    }


    ///  This Example Will Teach You about continue
    public static void displaySomeNumbers()
    {
        System.out.println("displaySomeNumbers method called");
        for (int i=0; i<Integer.MAX_VALUE; i++)
        {
//            System.out.println("Number : " + i);
        }

        // System.err.println("This might produce some error");
        System.out.println("Not Sure When This Line Will Execute");
        System.out.println("End of displaySomeNumbers method call ends");

    }

    /// This Example Will Teach You About Variable Watcher
    public static void mutateVariable(Boolean isSingle,Boolean isRich, Boolean isLoyal, Boolean isSmart,Boolean doesGym ,Boolean isJavaDeveloper)
    {
         //  Add the variable name to watcher
        int x = 0;

        // Debug every step to see changes in watcher
        if(isSingle == true)
        {
            x = x + 2;
        }
        else
        {
            x = x + 10;
        }

        if(isRich == true)
        {
            x = x + 4;
        }
        else
        {
            x = x + 10;
        }

        if(isLoyal == true)
        {
            x = x + 5;
        }
        else
        {
            x = x + 10;
        }

        if(isSmart == true)
        {
            x = x + 7;
        }
        else
        {
            x = x + 10;
        }

        if(doesGym == true)
        {
            x = x-10;
        }
        else
        {
            x = x+4;
        }

        if(isJavaDeveloper == true)
        {
            x = x + 3000;
        }
        else
        {
            x = x-100;
        }
    }
    public static void main(String[] args)
    {
        fileLogger.log(System.currentTimeMillis(),"INFO","MAIN", "Main() Method Started" );
        //  Start of main method
        System.out.println("This will be printed");
        System.out.println("First Lesson On Debugging");
        mutateVariable(false, true, false, true, true, true);
        displaySomeNumbers();
        displaySum(12,13,14);
        // end of main method

        fileLogger.log(System.currentTimeMillis(),"INFO","MAIN", "Main() Method Finished" );
    }
}
