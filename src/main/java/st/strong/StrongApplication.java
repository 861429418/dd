package st.strong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("st.strong.mapper")
@SpringBootApplication
public class StrongApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrongApplication.class, args);
    }

}
