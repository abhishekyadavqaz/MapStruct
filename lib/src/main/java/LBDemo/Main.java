package LBDemo;

public class Main {

	private static EmployeeMapper mapper = new EmployeeMapperImpl();
	
	public static void main(String[] args) {
		
		Employee emp = Employee.builder()
				.id(1)
				.firstName("harry")
				.lastName("wood")
				.build();
		
		EmployeeDto employeeDto = mapper.toDto(emp);
		System.out.println(employeeDto);

	}

}
