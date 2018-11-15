package java8.lambda.methodreference;

public class MethodReferenceInstance1 {

    public static void main(String[] args) {

        StringOperation stringOperation = new StringOperation();
        MyStringOp myStringOp = stringOperation::doStringOperation;
        String result = myStringOp.performOp("BISIN");
        System.out.println(result);

        MethodReferenceInstance1 referenceInstance1 = new MethodReferenceInstance1();
        MyStringOp myStringOp1 = referenceInstance1::doStringOperation;
        System.out.println(myStringOp1.performOp("bisin"));
    }

    public String doStringOperation(String value){
        return  value.toUpperCase();
    }

}

class StringOperation {

    public String doStringOperation(String value){
        return  value.toLowerCase();
    }
}

interface MyStringOp {
    String performOp(String value);
}
