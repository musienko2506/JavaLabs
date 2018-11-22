package com.kpi.laba2;

public class Model {
private String text;

public Model(){
    this.text = new String("Лабораторна робота номер два!\nСтудента групи ІС-62?\nМусієнка Віталія.");
}
public Model(String text){
    this.text = text;
}
    public void editText(){
        String[] parts =  text.split("\n");
        String editedText = new String();
        for (String s: parts)
        {
            s = s.replaceAll("\\s+$", "");
            boolean isDot = (s.endsWith(".")||s.endsWith("!")||s.endsWith("?"));
            int lastSpace= s.lastIndexOf(" ");
            if(isDot){
                if(lastSpace>0) {
                    String lastWord = new String(s.substring(lastSpace, s.length() - 1));
                    StringBuilder lastWordSB = new StringBuilder(lastWord.subSequence(1, lastWord.length()));
                       StringBuilder s1 = new StringBuilder(s.subSequence(0, s.length()));
                    lastWordSB.reverse();
                    s1.insert(lastSpace+1,lastWordSB+" ");
                    s1.delete(s1.lastIndexOf(" "),s1.length()-1);
                    s=s1.toString();
                }
                else {
                    StringBuilder lastWordSB = new StringBuilder(s.subSequence(0,s.length()-1));
                    StringBuilder s1 = new StringBuilder(s.subSequence(0, s.length()));
                    lastWordSB.reverse();
                    s1.insert(lastSpace+1,lastWordSB+" ");
                    s1.delete(s1.lastIndexOf(" "),s1.length()-1);
                    s=s1.toString();
                }
            }
            else if(lastSpace > 0){
                String lastWord = new String(s.substring(lastSpace,s.length()));
                StringBuilder lastWordSB = new StringBuilder(lastWord.subSequence(0, lastWord.length()));
                lastWordSB.reverse();
                String firstPartOfRaw;
                firstPartOfRaw=s.substring(0,lastSpace);
                s=firstPartOfRaw+" "+lastWordSB.toString();
            }
            else {
                StringBuilder lastWordS = new StringBuilder(s.subSequence(0,s.length()));
                lastWordS.reverse();
                s=lastWordS.toString();
            }
            editedText+=s+"\n";
            this.text = editedText;
        }

    }
    public void setText(String text){
    this.text = text;
    }
    public String getText(){
    return text;
    }

    }


