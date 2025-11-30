import java.math.BigInteger;

public class Task2
    {
        int testPow()
            {
                long a = 4_294_967_295L;
                int b = 1000;
                BigInteger bigInteger = BigInteger.valueOf(a).pow(b);
                return bigInteger.toString().length();
            }
    }
