package CompositeDesignPattern.FileSystem;

public class file implements FileSystem{

    String fileName;

    public file(String name){
        this.fileName=name;
        }
    
        public void ls(){
            System.out.println("File name: "+fileName);
        }
}
