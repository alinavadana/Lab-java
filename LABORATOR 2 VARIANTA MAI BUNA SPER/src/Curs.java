
public class Curs {
    String nume;
    String descriere;
    Profesor profu;
    Student[] studenti;
    public Curs(String nume, String descriere,
                Profesor profu, Student[] studenti)
    {
        this.nume = nume;
        this.descriere = descriere;
        this.profu = profu;
        this.studenti = studenti;
    }
    //ADAUGA PROFESOR
    public void UpdateProfesor(Profesor profu)
    {
        this.profu = profu;
    }

    //STERGE PROFESOR
    public void StergeProfesor()
    {
        this.profu.nume="";
        this.profu.prenume="";
    }
    //ADAUGARE STUDENT
    public void AddStudent(Student student)
    {
        //lucrand cu array trebuie inserat folosind un sir auxiliar
        int noualungime = studenti.length+1;
        Student[] aux = new Student[noualungime];
        int index =0;
        for(Student s : studenti)
        {
            aux[index++] = s;
        }
        //la final adaugam noul student pe ultimul index
        aux[index] = student;
        //si realocam lista de studenti cu aux;
        this.studenti = new Student[noualungime];
        System.arraycopy(aux, 0, studenti, 0, noualungime);
    }

    //STERGE STUDENT
    public void StergeStudent(Student student)
    {
        int noualungime=studenti.length-1;
        Student[] aux=new Student[noualungime];
        int index=0;
        for (Student s : studenti)
            if (s!=student)
                aux[index++]=s;
        this.studenti=new Student[noualungime];
        System.arraycopy(aux,  0,  studenti, 0, noualungime);
    }
    //MODIFICARE STUDENT
    public void ModificaStudent(Student student, Student s1)
    {
        for (Student s : studenti)
            if (s==student)
                s=s1;
    }

    @Override
    public String toString() {
        String str = "Curs: " + "nume=" + nume + ",";
        descriere=" + descriere + ";String nprofu = " + profu +" ;

        for(Student s : studenti)
        {
            str+= s + "\n";
        }
        return str;
    }
    //RAPORTARE STUDENTI
    public void RaporteazaStudenti()
    {
        for (Student s : studenti)
            System.out.println(s);
    }
}
