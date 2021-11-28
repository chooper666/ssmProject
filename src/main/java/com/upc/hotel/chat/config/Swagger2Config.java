package com.upc.hotel.chat.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger2配置文件
 */
@Configuration
public class Swagger2Config {

    @Value("${swagger2.enable}")
    private boolean swagger2Enable;

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).enable(swagger2Enable).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.szh.wechat.controller")).paths(PathSelectors.any()).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("WeChat Swagger API文档")
				.description("Built by 1434928030@qq.com.")
				.termsOfServiceUrl("").version("1.0").build();
	}
}
