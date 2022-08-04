package com.druiz.bs9.profesor.infrastucture.dto.output;

import com.druiz.bs9.profesor.domain.ProfesorEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfesorOutputDtoSimple {

    String id_persona;
    int id_profesor;
    String comments;
    String branch;

    public ProfesorOutputDtoSimple(ProfesorEntity profesor) {
    }
}
