package app;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();

        ContaCorrente guilherme = new ContaCorrente(100);
        ContaCorrente matheus = new ContaCorrente(1000);

        contas.add(guilherme);
        contas.add(matheus);
        contas.add(new ContaCorrente(9999));
        jsjsjsjjsj

        System.out.println(contas.size());
        contas.forEach((conta)->System.out.println(conta.getSaldo()));
    }
}