package mintfrost.cloud.repository.sensor.outdoor.temperature;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

@NoRepositoryBean
public interface OutdoorTemperatureRepositoryCustom {
    List<OutdoorTemperature> findAfterDate(@Param("date") Date fromDate, Integer limit);
}
