package za.ac.cput.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by RichardM on 2017/02/07.
 */


@Configuration
@Import( {MongoConfig.class} )
public class Config {

}
