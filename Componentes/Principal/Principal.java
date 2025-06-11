package IphoneUML.Componentes.Principal;

import IphoneUML.Iphone;

public class Principal {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.atender();
        iphone.tocar();
        iphone.exibirPagina();

    }

}