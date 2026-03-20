public class Main {
    public static void  main(String[] args) {

        Elevador elevador = new Elevador(0, 10);
        elevador.exibirStatus();

        // Sobe alguns andares
        elevador.subir();
        elevador.subir();
        elevador.subir();

        // Abre e fecha a porta
        elevador.abrirPorta();
        System.out.println("Porta esta aberta? " + elevador.isPortaAberta());

        // Tenta mover com porta aberta (bloqueado)
        elevador.subir();
        elevador.fecharPorta();

        // Vai direto para o andar 8
        elevador.irParaAndar(8);

        // Tenta ir alem do maximo (bloqueado)
        elevador.irParaAndar(15);

        // Desce ate o 0
        elevador.irParaAndar(0);

        // Tenta descer alem do minimo (bloqueado)
        elevador.descer();

        System.out.println("\nAndar atual: " + elevador.getAndarAtual());
        elevador.exibirStatus();
    }
}