package extraClasses;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalSource;

public class LidarSensor {

// Offset for cm


private Counter counter;

// Creates a new LidarSensor object, takes in the DIO port the sensor is connected to and configures pulses
public LidarSensor (DigitalSource source) {
	counter = new Counter(source);
    counter.setMaxPeriod(1.0);
    counter.setSemiPeriodMode(true);
    counter.reset();
}

// Returns the distance of the sensor in inches
public double getDistance() {
	double cm;
	double inches;
	cm = (counter.getPeriod() * 1000000.0 / 10.0);
	inches = (cm / 2.54);
	return inches;
	}
}

