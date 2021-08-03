package PetHotel;
/*
 * this is model class for pet registration part
 *
 * @author Cahit Çağın Karataş
 * */
public class PetRegModel {
    String name;
    int age;
    String petType;
    String gender;

    public PetRegModel() {

    }

    public boolean checkAge(String pet, int age){
        if(pet.equals("Cat") && age >= 6 && age <= 144){
            return true;
        }
        else if(pet.equals("Dog") && age >= 6 && age <= 144){
            return true;
        }
        else if(pet.equals("Bird") && age >= 6 && age <= 144){
            return true;
        }
        else{
            return false;
        }
    }
}
