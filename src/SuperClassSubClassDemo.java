public class SuperClassSubClassDemo {

    public static void main(String[] args) {
        //Creating the objects
        Superclass mySuperClassObject = new Superclass();
        Subclass mySubClassObject = new Subclass();

//Kalder metoderne
        mySuperClassObject.getMessage();
        mySubClassObject.getMessage();

        mySuperClassObject.setMessage("This is a SUPERCLASS");
        mySubClassObject.setMessage("This is a SUBCLASS");


    }
}
