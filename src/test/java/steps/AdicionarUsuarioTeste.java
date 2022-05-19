package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.AdicionarUsuiariosPages;

import java.io.IOException;

public class AdicionarUsuarioTeste {

    AdicionarUsuiariosPages addUsuario = new AdicionarUsuiariosPages();

    @Dado("que esteja com boostrap v4")
    public void que_esteja_com_boostrap_v4() {
        addUsuario.selecionarVersao("Bootstrap V4 Theme");

    }

    @Dado("acione add customer")
    public void acione_add_customer() {
        addUsuario.addUsuario();

    }

    @Quando("salvar o formulario")
    public void salvar_o_formulario() {
        addUsuario.salvar();

    }

    @Entao("validamos mensagem de sucesso")
    public void validamos_mensagem_de_sucesso() throws IOException, InterruptedException {
        addUsuario.validarMensagem("Your data has been successfully stored into the database. ");

    }



}