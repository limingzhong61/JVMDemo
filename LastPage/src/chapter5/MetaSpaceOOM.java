package chapter5;

import com.sun.xml.internal.ws.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

/**
 * java.lang.outOfMemoryError: Metaspace 异常演示
 * -Xms60m -Xmx60m -XX:MetaspaceSize=10m -XX:MaxMetaspaceSize=10m -XX:SurvivorRatio=8 -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintGCDateStamps -XX:+PrintHeapAtGC -Xloggc:D:/Users/Lenovo/Desktop/MetaSpaceOOM.log
 */
public class MetaSpaceOOM extends ClassLoader {
    public static void main(String[] args) {
        int j = 0;
        try {
            MetaSpaceOOM test = new MetaSpaceOOM();
            for (int i = 0; i < 10000; i++) {
                //创建CLasswriter对象，用于生成类的二进制字节码
                ClassWriter classWriter = new ClassWriter(0);
                //指明版本号，修饰符，类名，包名，父类，接口
                classWriter.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC,"Class" + i,
                        null,"java/lang/Object",null);
                //返回byte[]
                byte[] code = classWriter.toByteArray();
                //类的加载
                test.defineClass("Class" + i, code, 0,code.length);//CLass对象
                j++;
            }
        } finally {
            System.out.println(j);
        }
    }
}