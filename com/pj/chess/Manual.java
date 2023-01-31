package com.pj.chess;

import javax.persistence.criteria.CriteriaBuilder;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

import static com.pj.chess.LogWindow.addlog;


public class Manual {
    public static ArrayList manuallist = new ArrayList();
    public static void importmanualevent(String filename) {
        String manualinfo = readmanual(filename);
        if(manualinfo.length()%6==0){
            Integer i = 0;
            Integer j = 0;
            while(j<manualinfo.length()/6){
                manuallist.add(manualinfo.substring(i,i+6));
                i = i + 6;
                j++;
            }
            addlog("��������: "+ manualinfo);

        }else{
            JOptionPane.showMessageDialog(null,"���������ݷ�������\n��Ӧ��ɾ��������\n������ȥ�޸�","��ʾ",JOptionPane.PLAIN_MESSAGE);
        }
    }
    public static String manuallistover= "";
    public static void recordmanual(String chessname, String startxy, String endxy){
        manuallistover = manuallistover+chessname+startxy+endxy;
    }


    public static void exportmanualevent(String filename) {
        String sb=manuallistover;
        java.io.BufferedOutputStream buff=null;
        ObjectOutputStream out =null;
        try {
            buff=new  java.io.BufferedOutputStream(new java.io.FileOutputStream(filename + ".manual"));
            buff.write(sb.toString().getBytes());
            buff.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try {
                if(buff!=null){
                    buff.close();
                }
                if(out!=null){
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void laststepevent() {

    }

    public static void nextstepevent() {

    }

    public static String readmanual(String filename) {
        String manualtext = null;
        FileInputStream fileInput = null;
        try {
            File chessFile = new File(filename + ".manual");
            fileInput = new java.io.FileInputStream(chessFile);
            BufferedReader bufferedReader = new BufferedReader(
                    new java.io.InputStreamReader(fileInput));
            while (bufferedReader.ready()) {
                manualtext = bufferedReader.readLine();
            }
            if (manualtext != null) {
                if (JOptionPane.showConfirmDialog(null, "�������ף�ȷ�ϵ���?\n�ò�����������ɾ����ǰ�Ծּ�¼", "����",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    ObjectInputStream objInput = null;
                } else {
                    chessFile.deleteOnExit();
                    JOptionPane.showMessageDialog(null,"�Ҳ���������","��ʾ",JOptionPane.PLAIN_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"�Ҳ���������","��ʾ",JOptionPane.PLAIN_MESSAGE);
        } finally {
            if (fileInput != null) {
                try {
                    fileInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(manualtext);
        return manualtext;
    }
}
/*
public static  final String[] chessName=new String[]{
            "   ",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
            "�ڽ�","�ڳ�","�ڳ�","����","����","����","����","����","����","��ʿ","��ʿ","����","����","����","����","����",
            "�콫","�쳵","�쳵","����","����","����","����","����","����","��ʿ","��ʿ","����","����","����","����","����",
    };
    public static  final String[] chessIcon=new String[]{
            null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
            "BK","BR","BR","BN","BN","BC","BC","BB","BB","BA","BA","BP","BP","BP","BP","BP",
            "RK","RR","RR","RN","RN","RC","RC","RB","RB","RA","RA","RP","RP","RP","RP","RP",
    };
 */
