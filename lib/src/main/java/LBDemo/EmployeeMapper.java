package LBDemo;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper
public interface EmployeeMapper {

    @Mapping(target="fullName",source = "emp",qualifiedByName = "fullNameByFirstAndLastName")	
	EmployeeDto toDto(Employee emp);
    
    @InheritInverseConfiguration(name = "toDto")
	Employee fromDto(EmployeeDto dto);
    
    @Named("fullNameByFirstAndLastName")
	static String fullNameByFirstAndLastName(Employee emp) {
    	
    	return emp.getFirstName()+' '+ emp.getLastName();
    }
}
