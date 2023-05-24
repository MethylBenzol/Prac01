package ru.neoflex.prac01;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Макет таблицы
@Entity
@Table(name = "TableTransHistory")//непосредственно название таблицы
public class TableTransHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//генерирует id автоматически
    private long id;

    //Может использоваться для вывода записей в виде строки
    @Override
    public String toString() {
        return "Операция - [ " +
                "id=" + id +
                ", Result='" + Result +"]"+ '\n';
    }

    @Column(name ="Resulting")
    private String Result;

    public TableTransHistory() { }

    public TableTransHistory( String IO) { this.Result = IO ;}



    //свойства полей
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


   public String getFirstName() {
        return Result;
   }
    public void setFirstName(String res) {
    this.Result = res;
   }
}
