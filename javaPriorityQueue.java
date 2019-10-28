
import java.util.PriorityQueue;
import java.util.Comparator;
/*
 * Create the Student and Priorities classes here.
 */
 class Student {
     int id;
     String name;
     double cgpa;

     Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    } 

        public int getId() {
         return id;
        }
        public String getName() {
         return name;
        }
        public double getCGPA() {
         return cgpa;
        }
    
     

 }

 class Priorities {

    public List<Student> getStudents(List<String> events) {
        
        PriorityQueue<Student> pq = new PriorityQueue(
            Comparator.comparing(Student::getCGPA)
            .reversed()
            .thenComparing(Student::getName)
            .thenComparing(Student::getId)
        );
        
        List <Student> students = new ArrayList <Student>();
        for(String e: events){
            Scanner scan = new Scanner(e);
            String event = scan.next();
            if(event.equals("ENTER")){
                String name = scan.next();
                double cgpa = scan.nextDouble();
                int id = scan.nextInt();

                Student student = new Student(id, name, cgpa);
                pq.add(student);
            } else if(event.equals("SERVED")){
                Student firstServed = pq.poll();
            }
            scan.close();
        }
        
        Student firstServed = pq.poll();
        if(firstServed == null){
            return students;
        } else {
            while(firstServed != null ){
                students.add(firstServed);
                firstServed = pq.poll();
            }
            return students;
        }
    }

 }

