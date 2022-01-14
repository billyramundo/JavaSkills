import java.util.Arrays;
import java.util.Comparator;

public class ClientsList {
    public String[] dataCleanup(String[] names) {
        Person[] personArr = new Person[names.length];
        for(int i=0; i<names.length;i++){
            if(names[i].indexOf(",")<0){
                personArr[i] = new Person(names[i]);
            }
            else{
                int comma = names[i].indexOf(",");
                personArr[i] = new Person(names[i].substring(comma + 2) + " "+ names[i].substring(0,comma));
            }
        }
        Comparator<Person> comp = Comparator.comparing(Person::getLast).thenComparing(Person::getFirst);
        Arrays.sort(personArr, comp);
        String[] ret = new String[personArr.length];
        for(int i = 0; i<personArr.length; i++){
            ret[i] = personArr[i].getName();
        }
        return ret;
    }
    public class Person{
        String first;
        String last;
        public Person(String name){
            first = name.split(" ")[0];
            last = name.split(" ")[1];
        }
        public String getFirst(){
            return first;
        }
        public String getLast(){
            return last;
        }
        public String getName(){
            return first + " " + last;
        }
    }
}
