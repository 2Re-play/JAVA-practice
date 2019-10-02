package class02.homework;

public class TV {

    String brand;
    int createDate;
    int inch;

    public TV(String brand, int createDate, int inch) {
        this.brand = brand;
        this.createDate = createDate;
        this.inch = inch;
    }

    public void show(){
        System.out.println(brand+"에서 만든 "+ createDate +"년형 " + inch+"인치 TV");
    }

    public static void main (String[] args){
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}
