package mintfrost.cloud.repository.sensor.indoor2.temperature;

import mintfrost.cloud.repository.sensor.common.AbstractCustomRepository;

import java.util.Date;
import java.util.List;

public class Indoor2TemperatureRepositoryImpl extends AbstractCustomRepository implements Indoor2TemperatureRepositoryCustom {

    @Override
    public List<Indoor2Temperature> findAfterDate(Date fromDate, Integer limit) {
        return getMongoTemplate().find(getQuery(fromDate, limit), Indoor2Temperature.class);
    }
}
