package za.ac.cput;

import com.mongodb.Mongo;
import cz.jirutka.spring.embedmongo.EmbeddedMongoBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

/**
 * Created by RichardM on 2017/02/07.
 */

@SpringBootApplication
public class SpringRestAppTests  {

    @Bean(destroyMethod="close")
    public Mongo mongo() throws IOException {
        return new EmbeddedMongoBuilder()
                .version("2.6.4")
                .bindIp("127.0.0.1")
                .port(12345)
                .build();

    }

    public static void main(String[] args) {
        SpringApplication.run(SpringRestAppTests.class, args);
    }
}
