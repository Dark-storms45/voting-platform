package classes;
import java.util.HashMap;
public class candidates {
 private  int  candidate_id;
 private String candidate_name;
 private String party;
private   HashMap<String, Object>boigraphy=new HashMap<>();
 private int count=0;


    public candidates(int candidate_id,String cantidate_name,String party,int count){
        this.candidate_id=candidate_id;
        this.candidate_name=cantidate_name;
        this.party=party;
        this.count=count;
    }
     // getters methods


    public int getCandidate_id() {
        return candidate_id;
    }

    public String getCandidate_name() {
        return candidate_name;
    }
    public String getparty(){
        return party;
    }

    public int getCount(){
        return count;
    }
    // setters methods
    public void setCandidate_id(String candidate_name){
        this.candidate_name=candidate_name;
    }

    public void setCandidate_id(int candidate_id) {
        this.candidate_id = candidate_id;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public void setCount(int count) {

    }
}