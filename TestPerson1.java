//ASSIGNMENT 1
class Person{
String name;
String address;
public Person(String name, String address){
this.name= name;
this.address=address;
}
public String getAddress(){
return address;
}
public String getName(){
return name;
}
public void setAddress(String address){
this.address=address;
}
public String toString (){
return "Person[name= " +name+"address= " +address+"]";
}
}
class Student extends Person{
String program;
int year;
double fee;
Student(String name,String address,String program, int year, double fee){
super(name,address);
this. program=program;
this.year=year;
this.fee=fee;
}
public String getProgram(){
return program;
}
public void setProgram(String program){
this.program=program;
}
public int getYear(){
return year;
}
public void setYear(int year){
this.year=year;
}
public double getFee(){
return fee;
}
public void setFee(double fee){this.fee=fee;
}
public String toString(){
return
"Student[Person[name="+name+"address="+address+"program="+program+"year="+year+"fee="
+fee+"]";
}
}
class Staff extends Person{
String school;
double pay;
Staff(String name,String address,String school,double pay){
super(name,address);
this.school=school;
this.pay=pay;
}
public String getSchool(){
return school;
}
public void setSchool(String school){
this.school=school;
}
public double getPay(){
return pay;
}
public void setPay(double pay){
this.pay=pay;
}
public String toString(){
return
"Staff[Person[name="+name+"address="+address+"]"+"school="+school+"]"+"pay="+pay+"]";
}
}
class TestPerson1{
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
System.out.println("modified address "+stu.getAddress());System.out.println(stu.getProgram());
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
