package com.arrays;

public class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max){
        a = new long[max];
        nElems = 0;
    }

    public static void main(String[] args) {
        HighArray arr = new HighArray(100);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();
        int searchKey = 35;
        if(arr.findSearchKey(searchKey)){
            System.out.println("Found: "+ searchKey);
        }else {
            System.out.println("Can't find "+searchKey);
        }
        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();

    }

    public boolean findSearchKey(long searchKey){
        int i;
        for (i = 0; i < nElems; i++) {
            if(searchKey == a[i]){
                break;
            }
        }
        if(i==nElems){
            return false;
        }
        else{
            return true;
        }
    }
    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value){
        int i;
        for (i = 0; i < nElems; i++) {
            if(value == a[i]){
                break;
            }
        }
        if(i == nElems){
            return false;
        }else {
            for (int j = i; j < nElems; j++) {
                a[j] = a[j+1];
            }

            nElems--;
            return true;
        }
    }

    public void display(){
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }

}
