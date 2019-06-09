package mintfrost.cloud.repository.sensor.outdoor.temperature;

import mintfrost.cloud.repository.sensor.common.AbstractCommonDbEntity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "outdoor-temperature")
public class OutdoorTemperature extends AbstractCommonDbEntity {
    public OutdoorTemperature(Date date, String value) {
        super(date, value);
    }
}
