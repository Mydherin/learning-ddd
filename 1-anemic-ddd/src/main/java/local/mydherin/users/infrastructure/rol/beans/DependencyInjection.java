package local.mydherin.users.infrastructure.rol.beans;

import local.mydherin.users.domain.rol.services.IsShort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjection {

    @Bean
    public IsShort isShort() {
        return new IsShort();
    }
}
