package cat.itacademyBarcelonactiva.s5t1n2CarreterSergio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
// @EnableSwagger2
public class S5t1n2CarreterSergioApplication {

	public static void main(String[] args) {
		SpringApplication.run(S5t1n2CarreterSergioApplication.class, args);
	}

	/*
	Necesita Maven Project
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2 )
				.groupName("save")
				.select()
				.paths(PathSelectors.ant("/name"))
				.build()
				.apiInfo(getName());
	}

	private ApiInfo getName(){
		return new ApiInfo("Demo Swagger 2", "Return Name", "V1",null, null, null, null, null);
	}
	*/

}
