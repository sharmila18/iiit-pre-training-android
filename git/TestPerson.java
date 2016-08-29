class TestPerson{
	public static void main(String args[]){
		Person p = new Person("per","hyderabad");
		Student stu=new Student("stu","vizag","FDP",3,5000);
		Staff stf=new Staff("Mr.a","tirupathi","abc_school",10000);
		
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		p.setAddress("delhi");
		System.out.println("modified address "+p.getAddress());
		System.out.println(p.toString());
		
		
		System.out.println("\nstudent details");
		System.out.println(stu.getName());
		System.out.println(stu.getAddress());
		stu.setAddress("delhi");
		System.out.println("modified address "+stu.getAddress());
		System.out.println(stu.getProgram());
		stu.setProgram("FDP1");
		System.out.println("modified program "+stu.getProgram());
		System.out.println(stu.getYear());
		stu.setYear(4);
		System.out.println("modified year "+stu.getYear());
		System.out.println(stu.getFee());
		stu.setFee(6000);
		System.out.println("modified fee "+stu.getFee());
		System.out.println(stu.toString());
		
		System.out.println("\nstaff details");
		System.out.println(stf.getName());
		System.out.println(stf.getAddress());
		stf.setAddress("delhi");
		System.out.println("modified address "+stf.getAddress());
		System.out.println(stf.getSchool());
		stf.setSchool("xyz_school");
		System.out.println("modified school "+stf.getSchool());
		System.out.println(stf.getPay());
		stf.setPay(20000);
		System.out.println("modified pay "+stf.getPay());
		System.out.println(stf.toString());
	}

}
		
		
		
