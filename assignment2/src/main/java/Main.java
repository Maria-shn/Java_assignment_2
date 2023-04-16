/**
 * 346172604 Mariia Shaposhnikova
 * ID Karen Livni
 */
public class Main{
    public static void main (String[] args){
        Manager<Patient> man = new Manager();
        addPatientsToManager(man);
        simulateOnlyByPriority(man);
        Manager<Patient> secondManager = new Manager();
        addPatientsToManager(secondManager);
        simulateOnlyByCreation(secondManager);
    }

    public static void addPatientsToManager(Manager<Patient> manager){
        Patient Billy = new Patient(10, true);
        manager.add(Billy);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.err.println("interruption occured");
        }
        Patient Gilly = new Patient(2, false);
        manager.add(Gilly);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.err.println("interruption occured");
        }
        Patient Willy = new Patient(1, false);
        manager.add(Willy);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.err.println("interruption occured");
        }
        Patient Dilly = new Patient(1, true);
        manager.add(Dilly);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.err.println("interruption occured");
        }
        Patient Lilly = new Patient(3, true);
        manager.add(Lilly);
        

    }

    public static void simulateOnlyByPriority(Manager<Patient> manager){
        int length = manager.getSize();
        while(length>0){
            Patient myPatient = manager.getByPriority();
            System.out.println("id:" + myPatient.getId() + "\n" + "vip: " + myPatient.isVip() + "\n" + "priority: " + myPatient.getPriority());
            length--;
        }
    }
     public static void simulateOnlyByCreation(Manager<Patient> manager){
        int length = manager.getSize();
        while(length>0){
            Patient myPatient = manager.getByCreationTime();
            System.out.println("id:" + myPatient.getId() + "\n" + "vip: " + myPatient.isVip() + "\n" + "priority: " + myPatient.getPriority());
            length--;
        }
    }


}
