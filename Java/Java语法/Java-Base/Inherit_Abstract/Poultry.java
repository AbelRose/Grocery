package cn.sherlock.Inherit_Abstract;

public abstract class Poultry {

    private String name;
    private String symptom;
    private int age;
    private String illness;

    public Poultry() {
    }

    public Poultry(String name, String symptom, int age, String illness) {
        this.name = name;
        this.symptom = symptom;
        this.age = age;
        this.illness = illness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    @Override
    public String toString() {
        return "Poultry{" +
                "name='" + name + '\'' +
                ", symptom='" + symptom + '\'' +
                ", age=" + age +
                ", illness='" + illness + '\'' +
                '}';
    }

    public abstract void showSymptom();

    public void showMsg(){
        System.out.println("动物种类: "+name);
        System.out.println("症状: "+symptom);
        System.out.println("年龄: "+age);
        System.out.println("病因: "+illness);
    }
}
