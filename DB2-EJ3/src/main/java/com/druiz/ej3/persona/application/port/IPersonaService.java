package com.druiz.ej3.persona.application.port;

import com.druiz.ej3.persona.infrastructure.dto.input.PersonaInputDto;
import com.druiz.ej3.persona.infrastructure.dto.output.PersonaOutputDto;

import java.util.List;

public interface IPersonaService {
    //Crear una persona
    PersonaOutputDto addPersona(PersonaInputDto personaInputDTO) throws Exception;

    //Obtener una persona x su id
    PersonaOutputDto getPersonaId(String id, String outputType) throws Exception;

    //Obtener una persona por su nombre
    List<PersonaOutputDto> getPersonaName(String name, String outputType);

    List<PersonaOutputDto> getPersonas(String outputType);

    PersonaOutputDto updatePersona(String id, PersonaInputDto pInputDto) throws Exception;

    void deletePersona(String id) throws Exception;
}
