package CompositeDesignPattern.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String directoryName;
    List <FileSystem> fileSystemList;

    public Directory(String name){
        this.directoryName=name;
        fileSystemList=  new ArrayList<>();
    }

    public void add(FileSystem fileSystemObj){
        fileSystemList.add(fileSystemObj);

    }
    public void remove(FileSystem fileSystemObj){
        fileSystemList.remove(fileSystemObj);
    }


    public void ls(){
        System.out.println("Directory Name "+ directoryName);

        for(FileSystem fileSystemObj: fileSystemList ){
            fileSystemObj.ls();
        }

    }
    
}
