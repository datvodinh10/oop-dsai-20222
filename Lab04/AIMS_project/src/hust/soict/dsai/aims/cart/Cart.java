package hust.soict.dsai.aims.cart;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>(MAX_NUMBERS_ORDERED);
    
    
    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
    public void emptyCart(){
        this.itemsOrdered = new ArrayList<Media>();
    }
    public boolean addMedia(Media media){
        if (itemsOrdered.size() > 20){
            return false;
        }
        else{
            for (Media name:itemsOrdered){
                if (media.equals(name)){
                    return false;
                }
            }
            itemsOrdered.add(media);
            return true;
        }
    }
    public boolean removeMedia(Media media){
        for (Media name : itemsOrdered){
            if (media.equals(name)){
                itemsOrdered.remove(media);
                return true;
            }
        }
        return false;
    }
    public Media searchByTitle(String title){
        for (Media media: itemsOrdered){
            if (media.getTitle().equals(title)){
                return media;
            }
        }
        return null;
    }
    public void sortTitle(){
        itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
    }
    public void sortCost(){
        itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
    }
    public float totalCost(){
        float res = 0;
        for (Media name : itemsOrdered){
            float cost = name.getCost();
            res += cost;
        }
        return res;
    }
    // public boolean checkremove(){
    //     int oldqty = this.qtyOrdered;
    //     DigitalVideoDisc disc1 = new DigitalVideoDisc(20);
    //     this.addDigitalVideoDisc(disc1);
    //     int newqty = this.qtyOrdered;
    //     return (newqty - oldqty == 1);
    // }
    // public void print(){
    //     float totalCost = 0;
    //     for (DigitalVideoDisc disc : this.itemsOrdered){
    //         if(disc == null){continue;}
    //         System.out.println(disc.toString());
    //         totalCost += disc.getCost();
    //     }
    //     System.out.printf("The total cost is : %f\n",totalCost);
    // }
    // public void searchDVD_id(int id){
    //     boolean flag = false;
    //     DigitalVideoDisc found = null;
    //     for (DigitalVideoDisc disc : this.itemsOrdered){
    //         if(disc == null){continue;}
    //         if (disc.getId()==id){
    //             flag = true;
    //             found = disc;
    //             break;
    //         }
    //     }
    //     if (flag){
    //         System.out.println(found.toString());
    //     }
    //     else{
    //         System.out.println("sorry, none of disks have the id you want to search");
    //     }
    // }
    // public void searchDVD_title(String title){
    //     boolean flag = false;
    //     DigitalVideoDisc found = null;
    //     for (DigitalVideoDisc disc : this.itemsOrdered){
    //         if(disc == null){continue;}
    //         if (disc.isMatch(title)){
    //             flag = true;
    //             found = disc;
    //             break;
    //         }
    //     }
    //     if (flag){
    //         System.out.println(found.toString());
    //     }
    //     else{
    //         System.out.println("sorry, none of disks have the title you want to search");
    //     }
    // }
    public static void main(String[] args){
        // DigitalVideoDisc item1 = new DigitalVideoDisc(35);
        // DigitalVideoDisc item2 = new DigitalVideoDisc(40);
        // Cart cart = new Cart();
        // DigitalVideoDisc[] dvdList = new DigitalVideoDisc[]{item1,item2};
        // cart.addDigitalVideoDisc(dvdList);
        // System.out.println(cart.getQtyOrdered());
        // System.out.println(item2.getId());

    }

    public void displayCart() {
        System.out.println("------Items in Cart-------");

        for (Media media: itemsOrdered){
            System.out.println(media.toString());
        }
    } 

}
