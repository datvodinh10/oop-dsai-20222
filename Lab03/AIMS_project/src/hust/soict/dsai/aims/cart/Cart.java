package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;
    
    public DigitalVideoDisc[] getItemsOrdered() {
        return itemsOrdered;
    }
    public int getQtyOrdered() {
        return qtyOrdered;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (this.qtyOrdered == MAX_NUMBERS_ORDERED){
            System.out.println("Sorry, your cart is full");
        }
        else{
            int i;
            for (i=0;i<MAX_NUMBERS_ORDERED;i++){
                if (this.itemsOrdered[i] == null){
                    this.itemsOrdered[i] = disc;
                    this.qtyOrdered += 1;
                    // System.out.println("1 item is added to your cart !");
                    break;
                }
            }
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        if (dvdList.length + this.getQtyOrdered() > MAX_NUMBERS_ORDERED){
            System.out.println("Sorry , your cart does not have enough space ");
            return;
        }
        for (DigitalVideoDisc i: dvdList){
            addDigitalVideoDisc(i);
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        if (this.getQtyOrdered() + 2> MAX_NUMBERS_ORDERED){
            System.out.println("Sorry , your cart does not have enough space");
            return;
        } 
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if (this.qtyOrdered == 0){
            System.out.println("Your cart is empty");;
        }
        else{
            int i;
            for (i=0;i<MAX_NUMBERS_ORDERED;i++){
                if (this.itemsOrdered[i].equals(disc)){
                    this.itemsOrdered[i] = null;
                    this.qtyOrdered -= 1;
                    break;
                }
            }
        }
    }
    public float totalCost(){
        float res = 0;
        int i;
        for (i=0;i<this.itemsOrdered.length;i++){

            if (this.itemsOrdered[i] != null){
                res += this.itemsOrdered[i].getCost();
            }
        }
        return res;
    }
    public boolean checkremove(){
        int oldqty = this.qtyOrdered;
        DigitalVideoDisc disc1 = new DigitalVideoDisc(20);
        this.addDigitalVideoDisc(disc1);
        int newqty = this.qtyOrdered;
        return (newqty - oldqty == 1);
    }
    public void print(){
        float totalCost = 0;
        for (DigitalVideoDisc disc : this.itemsOrdered){
            if(disc == null){continue;}
            System.out.println(disc.toString());
            totalCost += disc.getCost();
        }
        System.out.printf("The total cost is : %f\n",totalCost);
    }
    public void searchDVD_id(int id){
        boolean flag = false;
        DigitalVideoDisc found = null;
        for (DigitalVideoDisc disc : this.itemsOrdered){
            if(disc == null){continue;}
            if (disc.getId()==id){
                flag = true;
                found = disc;
                break;
            }
        }
        if (flag){
            System.out.println(found.toString());
        }
        else{
            System.out.println("sorry, none of disks have the id you want to search");
        }
    }
    public void searchDVD_title(String title){
        boolean flag = false;
        DigitalVideoDisc found = null;
        for (DigitalVideoDisc disc : this.itemsOrdered){
            if(disc == null){continue;}
            if (disc.isMatch(title)){
                flag = true;
                found = disc;
                break;
            }
        }
        if (flag){
            System.out.println(found.toString());
        }
        else{
            System.out.println("sorry, none of disks have the title you want to search");
        }
    }
    public static void main(String[] args){
        DigitalVideoDisc item1 = new DigitalVideoDisc(35);
        DigitalVideoDisc item2 = new DigitalVideoDisc(40);
        Cart cart = new Cart();
        DigitalVideoDisc[] dvdList = new DigitalVideoDisc[]{item1,item2};
        cart.addDigitalVideoDisc(dvdList);
        System.out.println(cart.getQtyOrdered());
        System.out.println(item2.getId());

    }

}
