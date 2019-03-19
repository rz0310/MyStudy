package 文件与IO;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) {
        File file = new File("E:\\IntelliJ IDEA\\Test");
//        判断文件夹是否存在
        if(file.exists()){
//            文件夹存在且文件夹为空
            if(file.list().length == 0){
//                就删除该文件夹
                file.delete();
//                重新创建文件夹
                file.mkdir();
            }else{
//                文件夹存在，但是文件夹不为空
//                遍历该文件夹中的文件删除
                File[] files = file.listFiles();
                for (File f: files) {
                    f.delete();
                }
//                然后再删除该文件夹
                file.delete();
//                重新创建文件夹
                file.mkdir();
            }
        }else{
//            文件夹不存在直接创建
            file.mkdir();
        }
//        在文件夹中创建文件
        File f = new File("E:\\IntelliJ IDEA\\Test\\test.txt");
        try {
            f.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
