package mintfrost.cloud.repository.sensor.indoor2.temperature;

import mintfrost.cloud.repository.sensor.common.AbstractCommonDbEntity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "indoor2-temperature")
public class Indoor2Temperature extends AbstractCommonDbEntity {
    public Indoor2Temperature(Date date, String value) {
        super(date, value);
    }
}
