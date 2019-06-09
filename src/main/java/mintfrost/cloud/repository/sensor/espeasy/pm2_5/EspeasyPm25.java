package mintfrost.cloud.repository.sensor.espeasy.pm2_5;

import mintfrost.cloud.repository.sensor.common.AbstractCommonDbEntity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "espeasy-PM2_5")
public class EspeasyPm25 extends AbstractCommonDbEntity {
    public EspeasyPm25(Date date, String value) {
        super(date, value);
    }
}
