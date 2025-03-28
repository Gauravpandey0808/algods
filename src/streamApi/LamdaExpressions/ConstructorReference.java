package streamApi.LamdaExpressions;

import java.util.Arrays;
import java.util.List;

public class ConstructorReference {

    String mobileNo;

    public ConstructorReference(String mobileNo) {
        this.mobileNo = "+91".concat(mobileNo);
    }

    public String getMobileNo() {
        return this.mobileNo;
    }
}


class mainClass {
    public static void main(String[] args) {
        List<String> numberList = Arrays.asList("6399731563", "225954", "9411333440");
        List<ConstructorReference> mobilePhones = numberList.stream().map(ConstructorReference::new).toList();
        for (ConstructorReference no: mobilePhones) {
            System.out.println(no.getMobileNo());

        }
    }
}
