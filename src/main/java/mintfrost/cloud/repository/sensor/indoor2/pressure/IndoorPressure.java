package mintfrost.cloud.repository.sensor.indoor2.pressure;

import mintfrost.cloud.repository.sensor.common.AbstractCommonDbEntity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "indoor2-pressure")
public class IndoorPressure extends AbstractCommonDbEntity {
    public IndoorPressure(Date date, String value) {
        super(date, value);
    }
}
