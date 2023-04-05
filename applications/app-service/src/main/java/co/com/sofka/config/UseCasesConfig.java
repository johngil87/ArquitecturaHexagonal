package co.com.sofka.config;

import co.com.sofka.model.persona.gateways.PersonaService;
import co.com.sofka.usecase.persona.PersonaUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
public class UseCasesConfig {

        @Bean
        public PersonaUseCase getPersonaService (PersonaService service){
                return new PersonaUseCase(service);
        }
}
