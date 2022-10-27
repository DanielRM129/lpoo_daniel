package model;

public class Pessoa {
    //atributos
    private long id;
    private String corDosOlhos;
    private double altura;
    //Métodos (OU COMPORTAMENTOS)
    //Construtor padrao ou vazio


    public Pessoa() {
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Pessoa(String corDosOlhos, double altura){
        this.corDosOlhos = corDosOlhos;
        this.altura = altura;
    }

    public Pessoa(long id, String corDosOlhos, double altura) {
        this.id = id;
        this.corDosOlhos = corDosOlhos;
        this.altura = altura;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pessoa pessoa = (Pessoa) o;

        return id == pessoa.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    //conversor de objeto para string
    @Override
    public String toString() {
        return "model.Pessoa{" +
                "corDosOlhos='" + corDosOlhos + '\'' +
                ", altura=" + altura +
                '}';
    }
}
