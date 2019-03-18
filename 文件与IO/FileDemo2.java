package 文件与IO;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) {
        File f = new File("E:\\IntelliJ IDEA\\Test");
        if(!f.exists()){
            f.mkdir();
            System.out.println("文件夹创建成功！");
            File file = new File("E:\\IntelliJ IDEA\\Test\\test.txt");
            if(f.exists()){
                try{
                    file.createNewFile();
                    System.out.println("文件创建成功！");
                }catch (IOException e){
                    e.printStackTrace();
                }
            }else{
                System.out.println("该文件已存在");
            }
        }else{
            System.out.println("该文件夹已存在");
        }
    }
}
