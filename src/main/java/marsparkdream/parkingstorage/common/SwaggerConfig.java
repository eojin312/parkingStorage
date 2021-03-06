package marsparkdream.parkingstorage.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private String version;
    private String title;

    @Bean
    public Docket api() {
        version = "V1";
        title = "API " + version;
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .groupName(version)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/**"))
                .build()
                .apiInfo(apiInfo(title, version))
                ;
    }

    private ApiInfo apiInfo(String title, String version) {
        return new ApiInfo(
                title,
                "API Swagger",
                version,
                "V1",
                new Contact("Contact Me", "localhost:8080", "eojin312@naver.com"),
                "Lisence",
                "localhost:8080",
                new ArrayList<>()
        );
    }
}
