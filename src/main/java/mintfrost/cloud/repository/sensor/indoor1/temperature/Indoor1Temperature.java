package mintfrost.cloud.repository.sensor.indoor1.temperature;

import mintfrost.cloud.repository.sensor.common.AbstractCommonDbEntity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "indoor1-temperature")
public class Indoor1Temperature extends AbstractCommonDbEntity {
    public Indoor1Temperature(Date date, String value) {
        super(date, value);
    }
}
