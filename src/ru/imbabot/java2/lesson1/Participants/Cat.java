package ru.imbabot.java2.lesson1.Participants;

public class Cat implements Participant {

    private String type;
    private int maxLength;
    private int maxHeight;
    private boolean isActive;

    public Cat(){
        this.type = "Cat";
        this.maxLength = 500;
        this.maxHeight = 20;
        this.isActive = true;
    }


    @Override
    public boolean run(int length) {
        if (length <= maxLength && isActive == true){
            System.out.println(type + ":" + " run " + length + " " + true);
            return true;
        } else if (length > maxLength && isActive == true) {
            isActive = false;
            System.out.println(type + ":" + " run " + length + " " + false + " " + "leave distance");
        }else if (isActive == false){
            System.out.println(type + ": " + " leave distance");
        }
        return false;
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxHeight && isActive == true){
            System.out.println(type + ":" + " jump " + height + " " + true );
        }else if (height > maxHeight && isActive == true) {
            isActive = false;
            System.out.println(type + ":" + " jump " + height + " " + false + " " + "leave distance");
        }else if (isActive == false){
            System.out.println(type + ": " + " leave distance");
        }
       return false;
    }
}
