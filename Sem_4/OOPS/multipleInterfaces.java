//Acheiving multiple inheritance
package OOPS;
class phone{
    void makeCall(){
        System.out.println("Call using phone");
    }
    void sendSms(){
        System.out.println("Send sms using phone");
    }
}

interface ImusicPlayer{
    void play();
    void pause();
    void endTrack();
}

interface Icamera{
    void clickPhoto();
    void viewPhotos();
    void deletePhoto();
}
class Smartphone extends phone implements ImusicPlayer, Icamera{
    public void play(){
        System.out.println("Play music using smartphone");
    }
    public void pause(){
        System.out.println("Pause music using smartphone");
    }
    public void endTrack(){
        System.out.println("End track using smartphone");
    }

    public void clickPhoto(){
        System.out.println("Click photo using smartphone");
    }
    public void viewPhotos(){
        System.out.println("View photos using smartphone");
    }
    public void deletePhoto(){
        System.out.println("Delete photo using smartphone");
    }
    
}

public class multipleInterfaces {
    public static void main(String args[]){
        Smartphone s = new Smartphone();
        s.makeCall();
        s.sendSms();
        s.clickPhoto();
        s.play();
    }
}