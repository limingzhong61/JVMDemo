//package com.atguigu.java.chapter11;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.nio.ByteBuffer;
//import java.nio.channels.FileChannel;
//
//public class BufferTest1 {
//    private static final String TO = "F:\\test\\异 界BD中字. mp4";
//    private static final int _100Mb = 1024 * 1024 * 100;
//
//    public static void main(String[] args) {
//        long
//                sum = 0;
//        String src = "F:\\test\\异 界BD中字.mp4";
//        for (int i = 0; i < 3; i++) {
//            String dest = "F:\\test\\异 界BD中字_" + i + ".mp4 ";
////
//            sum += io(src, dest);//58461
//            //sum += directBuffer(src, dest);//51403
//        }
//        System.out.println("总花费的时间为: " + sum);
//    }
//
//    private static long directBuffer(String src, String dest) {
//        long start = System.currentTimeMillis();
//        FileChannel inChannel = null;
//        FileChannel outChannel = null;
//        try {
//            inChannel = new FileInputStream(src).getChannel();
//            outChannel = new FileOutputStream(dest).getChannel();
//            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(_100Mb);
//            while (inChannel.read(byteBuffer) != -1) {
//                byteBuffer.flip();//修改为读数据模式
//                outChannel.write(byteBuffer);
//                byteBuffer.clear();//清空
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (inChannel != null) {
//                try {
//                    inChannel.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                if (outChannel != null) {
//                    try {
//                        outChannel.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//                long end = System.currentTimeMillis();
//                return end - start;
//
//            }
//        }
//        return -1;
//    }
//
//    private static long io(String src, String dest) {
//        long start = System.currentTimeMillis();
//        FileInputStream fis = null;
//        FileOutputStream fos = null;
//        try {
//            fis = new FileInputStream(src);
//            fos = new FileOutputStream(dest);
//            byte[] buffer = new byte[_100Mb];
//            while (true) {
//                int len = fis.read(buffer);
//                if (len == -1) {
//                    break;
//                    fos.write(buffer, 0, len);
//                }
//            }
//        } catch (Exception e) {
//
//        }
//    }
//}
//
