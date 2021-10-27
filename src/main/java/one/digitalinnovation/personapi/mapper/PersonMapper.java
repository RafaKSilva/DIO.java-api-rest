package one.digitalinnovation.personapi.mapper;

import one.digitalinnovation.personapi.dto.requests.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mappings({
            @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    })
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
