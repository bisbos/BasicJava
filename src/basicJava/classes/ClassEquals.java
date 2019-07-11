package basicJava.classes;

public class ClassEquals {

    public static void main(String[] args){

        TestEqual testEqual1 = new TestEqual();
        TestEqual testEqual2 = new TestEqual();

        if (testEqual1.equals(testEqual2)){
            System.out.println("Both Objects are equal");
        }else{
            System.out.println("Both Objects are not equal");
        }

    }
}

class TestEqual {

    @Override
    public boolean equals(Object obj) {
        if (TestEqual.class.isInstance(obj)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
