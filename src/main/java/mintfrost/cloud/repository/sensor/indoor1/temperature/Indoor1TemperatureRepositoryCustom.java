package mintfrost.cloud.repository.sensor.indoor1.temperature;

import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface Indoor1TemperatureRepositoryCustom {
    List<Indoor1Temperature> findAfterDate(@Param("date") Date fromDate, Integer limit);
}
