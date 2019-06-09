package mintfrost.cloud.repository.sensor.indoor2.pressure;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

@NoRepositoryBean
public interface IndoorPressureRepositoryCustom {
    List<IndoorPressure> findAfterDate(@Param("date") Date fromDate, Integer limit);
}
