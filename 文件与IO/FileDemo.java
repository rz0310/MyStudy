package 文件与IO;

import java.io.File;

public class FileDemo {
    public static void fileDemo(){
        File file = new File("E:\\IntelliJ IDEA\\Test\\test");
//        创建文件夹f.mkdir();
//        可以创建多个文件夹f.mkdirs();
        System.out.println(file.mkdirs());
        File[] files = file.listFiles();

//        for (File f: files) {
//            System.out.println("文件名："+f.getName());
//            System.out.println("路径："+f.getPath());
//            System.out.println("父路径："+f.getParent());
//            System.out.println("长度:"+f.length());
//            System.out.println("是否可读："+f.canRead());
//            System.out.println("是否可写:"+f.canWrite());
//            System.out.println("是否可执行："+f.canExecute());
//            System.out.println("是否存在："+f.exists());
//            System.out.println("是否隐藏："+f.isHidden());
//            if(f.getName().endsWith(".txt")){
//                System.out.println(f.getName());
//            }
//        }

    }

    public static void main(String[] args) {
        fileDemo();
    }
}
