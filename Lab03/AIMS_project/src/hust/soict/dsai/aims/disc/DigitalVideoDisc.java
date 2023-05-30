package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    public String toString(){
        return String.format("%s %s , %s , %s , %d , %f",this.getId(), this.getTitle(),
        this.getCategory(),this.getDirector(),this.getLength(),this.getCost());
    }

    public boolean isMatch(String title){
        return title == this.title;
    }
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs += 1;
        this.id = nbDigitalVideoDiscs;

    }
    
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs += 1;
        this.id = nbDigitalVideoDiscs;

    }
    
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs += 1;
        this.id = nbDigitalVideoDiscs;

    }
    public DigitalVideoDisc(float cost) {
        this.cost = cost;
        nbDigitalVideoDiscs +=1;
        this.id = nbDigitalVideoDiscs;

    }
    public static void main(String[] args){
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("f1");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("f2");
        System.out.println(dvd1.getId());
        System.out.println(dvd2.getId());

    }
}
