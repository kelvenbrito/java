package POOHeranca;

public class Alunos extends Pessoas {
    //atributos especificos
    private int matricula;
    private double mediaSemestre;
    private String curso;
    private String turma;

    @Override
    public String getRg() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setRg(String rg) {
        // TODO Auto-generated method stub
        
    }

    //metodos especificos
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getMediaSemestre() {
        return mediaSemestre;
    }

    public void setMediaSemestre(double mediaSemestre) {
        this.mediaSemestre = mediaSemestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

}
