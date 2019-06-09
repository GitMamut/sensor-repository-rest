package mintfrost.cloud.repository.sensor.outdoor.temperature;

import mintfrost.cloud.repository.sensor.common.AbstractCustomRepository;

import java.util.Date;
import java.util.List;

public class OutdoorTemperatureRepositoryImpl extends AbstractCustomRepository implements OutdoorTemperatureRepositoryCustom {

    @Override
    public List<OutdoorTemperature> findAfterDate(Date fromDate, Integer limit) {
        return getMongoTemplate().find(getQuery(fromDate, limit), OutdoorTemperature.class);
    }
}
