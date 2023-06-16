package org.bref;

public class Hilos {

    public static void main(String[]args) {

        HiloNumeroLetras h1 = new HiloNumeroLetras(1);
        HiloNumeroLetras h2 = new HiloNumeroLetras(2);

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        t1.start();
        t2.start();

    }
}

class HiloNumeroLetras implements Runnable {
    private int tipo;

    public  HiloNumeroLetras(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        while(true) {
            switch (tipo) {
                case 1:
                    for (int i = 1; i < 30; i++) {
                        System.out.println(i);
                    }
                    break;
                case 2:
                    for(char c = 'a'; c < 'z'; c++) {
                        System.out.println(c);
                    }
                    break;
            }
        }
    }

}
