package SecretSantaGift;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by amirullah on 11/21/18.
 */
public class SecretSantaSol {
    public static void main(String[] args) throws IOException {
        //Family Members
        List<String> participants = new ArrayList<>(Arrays.asList("1 abc","2 def","3 ghi", "4 jkl", "5 mno"));

        //Pair family members
        final SSPair match = new SSPair();
        match.ssMatch(participants);
    }
}
