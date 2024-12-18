package classes;


@SuppressWarnings({"InitializerMayBeStatic", "UnnecessaryReturnStatement"})
public abstract  class users {
    private  int user_id;
    private String user_name;
    private  String user_password;
    private final String user_email;
    private int  date_of_birth;
    private String  place_of_birth;
        public users(int user_id, String user_name, String user_password,String user_email,int date_of_birth,String place_of_birth) {
            this.user_id = user_id;
            this.user_name = user_name;
            this.user_password = user_password;
            this.user_email=user_email;
            this.date_of_birth=date_of_birth;
            this.place_of_birth=place_of_birth;
        }

//getters methods
    public int getUser_id() {
        return user_id;
    }

    public String getUser_password() {
        return user_password;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_email() {
        return user_email;
    }
    public int get_birth_date(){
         return date_of_birth;
         }
   public String get_birth_place(){
         return place_of_birth;
         }
     //setters methods
    public void  setUser_id(int user_id) {

        this.user_id = user_id;

    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public void setUser_email(String user_email) {

    }
    public void setdate_of_birt(int birth_date){
        this.date_of_birth=birth_date;
    }
    
    public void set_place_of_birth(String birth_place){
        this.place_of_birth=birth_place;
    }

    public static void vote(){


   }
}
