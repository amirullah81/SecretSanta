package SecretSantaGift;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by amirullah on 11/21/18.
 */
public class SSPair {
    void ssMatch(List<String> ssParticipants) throws IOException{

        List<String> ssGiftReceiver = (ArrayList<String>) ((ArrayList<String>)ssParticipants).clone();
        FileReaderWriter fileReaderWriter = new FileReaderWriter();
        String path = System.getProperty("user.dir")+"/Resources/Count.txt";
        int years = fileReaderWriter.fileReader(path);

        //Every 3rd year Reset Members Family Members list
        if(years < 3){
            Collections.shuffle(ssParticipants, new Random());
            Collections.shuffle(ssGiftReceiver, new Random());
            System.out.println("Year " + years);
            years++;
        }
        else{
            years = 1;
            System.out.println("It's time to Reset Secret Santa");
        }

        //Pair family Members
        for(int i = 0; i < ssParticipants.size(); i++){
            for (int j = ssGiftReceiver.size()-1; j >= 0; j--){
                ssGiftReceiver.get(j);
            }

            //Check if a person own their Secret Santa, if so Reshuffle the list.
            int target = ssGiftReceiver.size()-1;
            if(ssParticipants.get(i).equals(ssGiftReceiver.get(target))){
                target--;
            }

            System.out.println(ssParticipants.get(i) +"=>" +ssGiftReceiver.get(target));
            ssGiftReceiver.remove(ssGiftReceiver.get(target));
        }

        fileReaderWriter.fileWriter(path, years);
    }
}
