class Computer{
    public void playMusic(){
        System.out.println("Music Playing");
    }
    public String getMePen(int cost){
        if(cost >= 10)
            return "Pen";
        else
            return "No Pen";
        
    }
}

public class Demo {

    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String pen = obj.getMePen(5);
        System.out.println(pen);
    }
}