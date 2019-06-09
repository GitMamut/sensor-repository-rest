package mintfrost.cloud.repository.sensor.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.util.StringUtils;

import java.util.Date;

public abstract class AbstractCustomRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    protected Query getQuery(Date fromDate, Integer limit) {
        Query query = new Query();
        query.with(new Sort(Sort.Direction.DESC, "fromDate"));

        if (limit != null) {
            query.limit(limit);
        }

        if (!StringUtils.isEmpty(fromDate)) {
            query.addCriteria(new Criteria().where("date").lte(fromDate));
        }
        return query;
    }


    protected MongoTemplate getMongoTemplate() {
        return mongoTemplate;
    }
}
