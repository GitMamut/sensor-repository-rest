package mintfrost.cloud.repository.sensor.indoor2;

import mintfrost.cloud.repository.sensor.indoor2.pressure.IndoorPressure;
import mintfrost.cloud.repository.sensor.indoor2.pressure.IndoorPressureRepository;
import mintfrost.cloud.repository.sensor.indoor2.temperature.Indoor2Temperature;
import mintfrost.cloud.repository.sensor.indoor2.temperature.Indoor2TemperatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

import static mintfrost.cloud.repository.Application.COMMON_CONTROLLER_DEFAULT_LIMIT;
import static mintfrost.cloud.repository.Application.DATE_TIME_FORMAT_PATTERN;

@RestController
public class CommonControllerIndoor2 {
    @Autowired
    private Indoor2TemperatureRepository indoor2TemperatureRepository;
    @Autowired
    private IndoorPressureRepository indoor2PressureRepository;

    @RequestMapping("/indoor2-temperature/findByTime")
    public List<Indoor2Temperature> indoor2Temperature(
            @RequestParam(value = "limit", defaultValue = COMMON_CONTROLLER_DEFAULT_LIMIT) String limit,
            @RequestParam(value = "fromDate", required = false) @DateTimeFormat(pattern = DATE_TIME_FORMAT_PATTERN) Date fromDate
    ) {
        return indoor2TemperatureRepository.findAfterDate(fromDate, Integer.valueOf(limit));
    }

    @RequestMapping("/indoor2-pressure/findByTime")
    public List<IndoorPressure> indoorPressure(
            @RequestParam(value = "limit", defaultValue = COMMON_CONTROLLER_DEFAULT_LIMIT) String limit,
            @RequestParam(value = "fromDate", required = false) @DateTimeFormat(pattern = DATE_TIME_FORMAT_PATTERN) Date fromDate
    ) {
        return indoor2PressureRepository.findAfterDate(fromDate, Integer.valueOf(limit));
    }
}
