package com.itdvn.junit.lesson1;

import java.util.Arrays;

public class StringCalculator {

    public static int add(String text){
        int t;
        if(text.equals("")){ //порожній рядок
            t=0;
            return t;
        }
        else{
            String delimiter = "," ;
            if(text.matches("//(.*)\n(.*)")){ //заданий деліметр через//
                int index1 = text.indexOf("/")+1; //знаходження довжини деліметра
                int index2 = text.indexOf("\n")-1;
                int k=index2-index1;
                delimiter = "";
                for (int j = 0; j < k; j++) { //знаходження самого деліметра

                    delimiter += Character.toString(text.charAt(2 + j));
                }
                String te=text.substring(index1+1,index1+2);
                if (delimiter.equals("[]")){ //крок7
                    String mystring1=text.substring(5 ); //тест без деліметра
                    String x=""; //текст з новими деліметрами
                    int len=mystring1.length();
                    int error=0;
                    String nu="";
                    x+=mystring1.substring(0, 1 );
                    for (int ii=0; ii<len-1 ;ii++){
                        try {
                            Integer.parseInt(mystring1.substring(ii+1, ii+2 ));
                            x+=mystring1.substring(ii+1, ii+2 );
                            error=0;

                        }
                        catch (NumberFormatException e) {
                            nu+=mystring1.substring(ii+1, ii+2);
                            error+=1;

                            if (error==1){
                                x+=",";
                            }
                        }
                    }
                    int l_nu=nu.length();
                    String nu_del=nu.substring(0,1);
                    int r=1;
                    for (int f=0; f<l_nu-1 ;f++){
                        if (nu_del.equals(nu.substring(f,f+1))){
                            r+=1;
                        }
                    }
                    if (r==l_nu){
                        delimiter=",";
                        String numList[] = splitNumbers(x, delimiter + "|\n"); //перетворення в масив
                        t=sum(numList);
                        return t;
                    }
                    else{
                        System.out.println("Символи деліметра різні. \nДопускається лише різна довжина деліметра.");
                        return -1;
                    }

                }
                /*krok89+-*/     else if (te.equals("[")){
                    int in1 = text.indexOf("[")+1; //знаходження довжини деліметра
                    int in2 = text.indexOf("]")+1;
                    int kk=in2-in1;
                    String del1 = "";
                    for (int j = 1; j < kk; j++) { //знаходження самого деліметра

                        del1 += Character.toString(text.charAt(2 + j));
                    }
                    text=text.substring(in2);
                    int in1_1 = text.indexOf("[")+1; //знаходження довжини деліметра
                    int in2_1 = text.indexOf("]")+1;

                    int kk_1=in2_1-in1_1;
                    String del1_1 = "";
                    for (int j = 1; j < kk_1; j++) { //знаходження самого деліметра

                        del1_1 += Character.toString(text.charAt(j));
                    }
                    text=text.substring(in2_1+1);
                    String x=""; //текст з новими деліметрами
                    int len2=text.length();
                    int s=0;
                    int error=0;
                    int errror1=1;
                    int s2=0;
                    String nu="";
                    x+=text.substring(0, 1 );
                    for (int ii=0; ii<len2-1 ;ii++){
                        try {
                            Integer.parseInt(text.substring(ii+1, ii+2 ));
                            if (errror1==0){
                                s2=ii;
                            }
                            errror1+=1;
                            x+=text.substring(ii+1, ii+2 );
                            error=0;

                        }
                        catch (NumberFormatException e) {
                            nu+=text.substring(ii+1, ii+2);
                            errror1=0;
                            error+=1;
                            if (error==1){
                                s=ii;
                                x+=",";
                            }
                        }
                    }
                    if (s2-s==del1_1.length()) {
                        if (nu.length() == del1_1.length() + del1.length()) {
                            if (nu.substring(0, del1.length()).equals(del1)) {
                                if ((nu.substring(del1.length())).equals(del1_1)) {
                                    String d3=",";
                                    String numList[] = splitNumbers(x, d3 + "|\n"); //перетворення в масив
                                    t=sum(numList);
                                    return t;

                                }
                                else {
                                    System.out.println("Неправильно розставлені роздільники");
                                    return -1;
                                }
                            } else {
                                System.out.println("Неправильно розставлені роздільники");
                                return  -1;
                            }
                        }
                        else {
                            System.out.println("Неправильно розставлені роздільники");
                            return  -1;
                        }
                    }
                    else {
                        System.out.println("Неправильно розставлені роздільники");
                        return  -1;
                    }
                }
                else{
                    text = text.substring(k+3); //знаходження початку введення чисел
                    String numList[] = splitNumbers(text, delimiter + "|\n"); //перетворення в масив
                    t=sum(numList);
                    return t;
                }
            }
            else if(text.matches("(.*),\n(.*)")){ // ,\n є помилкою
                String a="Неправильно введені дані!";
                System.out.println(a);
                t=-1;
                return t;
            }
            else { //деліметр ,
                String numList[] = splitNumbers(text, delimiter + "|\n"); //перетворення в масив
                t=sum(numList);
                return t;
            }
        }
    }

    private static int toInt(String number){ //перетворення до цілочисельного типу
        return Integer.parseInt(number);
    }

    private static String[] splitNumbers(String numbers, String divider){ //розбиття рядка
        return numbers.split(divider);
    }
    private static int sum(String[] numList){ //рахунок суми
        int mysum=0;
        String negative=""; //рядок від'ємних чисел
        int l=numList.length;
        for (int i=0 ; i<l ; i++){ //перевірка кожного символа масиву
            if (toInt((numList[i]))<0) { //від'ємний елемент
                if (negative.equals("")) {
                    negative = numList[i];
                }
                else {
                    negative += ("," + numList[i]); //новий рядок з від'ємними елементами
                }
            }
            else if (toInt((numList[i])) <1001){ // числа не більші 1000
                mysum+=toInt((numList[i]));
            }
        }
        if (negative.equals("")){
            return mysum ; //результат обчислень
        }
        else{
            String d=",";
            String nl[] = splitNumbers(negative, d + "|\n"); //розбиття в список від'ємних чисел
            System.out.println("Недозволені від’ємні числа.\nВведені від'ємні числа : "+ Arrays.toString(nl));
            return -1; //умовне позначення
        }

    }
    private static void enter(String name){ //введення
        System.out.println("Введений рядок: "+ name);
        if (add(name)==-1){
            System.out.print("");
        }
        else  {
            System.out.println("Сума : "+ add(name));
        }
        System.out.println("---------------------------------");

    }

    public static void main(String args[]) {

        String name="//[!!!]\n1,1!!!1\n";
        enter(name);
//        String name1="1,\n";
//        enter(name1);
//        String name2="1\n2\n3";
//        enter(name2);
//        String name3="1,99,25";
//        enter(name3);
//        String name4="1,-99,25,-555,0";
//        enter(name4);
//        String name5="//!\n1!2!3";
//        enter(name5);
//        String name6="1\n2\n3,4,5";
//        enter(name6);
//        String name7="//;\n1;2;3";
//        enter(name7);
//        String name8="//@@\n1@@2@@5";
//        enter(name8);
//        String name9="//@;@\n1@;@2@;@5";
//        enter(name9);
//        String name10="//[]\n1*222*33";
//        enter(name10);
//        String name11="//[]\n1*222**33";
//        enter(name11);
//        String name12="//[]\n1*2*@*3";
//        enter(name12);
//        String name13="//[*][;]\n1*222;33";
//        enter(name13);
//        String name14="//[*][;]\n1*222@33";
//        enter(name14);
//        String name15="//[**][;]\n1*222*;33";
//        enter(name15);

    }
}
