package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

class CS1181SetLab02 extends CS1181Set{
    private int size_in_bytes;

    public CS1181SetLab02(int... x){
        super(x);
        if(duplicateCheck(this)){
            this.clear();
            try {
                throw new DuplicateException();
            } catch (DuplicateException e) {
                e.printStackTrace();
            }
        }
        this.size_in_bytes = this.size()*Integer.BYTES;


    }
    public CS1181SetLab02(CS1181SetLab02 temp){
        this.addAll(temp);
    }
    public void saveToFile(String fn){
        RandomAccessFile file =null;
        try{
             file = new RandomAccessFile(fn, "rw");
             file.seek(0);

             for(int i:this){
                 file.writeInt(i);
             }
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }catch(IOException e){
            System.out.println("IO Error");
        }catch(Exception e){
            System.out.println("Something bad");
            e.printStackTrace();
        }finally {
            try{
                file.close();

            }catch (Exception e){
                System.out.println("file did not close");
            }
        }

    }
    public void loadFromFile(String fn){
        //int i =0;
        RandomAccessFile file =null;

        try{
            file = new RandomAccessFile(fn, "rw");
            file.seek(0);

            for(int i =0;i<this.size();i++){
                System.out.printf("%d\t",file.readInt());
            }
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }catch(IOException e){
            System.out.println("IO Error");
        }catch(Exception e){
            System.out.println("Something bad");
            e.printStackTrace();
        }finally {
            try{
                file.close();

            }catch (Exception e){
                System.out.println("file did not close");
            }
        }

    }
    private boolean duplicateCheck(CS1181SetLab02 temp) {
        CS1181SetLab02 temp2 = new CS1181SetLab02(temp);
        boolean test = false;
        int i = 0;
        try{
            i = temp2.get(0);
            temp2.remove(0);
        }catch(Exception e){
            return false;
        }
        if(!temp2.contains(i)){
            test = duplicateCheck(temp2);
        }else{
            return true;
        }
        return test;
    }
}
