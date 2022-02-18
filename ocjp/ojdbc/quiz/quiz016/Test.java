package quiz.quiz016;

class MissingInfoException extends Exception {}
class AgeOutofRangeException extends Exception {}

class Candidate {
    String name;
    int age;
    public Candidate(String name, int age) throws Exception{
        if (name == null) {
            throw new MissingInfoException();
        } else if (age <= 10 || age >= 150) {
            throw new AgeOutofRangeException();
        } else {
            this.name = name;
            this.age = age;
        }
    }
    @Override
    public String toString() {
        return name + " age: " + age;
    }
    
}

public class Test {
    public static void main(String[] args) {
        try{
            Candidate c = new Candidate("James", 20);
            Candidate c1 = new Candidate("Williams", 32);
            System.out.println(c);
            System.out.println(c1);
        } catch(Exception e) {

        }
    }
}
