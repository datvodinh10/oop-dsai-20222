package hust.soict.dsai.test.disc;

//wrapper class

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

class WrapperDigitalVideoDisc{
    DigitalVideoDisc c;
    WrapperDigitalVideoDisc(DigitalVideoDisc c){this.c = c;};
}
public class TestingPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        WrapperDigitalVideoDisc c1 = new WrapperDigitalVideoDisc(jungleDVD);
        WrapperDigitalVideoDisc c2 = new WrapperDigitalVideoDisc(cinderellaDVD);
        swap(c1 , c2);

        System.out.println("jungle dvd title: " + c1.c.getTitle());
        System.out.println("cinderella dvd title: " + c2.c.getTitle());
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());

    }
    public static DigitalVideoDisc get(DigitalVideoDisc x){
        return x;
    }

    public static void swap(WrapperDigitalVideoDisc o1,WrapperDigitalVideoDisc o2){
         DigitalVideoDisc c = o1.c;
         o1.c = o2.c;
         o2.c = c;
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        // String oldTitle = dvd.getTitle();
        dvd. setTitle(title);
        // dvd = new DigitalVideoDisc(oldTitle);
    }
}   
