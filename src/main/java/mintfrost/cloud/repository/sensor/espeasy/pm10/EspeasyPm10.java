package mintfrost.cloud.repository.sensor.espeasy.pm10;

import mintfrost.cloud.repository.sensor.common.AbstractCommonDbEntity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "espeasy-PM10")
public class EspeasyPm10 extends AbstractCommonDbEntity {
    public EspeasyPm10(Date date, String value) {
        super(date, value);
    }
}
