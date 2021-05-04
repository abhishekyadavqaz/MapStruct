package LBDemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public  class Employee {
	
	private int id;
	private String firstName;
	private String lastName;

}
