package HospitalManagement;

public class Doctor {

        private static int idCounter=1;
        private int id;
        private String name;
        private String speciality;
        private int age;

        public Doctor(String name,String speciality,int age){
            this.id=idCounter++;
            this.name=name;
            this.speciality=speciality;
            this.age=age;
        }

    public int getId() {
        return id;
    }

    public String toString()
        {
            return "Doctor ID"+id+",Name:"+name+",Speciality:"+speciality+",Age:"+age;
        }

    }




