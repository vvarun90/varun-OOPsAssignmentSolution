
public class Main {

	public static void main(String[] args) {
		SuperDepartment superDepartment = new SuperDepartment();
		AdminDepartment adminDepartment = new AdminDepartment();
		TechDepartemnt techDepartemnt = new TechDepartemnt();
		HRDepartment hrDepartment = new HRDepartment();

		System.out.println(adminDepartment.DepartmentName());
		System.out.println(adminDepartment.TodaysWork());
		System.out.println(adminDepartment.WorkDeadline());
		System.out.println(adminDepartment.Holiday());
		System.out.println("\n");
		System.out.println(hrDepartment.DepartmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.TodaysWork());
		System.out.println(hrDepartment.WorkDeadline());
		System.out.println(hrDepartment.Holiday());
		System.out.println("\n");
		System.out.println(techDepartemnt.DepartmentName());
		System.out.println(techDepartemnt.TodaysWork());
		System.out.println(techDepartemnt.WorkDeadline());
		System.out.println(techDepartemnt.TechStackInformation());
		System.out.println(techDepartemnt.Holiday());

	}

}
