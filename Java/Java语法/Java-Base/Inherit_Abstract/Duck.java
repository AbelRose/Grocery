package cn.sherlock.Inherit_Abstract;

public class Duck extends Poultry {
    public Duck() {
    }

    public Duck(String name, String symptom, int age, String illness) {
        super(name, symptom, age, illness);
    }

    @Override
    public void showSymptom() {
        System.out.println("症状: "+getIllness());//调用getIllness 方法就可以
    }
}
