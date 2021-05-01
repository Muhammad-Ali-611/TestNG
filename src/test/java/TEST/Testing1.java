package TEST;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.junit.Test;
import org.junit.runners.Parameterized;

public class Testing1 {

    @Test

    public void add(int c, int d)
    {

        int sum = c + d;
        System.out.println("Sum of two numbers: " +sum);
    }


    }


