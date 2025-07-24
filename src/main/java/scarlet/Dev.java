package scarlet;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {private String nome;
    private Set<Conteudo> conteudosInscritos =  new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidas= new LinkedHashSet<>();
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudoSet());
        bootcamp.getDevsInscritos().add(this);
    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidas.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());

        }
        else {
            System.out.println("Você não está matriculado em nenhum conteúdo");

        }
    }
    public double calcularTotalXp(){
        this.conteudosConcluidas
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();

        return 0;
    }

    public Set<Conteudo> getConteudosConcluidas() {
        return conteudosConcluidas;
    }

    public void setConteudosConcluidas(Set<Conteudo> conteudosConcluidas) {
        this.conteudosConcluidas = conteudosConcluidas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidas, dev.conteudosConcluidas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidas);
    }
}
