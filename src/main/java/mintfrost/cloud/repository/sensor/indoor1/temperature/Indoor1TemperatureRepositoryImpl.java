package mintfrost.cloud.repository.sensor.indoor1.temperature;

import mintfrost.cloud.repository.sensor.common.AbstractCustomRepository;

import java.util.Date;
import java.util.List;

public class Indoor1TemperatureRepositoryImpl extends AbstractCustomRepository implements Indoor1TemperatureRepositoryCustom {

    @Override
    public List<Indoor1Temperature> findAfterDate(Date fromDate, Integer limit) {
        return getMongoTemplate().find(getQuery(fromDate, limit), Indoor1Temperature.class);
    }
}
