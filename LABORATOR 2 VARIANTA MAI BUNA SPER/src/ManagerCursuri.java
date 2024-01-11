
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ManagerCursuri {
    Curs[] cursuri;
    public ManagerCursuri()
    {
        Connection conn = null;
        cursuri = new Curs[0];
    }

    //ADAUGARE CURS
    public void AddCurs(Curs curs) {
        int noualungime = cursuri.length + 1;
        Curs[] aux = new Curs[noualungime];
        int index = 0;
        for (Curs c : cursuri) {
            aux[index++] = c;
        }
        //la final adaugam noul curs pe ultimul index
        aux[index] = curs;
        //si realocam lista de curs cu aux;
        this.cursuri = new Curs[noualungime];
        System.arraycopy(aux, 0, cursuri, 0, noualungime);
    }

    //STERGE CURS
    public void StergereCurs(Curs curs) {
        int noualungime = this.cursuri.length - 1;
        Curs[] aux = new Curs[noualungime];
        int index = 0;
        for (Curs c : cursuri)
            if (c != curs)
                aux[index++] = c;
        this.cursuri = new Curs[noualungime];
        System.arraycopy(aux, 0, cursuri, 0, noualungime);
    }

    //AFISEAZA CURS
    public void AfiseazaCursuriLaConsola() {
        for (Curs c : cursuri)
            System.out.println(c);
    }

    //MODIFICA CURS
    public void ModificaCurs(Curs curs, Curs curs1) {
        for (Curs c : cursuri)
            if (c == curs)
                c = curs1;
    }

    //RAPORTEAZA CURSURI
    public void RaporteazaCursuri() {
        for (Curs c : cursuri)
            System.out.println(c);
    }
}
