package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemInStore = {};
    public int getQty(){
        return this.itemInStore.length;
    }
    public void addDVD(DigitalVideoDisc dvd){
        int n = this.itemInStore.length;
        DigitalVideoDisc newarr[] = new DigitalVideoDisc[n+1];
        for (int i=0;i<n;i++){
            newarr[i] = this.itemInStore[i];
        }
        newarr[n] = dvd;
        this.itemInStore = newarr;
    }
    public boolean checkDVD(DigitalVideoDisc dvd){
        boolean flag = false;
        for (DigitalVideoDisc disc: this.itemInStore){
            if (disc == dvd){
                flag = true;
                break;
            }
        }
        return flag;
        
    }
    public void removeDVD(DigitalVideoDisc dvd){
        if (checkDVD(dvd) ==false)
            System.out.println("Sorry, the dvd is not in the store");
        else{
            int n = this.itemInStore.length;
            DigitalVideoDisc newarr[] = new DigitalVideoDisc[n-1];
            for (int i=0;i<n;i++){
                if (this.itemInStore[i] == dvd)
                    continue;
                else{
                    newarr[i] = this.itemInStore[i];
                }
            }
            this.itemInStore = newarr;
        }
    }
}
