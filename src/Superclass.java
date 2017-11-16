public class Superclass {
//Laver constructoren SuperClass
    public Superclass() {
        super();

    }
//Opretter beskeden
    String objectmessage = "This is the original superclass message";
//Opretter metoden getmessage
    public void getMessage(){

//Udskriver beskeden
        System.out.println("This is the SUPERCLASS message: "+ objectmessage);
    }
//Opretter metoden setmessage
    public void setMessage(String newMessage){
objectmessage = newMessage;
    }
}
