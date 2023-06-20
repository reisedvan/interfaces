package interfaces;

import interfaces.view.CadastroProdutoView;
import interfaces.view.MenuView;

public class Interfaces {

    
    
    private static CadastroProdutoView telaCadastro;
    private static MenuView telaMenu;

    public static void main(String[] args) {
       navegarMenu();
    }
    
    
    public static void navegarCadastro() {
        if (telaCadastro == null) {
            telaCadastro = new CadastroProdutoView();
        }
        telaCadastro.setVisible(true);
    }

    public static void ocultarCadastro() {
        if (telaCadastro == null) {
            telaCadastro = new CadastroProdutoView();
        }
        telaCadastro.setVisible(false);
    }

    public static void navegarMenu() {
        if (telaMenu == null) {
            telaMenu = new MenuView();
        }
        telaMenu.setVisible(true);
    }

    public static void ocultarMenu() {
        if (telaMenu == null) {
            telaMenu = new MenuView();
        }
        telaMenu.setVisible(false);
    }


}
