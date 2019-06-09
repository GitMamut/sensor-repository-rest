package mintfrost.cloud.repository.sensor.indoor1.humidity;

import mintfrost.cloud.repository.sensor.common.AbstractCommonDbEntity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "indoor1-humidity")
public class IndoorHumidity extends AbstractCommonDbEntity {
    public IndoorHumidity(Date date, String value) {
        super(date, value);
    }
}
