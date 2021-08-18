package padraointerator;

import java.util.ArrayList;

public class CanaisEsportes implements AgregadoDeCanais {

    protected ArrayList<Canal> canais;

    public CanaisEsportes() {
        canais = new ArrayList<Canal>();
        canais.add(new Canal("Globo Esporte"));
        canais.add(new Canal("Esporte espetacular"));
        canais.add(new Canal("Brasileirão"));
        canais.add(new Canal("Liberatores"));
        canais.add(new Canal("Champions League"));
    }

    @Override
    public IteradorListaDeCanais criarIterator() {
        return new IteradorListaDeCanais(canais);
    }

}
