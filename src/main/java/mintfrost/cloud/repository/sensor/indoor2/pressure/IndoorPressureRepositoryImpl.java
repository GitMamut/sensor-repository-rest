package mintfrost.cloud.repository.sensor.indoor2.pressure;

import mintfrost.cloud.repository.sensor.common.AbstractCustomRepository;

import java.util.Date;
import java.util.List;

public class IndoorPressureRepositoryImpl extends AbstractCustomRepository implements IndoorPressureRepositoryCustom {

    @Override
    public List<IndoorPressure> findAfterDate(Date fromDate, Integer limit) {
        return getMongoTemplate().find(getQuery(fromDate, limit), IndoorPressure.class);
    }
}
