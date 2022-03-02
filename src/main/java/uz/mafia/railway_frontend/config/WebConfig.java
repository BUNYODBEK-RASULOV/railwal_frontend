package uz.mafia.railway_frontend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                        "/images/**",
                        "/assets/css/**",
                        "/assets/fonts/**",
                        "/assets/js/**",
                        "/assets/pages/**",
                        "/assets/partials/**",
                        "/assets/scss/**",
                        "/assets/vendors/**",
                        "/assets/libs/**")
                .addResourceLocations(
                        "classpath:../static/assets/images/",
                        "classpath:../static/assets/fonts/",
                        "classpath:../static/assets/js/",
                        "classpath:../static/assets/pages/",
                        "classpath:../static/assets/vendors/",
                        "classpath:../static/assets/scss/",
                        "classpath:../static/assets/css/");
    }

}
