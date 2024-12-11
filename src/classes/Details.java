public class Details{
public  int   date_of_birth;
public  String  place_of_birth;
public  String nationality;
public  String  short_notes;


 public Details(int date_of_birth,String place_of_birth,String nationality,String short_notes){
this.date_of_birth=date_of_birth;
this.place_of_birth=place_of_birth;
this.nationality=nationality;
this.short_notes=short_notes;
}
//getters

public int get_birth_date(){
    return date_of_birth;
}

}

