public class mainc {
    public static void main(String[] args)
    {
    Person p = new Person("Liam","Gill","Glen Abhainn","20th april",800,'m');
    System.out.println(p);

    System.out.println();

    Lecturer l = new Lecturer("Josh","Johnson","Street St, north Streetington", "75th of march",99949939,'M' , "X301");
    System.out.println(l);

    System.out.println();

    Student s = new Student("Caolan","Barron","Glen Abhainn","4th August",9999999,'M',"Software Design");
    System.out.println(s);

    System.out.println();

    Student s2 = new Student("Caolan","Barron","Glen Abhainn","20th april",232,'M',"Software Design",'A');
    System.out.println(s2);

    System.out.println();

    Lecturer l2 = new Lecturer("Josh","Johnoson","52 wow","10th",7543,'H',"34","Life");
    System.out.println(l2);
    }

}
