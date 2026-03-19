class Elevador {
    private int andarAtual;
    private int totalAndares;
    private boolean portaAberta;

    public Elevador(int totalAndares) {
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.portaAberta = false;
    }

    public void subir() {
        if (portaAberta) {
            System.out.println("Feche a porta primeiro!");
        } else if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subiu para o andar " + andarAtual);
        }
    }

    public void descer() {
        if (portaAberta) {
            System.out.println("Feche a porta primeiro!");
        } else if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Desceu para o andar " + andarAtual);
        }
    }

    public void abrirPorta() {
        portaAberta = true;
        System.out.println("Porta aberta");
    }

    public void fecharPorta() {
        portaAberta = false;
        System.out.println("Porta fechada");
    }

    public void mostrarAndar() {
        System.out.println("Andar atual: " + andarAtual);
    }
}