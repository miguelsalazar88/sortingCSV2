package main;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        repartirNums();
        ordenarnums("src/files/split/0to99999.txt");
        ordenarnums("src/files/split/100000to199999.txt");
        ordenarnums("src/files/split/200000to299999.txt");
        ordenarnums("src/files/split/300000to399999.txt");
        ordenarnums("src/files/split/400000to499999.txt");
        ordenarnums("src/files/split/500000to599999.txt");
        ordenarnums("src/files/split/600000to699999.txt");
        ordenarnums("src/files/split/700000to799999.txt");
        ordenarnums("src/files/split/800000to899999.txt");
        ordenarnums("src/files/split/900000to999999.txt");

    }


    public static void repartirNums() {

        //Se importa el archivo a ordenar (.csv) con BufferedReader

        String path = "src/files/numerosRandom.csv"; //CSV
        String linea = ""; //Se crea un string donde se contenrá la nueva linea.

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((linea = br.readLine()) != null) {

                ArrayList<Integer> listaLinea = new ArrayList<>();
                String[] numerosStringLinea = linea.split(",");

                for (int i = 0; i < numerosStringLinea.length; i++) {
                    listaLinea.add(Integer.parseInt(numerosStringLinea[i]));
                }

                //Crear If para cada documento


                for (Integer i : listaLinea) {
                    if (i < 100000) {
                        FileWriter fw = new FileWriter("src/files/split/0to99999.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(String.valueOf(i));
                        bw.newLine();
                        bw.close();
                    } else if (i >= 100000 && i < 200000) {
                        FileWriter fw = new FileWriter("src/files/split/100000to199999.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(String.valueOf(i));
                        bw.newLine();
                        bw.close();
                    } else if (i >= 200000 && i < 300000) {
                        FileWriter fw = new FileWriter("src/files/split/200000to299999.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(String.valueOf(i));
                        bw.newLine();
                        bw.close();
                    } else if (i >= 300000 && i < 400000) {
                        FileWriter fw = new FileWriter("src/files/split/300000to399999.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(String.valueOf(i));
                        bw.newLine();
                        bw.close();
                    } else if (i >= 400000 && i < 500000) {
                        FileWriter fw = new FileWriter("src/files/split/400000to499999.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(String.valueOf(i));
                        bw.newLine();
                        bw.close();
                    } else if (i >= 500000 && i < 600000) {
                        FileWriter fw = new FileWriter("src/files/split/500000to599999.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(String.valueOf(i));
                        bw.newLine();
                        bw.close();
                    } else if (i >= 600000 && i < 700000) {
                        FileWriter fw = new FileWriter("src/files/split/600000to699999.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(String.valueOf(i));
                        bw.newLine();
                        bw.close();
                    } else if (i >= 700000 && i < 800000) {
                        FileWriter fw = new FileWriter("src/files/split/700000to799999.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(String.valueOf(i));
                        bw.newLine();
                        bw.close();
                    } else if (i >= 800000 && i < 900000) {
                        FileWriter fw = new FileWriter("src/files/split/800000to899999.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(String.valueOf(i));
                        bw.newLine();
                        bw.close();
                    } else if (i >= 900000) {
                        FileWriter fw = new FileWriter("src/files/split/900000to999999.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(String.valueOf(i));
                        bw.newLine();
                        bw.close();
                    }
                }


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void ordenarnums(String path) throws FileNotFoundException {

        String linea = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            ArrayList<Integer> listaNums = new ArrayList<>();

            while ((linea = br.readLine()) != null) {

                Integer lineaInt = Integer.parseInt(linea);
                listaNums.add(lineaInt);
            }

            Collections.sort(listaNums);

            FileWriter fw = new FileWriter("src/files/resultado/resultado.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Integer i: listaNums) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }

            bw.close();




        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}