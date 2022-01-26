package HW3;

public class KeepHydrated {
    public int Liters(double time)  {

        if ( time < 0 )
            throw new IllegalArgumentException("non-positive number");

        int hour;
        hour = (int) Math.floor(time);
        int result = (int)(hour * 0.5);
        return result;
    }
}
