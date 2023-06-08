package step7_01.objectArray;

/*

	# 제네릭(Generic)
	
	- 클래스 내부에서 사용하는 데이터의 타입(Type)을 
	  클래스의 인스턴스를 생성할 때 결정하는 것을 의미한다.
	  
	- 객체의 타입을 컴파일 시점에 체크하기 때문에 
	  타입 안정성을 높이고 형 변환의 번거로움을 줄일 수 있다.

*/


class Employee{}
class Manager{}
class Supervisor{}

class GenericEx<T>{
	
	Object[] arr = new Object[3];
	int idx = 0;
	
	void add(T data) {
		arr[idx] = data;
		idx++;
	}
	
	T get(int idx) {
		return (T) arr[idx];
		
	}
	
}



public class ObjectArrayEx12 {

	public static void main(String[] args) {
		
		GenericEx<Employee> EmployeeList = new GenericEx<Employee>();
		GenericEx<Manager> ManagerList = new GenericEx<Manager>();
		GenericEx<Supervisor> SupervisorList = new GenericEx<Supervisor>();

		EmployeeList.add(new Employee());
		//ManagerList.add(new Manager());
		//SupervisorList.add(new Supervisor());
		
		ManagerList.add(new Manager());
		//ManagerList.add(new Manager());
		//SupervisorList.add(new Supervisor());
		
		SupervisorList.add(new Supervisor());
		//ManagerList.add(new Manager());
		//SupervisorList.add(new Supervisor());
		
		System.out.println(EmployeeList.get(0));
		System.out.println(ManagerList.get(0));
		System.out.println(SupervisorList.get(0));
		
		
	}

}
