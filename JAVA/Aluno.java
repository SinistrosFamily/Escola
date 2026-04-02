public class Aluno {
    int age;
    String name, dataNascimento;
    Aluno (int age, String name, String dataNascimento){
        this.age=age;
        this.name=name;
        this.dataNascimento=dataNascimento;
    }
    void AlterarNome(String name){this.name=name;}
    String RecuperarNome(String name){return this.name=name;}
    void printInfo(){System.out.printf("\n%s \n%d \n%s \n",name,age,dataNascimento);}

}