package co.com.sofka.usecase.persona;

import co.com.sofka.model.persona.Persona;
import co.com.sofka.model.persona.gateways.PersonaService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class PersonaUseCase {

    private final PersonaService serviceGateway;

    public Mono<Persona> getPersona(String id){
        return serviceGateway.getPersona(id);
    }

    public Mono<Persona> savePersona(Persona persona){
        return serviceGateway.savePersona(persona);
    }
}
