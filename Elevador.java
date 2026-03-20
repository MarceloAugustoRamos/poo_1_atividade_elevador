public class Elevador {

    private int andarAtual;
    private final int andarMinimo;
    private final int andarMaximo;
    private boolean portaAberta;


    public Elevador(int andarMinimo, int andarMaximo) {
        if (andarMinimo >= andarMaximo) {
            throw new IllegalArgumentException("O andar mínimo deve ser menor que o andar máximo.");
        }
        this.andarMinimo = andarMinimo;
        this.andarMaximo = andarMaximo;
        this.andarAtual = andarMinimo;
        this.portaAberta = false;
    }

    public void subir() {
        if (portaAberta) {
            System.out.println("Nao e possivel subir com a porta aberta.");
            return;
        }
        if (andarAtual >= andarMaximo) {
            System.out.println("Ja estamos no ultimo andar (" + andarMaximo + ").");
            return;
        }
        andarAtual++;
        System.out.println("Subindo... Andar atual: " + andarAtual);
    }

    public void descer() {
        if (portaAberta) {
            System.out.println("Nao e possivel descer com a porta aberta.");
            return;
        }
        if (andarAtual <= andarMinimo) {
            System.out.println("Ja estamos no andar minimo (" + andarMinimo + ").");
            return;
        }
        andarAtual--;
        System.out.println("Descendo... Andar atual: " + andarAtual);
    }


    public void irParaAndar(int andar) {
        if (portaAberta) {
            System.out.println("Feche a porta antes de se mover.");
            return;
        }
        if (andar < andarMinimo || andar > andarMaximo) {
            System.out.println("Andar " + andar + " invalido. Disponivel: " + andarMinimo + " a " + andarMaximo);
            return;
        }
        System.out.println("Indo do andar " + andarAtual + " para o andar " + andar + "...");
        andarAtual = andar;
        System.out.println("Chegou ao andar: " + andarAtual);
    }


    public void abrirPorta() {
        if (portaAberta) {
            System.out.println("A porta ja esta aberta.");
            return;
        }
        portaAberta = true;
        System.out.println("Porta aberta.");
    }


    public void fecharPorta() {
        if (!portaAberta) {
            System.out.println("A porta ja esta fechada.");
            return;
        }
        portaAberta = false;
        System.out.println("Porta fechada.");
    }


    public boolean isPortaAberta() {
        return portaAberta;
    }


    public int getAndarAtual() {
        return andarAtual;
    }


    public void exibirStatus() {
        System.out.println("Status do Elevador");
        System.out.println("  Andar atual : " + andarAtual);
        System.out.println("  Andares     : " + andarMinimo + " a " + andarMaximo);
        System.out.println("  Porta       : " + (portaAberta ? "Aberta" : "Fechada"));

    }

}
