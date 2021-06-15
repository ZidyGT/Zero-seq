package sequence;

import java.util.List;

public  class Checker {

    public static boolean isZeroSeq(List<Integer> seq){
        for (int i = 0; i < seq.size(); i++) {
            int sum = 0;
            for (int j = i; j < seq.size(); j++){
                sum += seq.get(j);
                if (sum == 0){
                    return true;
                }
            }
        }
        return false;
    }
}
