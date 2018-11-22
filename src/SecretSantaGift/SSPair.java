package SecretSantaGift;

import java.util.List;

/**
 * Created by amirullah on 11/21/18.
 */
public class SSPair {
    void ssMatch(List<String> ssParticipants, List<String> ssGiftReceiver){
        for(int i = 0; i < ssParticipants.size(); i++){
            for (int j = ssGiftReceiver.size()-1; j >= 0; j--){
                ssGiftReceiver.get(j);
            }
            int target = ssGiftReceiver.size()-1;
            if(ssParticipants.get(i).equals(ssGiftReceiver.get(target))){
                target--;
            }
            System.out.println(ssParticipants.get(i) +"=>" +ssGiftReceiver.get(target));
            ssGiftReceiver.remove(ssGiftReceiver.get(target));
        }
    }
}
