package local.mydherin.users.infrastructure.user.beans;

import local.mydherin.users.domain.rol.services.IsShort;
import local.mydherin.users.domain.user.services.FilterByShortRolName;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("UserDependencyInjection")
public class DependencyInjection {

    @Bean
    public FilterByShortRolName filterByShortRolName(final IsShort isRolShort) {
        return new FilterByShortRolName(isRolShort);
    }
}
