package classes;


public class candidates extends users {
 private String party;
 private int vote_count=0;
public  String nationality;
public  String  short_notes;

    public candidates(int user_id, String user_name, String user_password,String user_email,
    int date_of_birth,String place_of_birth,String party,int vote_count,String nationality,String short_notes){
      super(user_id, user_name, user_password, user_email,date_of_birth,place_of_birth);
   
        this.party=party;
        this.vote_count=vote_count;
        this.nationality=nationality;
        this.short_notes=short_notes;
    }
     // getters methods

    
    public String getparty(){
        return party;
    }

    public int getvote_vote_count(){
        return vote_count;
    }
    public String get_nationality(){
        return nationality;
    }
    public String get_shortnotes(){
        return short_notes;
    }
    // setters methods


    public void setParty(String party) {
        this.party = party;
    }

    public void setvote_count(int vote_vote_count) {
        this.vote_count=vote_vote_count;
    }
    public void set_nationality(String nationality){
        this.nationality=nationality;
    }
    public void set_short_notes(String short_notes){
        this.short_notes=short_notes;
    }
}
