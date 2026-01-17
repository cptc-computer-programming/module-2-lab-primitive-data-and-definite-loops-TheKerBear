package day2.part02_sensor_readings;

public class SensorReadings {

    public static void main(String[] args) {

        // Scenario: A sensor reports every 5 minutes for 1 hour.
        // Minutes: 0, 5, 10, ..., 60

        // TODO:
        // A sensor reports data every 5 minutes for 1 hour (minutes 0 through 60).
        // Use a for loop with a step size of 5 to iterate over the minute marks.
        // At each minute, compute a value equal to (minute / 5) * 2,
        // then print the minute and the computed value.

        // loop over minutes 0 - 60 updating by 5 each time
        for (int minute = 0; minute <= 60; minute += 5 ) {
        
            // compute a value = (minute / 5) * 2
            double value = (minute / 5) * 2;

            // print the minute and that value using string concatonation 
            System.out.println("minute " + minute + " value " + value);
        }

    }
    
}
