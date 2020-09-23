public class Student {
    public int id;
    public String name;
    public String dateOfBirth;
    public String Gender;
    public String nameClass;

    public Student(){

    }

    public Student(int id, String name, String dateOfBirth, String gender, String nameClass) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        Gender = gender;
        this.nameClass = nameClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public String   toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", Gender='" + Gender + '\'' +
                ", nameClass='" + nameClass + '\'' +
                '}';
    }
}
