package mintfrost.cloud.repository.sensor.indoor2.temperature;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

@NoRepositoryBean
public interface Indoor2TemperatureRepositoryCustom {
    List<Indoor2Temperature> findAfterDate(@Param("date") Date fromDate, Integer limit);
}
