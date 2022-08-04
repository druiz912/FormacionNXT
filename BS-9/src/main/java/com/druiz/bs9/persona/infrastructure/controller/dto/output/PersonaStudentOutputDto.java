package com.druiz.bs9.persona.infrastructure.controller.dto.output;

import com.druiz.bs9.student.infrastructure.dto.output.StudentOutputDto;
import com.druiz.bs9.persona.domain.PersonaEntity;
import lombok.Data;

import java.io.Serializable;


@Data
public class PersonaStudentOutputDto extends PersonaOutputDto implements Serializable {
    StudentOutputDto studentOutputDto;
    public PersonaStudentOutputDto(PersonaEntity personaEntity) {
        super(personaEntity);
        if (personaEntity == null) return;
        studentOutputDto = new StudentOutputDto(personaEntity.getStudent());
    }

}
