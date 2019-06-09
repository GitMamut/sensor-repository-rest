package mintfrost.cloud.repository.sensor.indoor1.humidity;

import mintfrost.cloud.repository.sensor.common.AbstractCustomRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Date;
import java.util.List;

public class IndoorHumidityRepositoryImpl extends AbstractCustomRepository implements IndoorHumidityRepositoryCustom {

    @Override
    public List<IndoorHumidity> findAfterDate(Date fromDate, Integer limit) {
        return getMongoTemplate().find(getQuery(fromDate, limit), IndoorHumidity.class);
    }
}
