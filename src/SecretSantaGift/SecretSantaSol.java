package SecretSantaGift;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by amirullah on 11/21/18.
 */
public class SecretSantaSol {
    public static void main(String[] args){
        List<String> participants = new ArrayList<>(Arrays.asList("abc","def","ghi"));
        List<String> giftReceiver = (ArrayList<String>) ((ArrayList<String>)participants).clone();

        final SSPair match = new SSPair();
        match.ssMatch(participants, giftReceiver);
    }
}
