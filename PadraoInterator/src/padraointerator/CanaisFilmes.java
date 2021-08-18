package padraointerator;

public class CanaisFilmes implements AgregadoDeCanais {

    protected Canal[] canais;

    public CanaisFilmes() {
        canais = new Canal[4];
        canais[0] = new Canal("Cinemax");
        canais[1] = new Canal("CineBrasilTV");
        canais[2] = new Canal("TNT");
        canais[3] = new Canal("Telecine Pipoca");
    }

    @Override
    public IteradorInterface criarIterator() {
        return new IteradorMatrizDeCanais(canais);
    }
}
